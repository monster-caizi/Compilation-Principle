// Syntactic analysisDlg.cpp : implementation file
//

#include "stdafx.h"

#include "globals.h"
#include "parse.h"
#include "scan.h"
#include "util.h"
#include "Syntactic analysis.h"
#include "Syntactic analysisDlg.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#undef THIS_FILE
static char THIS_FILE[] = __FILE__;
#endif


int lineno = 0;
FILE * source;
FILE * listing;


int EchoSource = TRUE;
int TraceScan = TRUE;
int TraceParse = TRUE;


int Error1 = FALSE;

TreeNode * syntaxTree1;

/////////////////////////////////////////////////////////////////////////////
// CAboutDlg dialog used for App About

class CAboutDlg : public CDialog
{
public:
	CAboutDlg();

// Dialog Data
	//{{AFX_DATA(CAboutDlg)
	enum { IDD = IDD_ABOUTBOX };
	//}}AFX_DATA

	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CAboutDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:
	//{{AFX_MSG(CAboutDlg)
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};

CAboutDlg::CAboutDlg() : CDialog(CAboutDlg::IDD)
{
	//{{AFX_DATA_INIT(CAboutDlg)
	//}}AFX_DATA_INIT
}

void CAboutDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	//{{AFX_DATA_MAP(CAboutDlg)
	//}}AFX_DATA_MAP
}

BEGIN_MESSAGE_MAP(CAboutDlg, CDialog)
	//{{AFX_MSG_MAP(CAboutDlg)
		// No message handlers
	//}}AFX_MSG_MAP
END_MESSAGE_MAP()

/////////////////////////////////////////////////////////////////////////////
// CSyntacticanalysisDlg dialog

CSyntacticanalysisDlg::CSyntacticanalysisDlg(CWnd* pParent /*=NULL*/)
	: CDialog(CSyntacticanalysisDlg::IDD, pParent)
{
	//{{AFX_DATA_INIT(CSyntacticanalysisDlg)
	m_InputArea = _T("");
	m_OutputArea = _T("");
	//}}AFX_DATA_INIT
	// Note that LoadIcon does not require a subsequent DestroyIcon in Win32
	m_hIcon = AfxGetApp()->LoadIcon(IDR_MAINFRAME);
}

void CSyntacticanalysisDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	//{{AFX_DATA_MAP(CSyntacticanalysisDlg)
	DDX_Text(pDX, IDC_EDIT1, m_InputArea);
	DDX_Text(pDX, IDC_EDIT2, m_OutputArea);
	//}}AFX_DATA_MAP
}

BEGIN_MESSAGE_MAP(CSyntacticanalysisDlg, CDialog)
	//{{AFX_MSG_MAP(CSyntacticanalysisDlg)
	ON_WM_SYSCOMMAND()
	ON_WM_PAINT()
	ON_WM_QUERYDRAGICON()
	ON_BN_CLICKED(IDC_BUTTON1, OnButton1)
	ON_BN_CLICKED(IDC_BUTTON2, OnButton2)
	ON_BN_CLICKED(IDC_BUTTON3, OnButton3)
	//}}AFX_MSG_MAP
END_MESSAGE_MAP()

/////////////////////////////////////////////////////////////////////////////
// CSyntacticanalysisDlg message handlers

BOOL CSyntacticanalysisDlg::OnInitDialog()
{
	CDialog::OnInitDialog();

	// Add "About..." menu item to system menu.

	// IDM_ABOUTBOX must be in the system command range.
	ASSERT((IDM_ABOUTBOX & 0xFFF0) == IDM_ABOUTBOX);
	ASSERT(IDM_ABOUTBOX < 0xF000);

	CMenu* pSysMenu = GetSystemMenu(FALSE);
	if (pSysMenu != NULL)
	{
		CString strAboutMenu;
		strAboutMenu.LoadString(IDS_ABOUTBOX);
		if (!strAboutMenu.IsEmpty())
		{
			pSysMenu->AppendMenu(MF_SEPARATOR);
			pSysMenu->AppendMenu(MF_STRING, IDM_ABOUTBOX, strAboutMenu);
		}
	}

	// Set the icon for this dialog.  The framework does this automatically
	//  when the application's main window is not a dialog
	SetIcon(m_hIcon, TRUE);			// Set big icon
	SetIcon(m_hIcon, FALSE);		// Set small icon
	
	// TODO: Add extra initialization here
	
	return TRUE;  // return TRUE  unless you set the focus to a control
}

void CSyntacticanalysisDlg::OnSysCommand(UINT nID, LPARAM lParam)
{
	if ((nID & 0xFFF0) == IDM_ABOUTBOX)
	{
		CAboutDlg dlgAbout;
		dlgAbout.DoModal();
	}
	else
	{
		CDialog::OnSysCommand(nID, lParam);
	}
}

// If you add a minimize button to your dialog, you will need the code below
//  to draw the icon.  For MFC applications using the document/view model,
//  this is automatically done for you by the framework.

void CSyntacticanalysisDlg::OnPaint() 
{
	if (IsIconic())
	{
		CPaintDC dc(this); // device context for painting

		SendMessage(WM_ICONERASEBKGND, (WPARAM) dc.GetSafeHdc(), 0);

		// Center icon in client rectangle
		int cxIcon = GetSystemMetrics(SM_CXICON);
		int cyIcon = GetSystemMetrics(SM_CYICON);
		CRect rect;
		GetClientRect(&rect);
		int x = (rect.Width() - cxIcon + 1) / 2;
		int y = (rect.Height() - cyIcon + 1) / 2;

		// Draw the icon
		dc.DrawIcon(x, y, m_hIcon);
	}
	else
	{
		CDialog::OnPaint();
	}
}

// The system calls this to obtain the cursor to display while the user drags
//  the minimized window.
HCURSOR CSyntacticanalysisDlg::OnQueryDragIcon()
{
	return (HCURSOR) m_hIcon;
}

void CSyntacticanalysisDlg::OnButton1() 
{
	// TODO: Add your control notification handler code here
	UpdateData(TRUE); 
	FILE * saveOut ;
	saveOut = fopen("myTest.TNY","w");
	if(saveOut == NULL)
	{
		MessageBox("myTest.TNY文件打开失败！","警告",MB_ICONERROR);
		return ;
	}

	int mdata = m_InputArea.GetLength();
	char * myData = m_InputArea.GetBuffer(mdata);
	char data;
	char data2[2] = {'\0','\0'};
	bool flag1 = false,flag2 = true;
	for(int i =0;i<mdata;i++)
	{	
		data = myData[i];
		data2[0] = data;
		if(flag2)
			if(data == '\n')
				flag1 = true;
		if(data == '\r')
		{	
			if(flag1)
				i++;
			flag2 = false;
			continue;
		}
		if(data =='%')
			fprintf(saveOut,"%%");
		else
			fprintf(saveOut,data2);
	}
	fclose(saveOut);
	
	UpdateData(FALSE);
	MessageBox("文件已成功保存于myTest.TNY中！","提示",MB_ICONEXCLAMATION);
	return ;
}

void CSyntacticanalysisDlg::OnButton2() 
{
	// TODO: Add your control notification handler code here

	UpdateData(TRUE); 
	FILE * saveIn ;
	saveIn = fopen("myTest.TNY","r");
	if (saveIn==NULL)
	{ 
		MessageBox("myTest.TNY 文件打开失败！","警告",MB_ICONERROR);
		//fprintf(stderr,"myTest.TNY 文件打开失败！ ");
		exit(1);
	}
	char account[1024];
	string data="";
	while(fgets(account,1023,saveIn))   /*file_p是文件标识符*/
	{
		data =data+ account+"\r\n";
	}
	m_InputArea.Format("%s",data.c_str());
	UpdateData(FALSE);
	return ;
}

void CSyntacticanalysisDlg::OnButton3() 
{
	// TODO: Add your control notification handler code here

	lineno = 0;
	EchoSource = TRUE;
	TraceScan = TRUE;
	TraceParse = TRUE;
	Error1 = FALSE;
	
	UpdateData(FALSE);
	
	//if(syntaxTree1!=NULL)
	//	deleteTree(syntaxTree1);

	//MessageBox("源代码文件已成功保存于myTest.TNY中！","提示",MB_ICONEXCLAMATION);
	TreeNode * syntaxTree;
	source = fopen("myTest.TNY","r");
	if (source==NULL)
	{ 
		MessageBox("myTest.TNY 文件打开失败！","警告",MB_ICONERROR);
		//fprintf(stderr,"myTest.TNY 文件打开失败！ ");
		exit(1);
	}
	listing=fopen("Syntax_tree.txt","w+");
	syntaxTree = parse();//语法分析
	if (TraceParse) 
	{
		fprintf(listing,"\nSyntax tree:\n");
		printTree(syntaxTree);//打印语法树
	}
	fclose(source);
	fclose(listing);
	//syntaxTree1 =syntaxTree;
	deleteTree(syntaxTree);

	FILE * TreeIn ;
	TreeIn = fopen("Syntax_tree.txt","r");
	if (TreeIn==NULL)
	{ 
		MessageBox("myTest.TNY 文件打开失败！","警告",MB_ICONERROR);
		//fprintf(stderr,"myTest.TNY 文件打开失败！ ");
		exit(1);
	}
	char account[1024];
	string mmdata="";
	while(fgets(account,1023,TreeIn))   /*file_p是文件标识符*/
	{
		mmdata =mmdata+ account+"\r\n";
	}
	m_OutputArea.Format("%s",mmdata.c_str());
	UpdateData(FALSE);
	MessageBox("源代码文件已成功保存于myTest.TNY中,语法树保存于Syntax_tree.txt中！","提示",MB_ICONEXCLAMATION);
	//UpdateData(FALSE);
}
void CSyntacticanalysisDlg::deleteTree(TreeNode * root)
{
	for(int i = 0;i<3 ; i++)
	{
		if(root->child[i]!= NULL)
		deleteTree(root->child[i]);
	}
	if(root->sibling!=NULL)
		deleteTree(root->sibling);
	delete root;
}
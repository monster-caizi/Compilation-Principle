// CompilingTestDlg.cpp : implementation file
//

#include "stdafx.h"
#include "CompilingTest.h"
#include "CompilingTestDlg.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#undef THIS_FILE
static char THIS_FILE[] = __FILE__;
#endif

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
// CCompilingTestDlg dialog

CCompilingTestDlg::CCompilingTestDlg(CWnd* pParent /*=NULL*/)
	: CDialog(CCompilingTestDlg::IDD, pParent)
{
	//{{AFX_DATA_INIT(CCompilingTestDlg)
	m_InputArea = _T("");
	m_OutputArea = _T("");
	//}}AFX_DATA_INIT
	// Note that LoadIcon does not require a subsequent DestroyIcon in Win32
	m_hIcon = AfxGetApp()->LoadIcon(IDR_MAINFRAME);
}

void CCompilingTestDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	//{{AFX_DATA_MAP(CCompilingTestDlg)
	DDX_Text(pDX, IDC_EDIT1, m_InputArea);
	DDX_Text(pDX, IDC_EDIT2, m_OutputArea);
	//}}AFX_DATA_MAP
}

BEGIN_MESSAGE_MAP(CCompilingTestDlg, CDialog)
	//{{AFX_MSG_MAP(CCompilingTestDlg)
	ON_WM_SYSCOMMAND()
	ON_WM_PAINT()
	ON_WM_QUERYDRAGICON()
	ON_BN_CLICKED(IDC_BUTTON1, OnButton1)
	ON_BN_CLICKED(IDC_BUTTON2, OnButton2)
	ON_BN_CLICKED(IDC_BUTTON3, OnButton3)
	//}}AFX_MSG_MAP
END_MESSAGE_MAP()

/////////////////////////////////////////////////////////////////////////////
// CCompilingTestDlg message handlers

BOOL CCompilingTestDlg::OnInitDialog()
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
	Initialize();
	return TRUE;  // return TRUE  unless you set the focus to a control
}

void CCompilingTestDlg::OnSysCommand(UINT nID, LPARAM lParam)
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

void CCompilingTestDlg::OnPaint() 
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
HCURSOR CCompilingTestDlg::OnQueryDragIcon()
{
	return (HCURSOR) m_hIcon;
}

void CCompilingTestDlg::OnButton1() 
{
	// TODO: Add your control notification handler code here
	UpdateData(TRUE); 
	ofstream  Saveout("myTest.cpp",ios::out);
	if(!Saveout)
	{
		MessageBox("Test.cpp文件打开失败！","警告",MB_ICONERROR);
		return ;
	}
	Saveout<<(LPCTSTR)m_InputArea;
	MessageBox("文件已成功保存于Test.cpp中！","提示",MB_ICONEXCLAMATION);
	Saveout.close();
	UpdateData(FALSE);
}

void CCompilingTestDlg::OnButton2() 
{
	// TODO: Add your control notification handler code here
	string mydata;
	const int LINE_LENGTH = 100; 
    char str[LINE_LENGTH];  
	UpdateData(TRUE); 
	ofstream  Saveout("myTest.cpp",ios::out);
	if(!Saveout)
	{
		MessageBox("myTest.cpp文件打开失败！","警告",MB_ICONERROR);
		return ;
	}
	Saveout<<(LPCTSTR)m_InputArea;
	//MessageBox("文件已成功保存于myTest.txt中！","提示",MB_ICONEXCLAMATION);
	Saveout.close();

	DealWith1();//调用处理函数

	ifstream  outputResult("myResult1.txt",ios::in);
	if(!outputResult)
	{
		MessageBox("myResult1.txt文件打开失败！","警告",MB_ICONERROR);
		return ;
	}
	m_OutputArea=_T("");
	while(!outputResult.eof())
	{
		outputResult.getline(str,LINE_LENGTH);
		mydata=mydata+str+"\r\n";
	}
	m_OutputArea.Format("%s",mydata.c_str());
	MessageBox("CPP文件已成功保存于myTest.cpp中，编译文件已成功保存于myResult1.txt中，并显示于右侧编辑框中！","提示",MB_ICONEXCLAMATION);
	outputResult.close();

	UpdateData(FALSE);
}


void CCompilingTestDlg::OnButton3() 
{
	// TODO: Add your control notification handler code here
	string mydata;
	const int LINE_LENGTH = 100; 
    char str[LINE_LENGTH];  
	UpdateData(TRUE); 
	ofstream  Saveout("myTest.cpp",ios::out);
	if(!Saveout)
	{
		MessageBox("myTest.cpp文件打开失败！","警告",MB_ICONERROR);
		return ;
	}
	Saveout<<(LPCTSTR)m_InputArea;
	//MessageBox("文件已成功保存于myTest.txt中！","提示",MB_ICONEXCLAMATION);
	Saveout.close();

	DealWith2();//调用处理函数

	ifstream  outputResult("myResult2.txt",ios::in);
	if(!outputResult)
	{
		MessageBox("myResult2.txt文件打开失败！","警告",MB_ICONERROR);
		return ;
	}
	m_OutputArea=_T("");
	while(!outputResult.eof())
	{
		outputResult.getline(str,LINE_LENGTH);
		mydata=mydata+str+"\r\n";
	}
	m_OutputArea.Format("%s",mydata.c_str());
	MessageBox("CPP文件已成功保存于myTest.cpp中，编译文件已成功保存于myResult2.txt中，并显示于右侧编辑框中！","提示",MB_ICONEXCLAMATION);
	outputResult.close();

	UpdateData(FALSE);
}





void CCompilingTestDlg::Initialize()
{
	int i;
	string  myKeyword[] = {"asm","auto","bool","break","case","catch","char","class","const","const_cast",
					"continue","default","delete","do","double","dynamic_cast","else","enum","explicit","export",
					"extern","false","float","for","friend","goto","if","inline","int","long",
					"mutable","namespace","new","operator","private","protected","public","register","reinterpret_cast","return",
					"short","signed","sizeof","static","static_cast","struct","switch","template","this","throw",
					"true","try","typedef","typeid","typename","union","unsigned","using","virtual","void",
					"volatile","wchar_t","while","cout","cin","main","define","include"};//关键字
	string  mySignword[] = {"+","-","*","/","%","++","--",">","<","==",
							">=","<=","!=","&&","||","!","<<",">>","&","|",
							"^","~","=","?",":",",","sizeof","(",")","{",
							"}",".","->","[","]","+=","-=","*=","/=","#",
							";","::","\"","/*","*/","//"};//特殊字符
							//"\a","\n","\t","\b"}; 
	for(i=0;i<68;i++)
	{
		myKeymap[myKeyword[i]]=i;
	}
	for(i=0;i<46;i++)
	{
		mySignmap[mySignword[i]]=i;
	}
	return ;
}
void CCompilingTestDlg::DealWith1()
{
	ifstream in("myTest.cpp", ios::in);
	ofstream out("myResult1.txt", ios::out);
	if(!in | !out)
	{
		MessageBox("文件打开失败！","警告",MB_ICONERROR);
		return ;
	}
	char ch;
	string mystring="",mySign="",string1,recordSign,recordKey,mySign1;
	int flag=-1,recordSign1=-1,recordNumber=-1;
	while(in.get(ch))
	{
		if(ch==' '||ch=='\n')
		{
			if(mySign!="")
			{
				if(mySignmap.find(mySign)!=mySignmap.end())
				{
					out<<mySign<<"   "<<"特殊符号\n";
				}
				mySign="";
			}
			if(mystring!="")
			{
				if(mystring!="sizeof")
					if(myKeymap.find(mystring)!=myKeymap.end())
						out<<mystring<<"   "<<"关键字\n";
					else
					{
						if(recordKey=="include")
							out<<mystring<<"   "<<"关键字\n";
						else
							if(recordNumber==-1)
								out<<mystring<<"   "<<"标识符\n";
							else
								out<<mystring<<"   "<<"数字\n";
					}
				else
					out<<mystring<<"   "<<"特殊符号\n";
				mystring="";
				recordNumber=-1;
			}
			if(ch=='\n')
			{
				recordSign="";
				recordKey="";
				recordSign1=-1;
			}
			continue ;
		}
			
		if((ch>=48&&ch<=57)||(ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==95||ch=='.')
		{
			
			if(recordSign1==1)
			{
				mystring=mystring+mySign;
				mySign="";
				mystring=mystring+ch;
				continue ;
			}
			if((mystring==""&&(ch>=48&&ch<=57))||(recordNumber==1&&(ch>=48&&ch<=57))||(recordNumber==1&&(ch=='.'))||(recordNumber==1&&(ch=='e'))||(recordNumber==1&&(ch=='E')))
				recordNumber=1;
			else 
				recordNumber=-1;
			if(ch=='.'&&recordNumber==-1)
			{
				mySign=mySign+ch;
				if(mystring!="")
				{
					if(recordSign1==1)
						continue ;
					if(mystring!="sizeof")
						if(myKeymap.find(mystring)!=myKeymap.end())
							out<<mystring<<"   "<<"关键字\n";
						else
							out<<mystring<<"   "<<"标识符\n";
					else
						out<<mystring<<"   "<<"特殊符号\n";
					mystring="";
					recordNumber=-1;
				}
				continue ; 
			}
			mystring=mystring+ch;
			if(mySign!="")
			{
				if(mySignmap.find(mySign)!=mySignmap.end())
				{
					out<<mySign<<"   "<<"特殊符号\n";
				}
				mySign="";

			}
			
		}
		else
		{
			
			if(ch=='<'||ch=='>')
			{
				if(recordKey=="include")
				{
					if(mystring!="")
						out<<mystring<<"   "<<"关键字\n";
					mystring="";
					recordNumber=-1;
					out<<ch<<"   "<<"特殊符号\n";
					recordSign1=-recordSign1;
					continue ;
				}
			}
			if(ch=='\"'||ch == '\'')
			{
				if(recordKey=="include"&&ch=='\"')
				{
					if(mystring!="")
						out<<mystring<<"   "<<"关键字\n";
					mystring="";
					recordNumber=-1;
					out<<ch<<"   "<<"特殊符号\n";
					recordSign1=-recordSign1;
					continue ;
				}
				else
				{
					if(mySign!="")
					{
						if(mySignmap.find(mySign)!=mySignmap.end())
						{
							out<<mySign<<"   "<<"特殊符号\n";
						}
						mySign="";
					}
					flag=-flag;
					if(flag==-1&&ch=='\"')
					{
						string1='\"'+mystring+'\"';
						mystring="";
						recordNumber=-1;
						out<<string1<<"   "<<"字符串\n";
					}
					if(flag==-1&&ch=='\'')
					{
						string1='\''+mystring+'\'';
						mystring="";
						recordNumber=-1;
						out<<string1<<"   "<<"单字符\n";
					}
				}
			}
			else
			{
				mySign1=mySign+ch;
				if(mySignmap.find(mySign1)==mySignmap.end())
				//if(mySign1!="//"&&mySign1!="/*"&&mySign1!="*/")
					if(mySign!="")
					{
						if(mySignmap.find(mySign)!=mySignmap.end())
						{
							out<<mySign<<"   "<<"特殊符号\n";
						}
						mySign="";
					}
				mySign=mySign+ch;
			}
			if(mystring!="")
			{
				if(recordSign1==1)
					continue ;
				if(mystring!="sizeof")
					if(myKeymap.find(mystring)!=myKeymap.end())
						out<<mystring<<"   "<<"关键字\n";
					else
						if(recordNumber==-1)
							out<<mystring<<"   "<<"标识符\n";
						else
							out<<mystring<<"   "<<"数字\n";
				else
					out<<mystring<<"   "<<"特殊符号\n";
				mystring="";
				recordNumber=-1;
			}
		}
		if(mySign=="#")
			recordSign=mySign;
		if(recordSign == "#" && mystring == "include")
		{
			recordKey=mystring;
			recordSign="";
		}
	}
	if(mySign!="")
	{
		if(mySignmap.find(mySign)!=mySignmap.end())
		{
			out<<mySign<<"   "<<"特殊符号\n";
		}

		mySign="";
	}
	if(mystring!="")
	{
		if(mystring!="sizeof")
			if(myKeymap.find(mystring)!=myKeymap.end())
				out<<mystring<<"   "<<"关键字\n";
			else
				out<<mystring<<"   "<<"标识符\n";
		else
			out<<mystring<<"   "<<"特殊符号\n";
		mystring="";
		recordNumber=-1;
	}
	in.close();
	out.close();
	return ;
}
void CCompilingTestDlg::DealWith2()
{
	ifstream in("myTest.cpp", ios::in);
	ofstream out("myResult2.txt", ios::out);
	if(!in | !out)
	{
		MessageBox("文件打开失败！","警告",MB_ICONERROR);
		return ;
	}
	char ch,ch1;
	string mystring="",mySign="",string1,recordSign,recordKey,mySign1,ch2;
	int flag=-1,recordSign1=-1,recordNumber=-1;
	while(in.get(ch))
	{
		if(ch==' '||ch=='\n')
		{
			if(mySign!="")
			{
				if(mySignmap.find(mySign)!=mySignmap.end())
				{
					out<<mySign<<"   "<<"特殊符号\n";
				}
				mySign="";
			}
			if(mystring!="")
			{
				if(mystring!="sizeof")
					if(myKeymap.find(mystring)!=myKeymap.end())
						out<<mystring<<"   "<<"关键字\n";
					else
					{
						if(recordKey=="include")
							out<<mystring<<"   "<<"关键字\n";
						else
							if(recordNumber==-1)
								out<<mystring<<"   "<<"标识符\n";
							else
								out<<mystring<<"   "<<"数字\n";
					}
				else
					out<<mystring<<"   "<<"特殊符号\n";
				mystring="";
				recordNumber=-1;
			}
			if(ch=='\n')
			{
				recordSign="";
				recordKey="";
				recordSign1=-1;
			}
			continue ;
		}
			
		if((ch>=48&&ch<=57)||(ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==95||ch=='.')
		{
			
			if(recordSign1==1)
			{
				mystring=mystring+mySign;
				mySign="";
				mystring=mystring+ch;
				continue ;
			}
			if((mystring==""&&(ch>=48&&ch<=57))||(recordNumber==1&&(ch>=48&&ch<=57))||(recordNumber==1&&(ch=='.'))||(recordNumber==1&&(ch=='e'))||(recordNumber==1&&(ch=='E')))
				recordNumber=1;
			else 
				recordNumber=-1;
			if(ch=='.'&&recordNumber==-1)
			{
				mySign=mySign+ch;
				if(mystring!="")
				{
					if(recordSign1==1)
						continue ;
					if(mystring!="sizeof")
						if(myKeymap.find(mystring)!=myKeymap.end())
							out<<mystring<<"   "<<"关键字\n";
						else
							out<<mystring<<"   "<<"标识符\n";
					else
						out<<mystring<<"   "<<"特殊符号\n";
					mystring="";
					recordNumber=-1;
				}
				continue ; 
			}
			mystring=mystring+ch;
			if(mySign!="")
			{
				if(mySignmap.find(mySign)!=mySignmap.end())
				{
					out<<mySign<<"   "<<"特殊符号\n";
				}
				mySign="";

			}
			
		}
		else
		{
			
			if(ch=='<'||ch=='>')
			{
				if(recordKey=="include")
				{
					if(mystring!="")
						out<<mystring<<"   "<<"关键字\n";
					mystring="";
					recordNumber=-1;
					out<<ch<<"   "<<"特殊符号\n";
					recordSign1=-recordSign1;
					continue ;
				}
			}
			if(ch=='\"'||ch=='\'')
			{
				if(recordKey=="include"&&ch=='\"')
				{
					if(mystring!="")
						out<<mystring<<"   "<<"关键字\n";
					mystring="";
					recordNumber=-1;
					out<<ch<<"   "<<"特殊符号\n";
					recordSign1=-recordSign1;
					continue ;
				}
				else
				{
					if(mySign!="")
					{
						if(mySignmap.find(mySign)!=mySignmap.end())
						{
							out<<mySign<<"   "<<"特殊符号\n";
						}
						mySign="";
					}
					flag=-flag;
					if(flag==-1&&ch=='\"')
					{
						string1='\"'+mystring+'\"';
						mystring="";
						recordNumber=-1;
						out<<string1<<"   "<<"字符串\n";
					}
					if(flag==-1&&ch=='\'')
					{
						string1='\''+mystring+'\'';
						mystring="";
						recordNumber=-1;
						out<<string1<<"   "<<"单字符\n";
					}
				}
			}
			else
			{
				mySign1=mySign+ch;
				if(mySign1=="//"||mySign1=="/*")	
				{
					if(mySign1=="//")
					{
						while(in.get(ch1))
						{
							if(ch1=='\n')
								break;
						}
						mySign1="";
						mySign="";
					}
					if(mySign1=="/*")
					{
						ch2="n";
						while(in.get(ch1))
						{
							mySign1=ch2+ch1;
							if(mySign1=="*/")
								break;
							ch2=ch1;
						}
						mySign1="";
						mySign="";
					}
				}
				else
				{
					if(mySignmap.find(mySign1)==mySignmap.end())
						if(mySign!="")
						{
							if(mySignmap.find(mySign)!=mySignmap.end())
							{
								out<<mySign<<"   "<<"特殊符号\n";
							}
							mySign="";
						}
					mySign=mySign+ch;
				}
			}
			if(mystring!="")
			{
				if(recordSign1==1)
					continue ;
				if(mystring!="sizeof")
					if(myKeymap.find(mystring)!=myKeymap.end())
						out<<mystring<<"   "<<"关键字\n";
					else
						if(recordNumber==-1)
							out<<mystring<<"   "<<"标识符\n";
						else
							out<<mystring<<"   "<<"数字\n";
				else
					out<<mystring<<"   "<<"特殊符号\n";
				mystring="";
				recordNumber=-1;
			}
		}
		if(mySign=="#")
			recordSign=mySign;
		if(recordSign == "#" && mystring == "include")
		{
			recordKey=mystring;
			recordSign="";
		}
	}
	if(mySign!="")
	{
		if(mySignmap.find(mySign)!=mySignmap.end())
		{
			out<<mySign<<"   "<<"特殊符号\n";
		}

		mySign="";
	}
	if(mystring!="")
	{
		if(mystring!="sizeof")
			if(myKeymap.find(mystring)!=myKeymap.end())
				out<<mystring<<"   "<<"关键字\n";
			else
				out<<mystring<<"   "<<"标识符\n";
		else
			out<<mystring<<"   "<<"特殊符号\n";
		mystring="";
		recordNumber=-1;
	}
	in.close();
	out.close();
	return ;
}



// CompilingTestDlg.h : header file
//

#include <string>
#include"map"
#include<fstream>
using namespace std;

#if !defined(AFX_COMPILINGTESTDLG_H__423FA433_E4ED_44D7_A88B_38EB78071AA4__INCLUDED_)
#define AFX_COMPILINGTESTDLG_H__423FA433_E4ED_44D7_A88B_38EB78071AA4__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

/////////////////////////////////////////////////////////////////////////////
// CCompilingTestDlg dialog

class CCompilingTestDlg : public CDialog
{
// Construction
public:
	CCompilingTestDlg(CWnd* pParent = NULL);	// standard constructor

// Dialog Data
	//{{AFX_DATA(CCompilingTestDlg)
	enum { IDD = IDD_COMPILINGTEST_DIALOG };
	CString	m_InputArea;
	CString	m_OutputArea;
	//}}AFX_DATA

	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CCompilingTestDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);	// DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:
	HICON m_hIcon;
	map<string,int>  myKeymap;
	map<string,int>  mySignmap;

	void Initialize();
	void DealWith1();
	void DealWith2();

	// Generated message map functions
	//{{AFX_MSG(CCompilingTestDlg)
	virtual BOOL OnInitDialog();
	afx_msg void OnSysCommand(UINT nID, LPARAM lParam);
	afx_msg void OnPaint();
	afx_msg HCURSOR OnQueryDragIcon();
	afx_msg void OnButton1();
	afx_msg void OnButton2();
	afx_msg void OnButton3();
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_COMPILINGTESTDLG_H__423FA433_E4ED_44D7_A88B_38EB78071AA4__INCLUDED_)

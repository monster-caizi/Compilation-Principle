// Syntactic analysisDlg.h : header file
//

#include<fstream>
#include <string>
#include "globals.h"
using namespace std;

#if !defined(AFX_SYNTACTICANALYSISDLG_H__62789118_A6ED_459A_A5FC_306069900D48__INCLUDED_)
#define AFX_SYNTACTICANALYSISDLG_H__62789118_A6ED_459A_A5FC_306069900D48__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

/////////////////////////////////////////////////////////////////////////////
// CSyntacticanalysisDlg dialog

class CSyntacticanalysisDlg : public CDialog
{
// Construction
public:
	CSyntacticanalysisDlg(CWnd* pParent = NULL);	// standard constructor

// Dialog Data
	//{{AFX_DATA(CSyntacticanalysisDlg)
	enum { IDD = IDD_SYNTACTICANALYSIS_DIALOG };
	CString	m_InputArea;
	CString	m_OutputArea;
	//}}AFX_DATA

	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CSyntacticanalysisDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);	// DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:
	HICON m_hIcon;

	// Generated message map functions
	//{{AFX_MSG(CSyntacticanalysisDlg)
	virtual BOOL OnInitDialog();
	afx_msg void OnSysCommand(UINT nID, LPARAM lParam);
	afx_msg void OnPaint();
	afx_msg HCURSOR OnQueryDragIcon();
	afx_msg void OnButton1();
	afx_msg void OnButton2();
	afx_msg void OnButton3();
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
		private:
	CString m_strFileName;
	void deleteTree(TreeNode * root);
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_SYNTACTICANALYSISDLG_H__62789118_A6ED_459A_A5FC_306069900D48__INCLUDED_)

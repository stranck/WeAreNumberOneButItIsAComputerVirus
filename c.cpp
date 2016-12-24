#include <Windows.h>
#include <stdlib.h>
#include <time.h>
#include <stdio.h>

//This code is taken and modified from memz virus: https://github.com/Leurak/MEMZ

int main(int argc, char* argv[]) {
	HWND hwnd = GetDesktopWindow();
	HDC hdc = GetWindowDC(hwnd);
	
	srand (time(NULL));

	HICON hIcon = (HICON) LoadImage( // returns a HANDLE so we have to cast to HICON
 		NULL,             // hInstance must be NULL when loading from a file
		"icon6.ico",   // the icon file name
 		IMAGE_ICON,       // specifies that the file is an icon
 		0,                // width of the image (we'll specify default later on)
 		0,                // height of the image
		LR_LOADFROMFILE|  // we want to load a file (as opposed to a resource)
  		LR_DEFAULTSIZE|   // default metrics based on the type (IMAGE_ICON, 32x32)
  		LR_SHARED         // let the system release the handle when it's no longer used
	);

	while(true){	
		int ix = GetSystemMetrics(SM_CXICON) / 2;
		int iy = GetSystemMetrics(SM_CYICON) / 2;
		//HICON hIcon = (HICON) LoadImage(GetModuleHandle(NULL), "icon3.ico", IMAGE_ICON, 32, 32, 0);
		POINT cursor;
		GetCursorPos(&cursor);
		//System::Drawing::Icon^ newIcon = gcnew System::Drawing::Icon( "icon3.ico" );
		DrawIcon(hdc, cursor.x - ix, cursor.y - iy, hIcon); //LoadIcon(NULL, IDI_ERROR)
	}
	out: return 2;
}

#include <windows.h>
#include <stdio.h>



void printusage(char *program) {

    fprintf(stderr, "Usage:  %s background-file.bmp\n", program);
    fprintf(stderr, "   Changes desktop background to background-file\n");
    return;

}

int main(int argc, char *argp[]) {

    DWORD dResult;
    BOOL result;

    if (argc != 2) {
        printusage(argp[0]);
        return 1;
    }


    result = SystemParametersInfo(
        SPI_SETDESKWALLPAPER,
        0,
        argp[1],
        0);

    if (!result) {
        dResult = GetLastError();
        fprintf(stderr, "Attempt to set new desktop background failed.\nError code: %d\n\n", dResult);

        return 2;
    }

    fprintf(stderr, "Desktop background changed to: %s\n\n", argp[1]);
    return 0;

}



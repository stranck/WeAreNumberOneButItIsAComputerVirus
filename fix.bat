@echo off
title=Fix
echo [%time%] Fixing WeAreNumberOneButItIsAComputerVirus...

::kill the process in the right order
taskkill /IM wscript.exe /F
taskkill /IM cmd.exe /FI "WINDOWTITLE ne Fix"
taskkill /IM java.exe /F
taskkill /IM javaw.exe /F

::delate the startup file
@del "C:\Users\%username%\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup\windowsupdate.vbs"

::remove .robbierotten to your file name
timeout 3 > nul
java -jar "C:\Users\%username%\Documents\party\wano.jar" a

::delete the virus data
rmdir "C:\Users\%username%\Documents\party" /S /Q

::more stuff
@del command
@del other.bat
echo [%time%] Done!
echo.
echo Remember, go support our Robbie Rotten number one! ;) https://www.gofundme.com/2tm9tqk
start https://www.gofundme.com/2tm9tqk
echo.
echo.
pause

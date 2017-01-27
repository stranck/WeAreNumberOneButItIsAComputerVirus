@echo off
cd C:\Users\"%username%"\Documents\party\
java -jar nf.jar test.temp
if exist test.temp goto :1
:stop
pause
goto :stop
:1
@del test.temp
echo test
java -jar wano.jar
crash.exe
timeout 1 > nul /NOBREAK
exit
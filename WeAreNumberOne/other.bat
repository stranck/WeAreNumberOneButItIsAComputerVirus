@echo off
for /f "delims=" %%x in (command) do set Build=%%x
%Build%
exit
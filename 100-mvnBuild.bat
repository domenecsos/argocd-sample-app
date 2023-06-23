@echo off
if exist despliegues\*.jar del despliegues\*.jar
if exist despliegues\*.zip del despliegues\*.zip
if exist despliegues\*.tar.gz del despliegues\*.tar.gz
pause
call mvn clean package
pause


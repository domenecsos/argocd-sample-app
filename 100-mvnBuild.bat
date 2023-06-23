@echo off

set NEXUS=docker\nexus
if exist %NEXUS%\*.jar    del %NEXUS%\*.jar
if exist %NEXUS%\*.zip    del %NEXUS%\*.zip
if exist %NEXUS%\*.tar.gz del %NEXUS%\*.tar.gz

call mvn clean package

pause


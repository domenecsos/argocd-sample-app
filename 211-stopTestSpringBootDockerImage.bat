@echo off

echo Parando
docker stop perrito_piloto

echo Eliminando
docker rm perrito_piloto

pause

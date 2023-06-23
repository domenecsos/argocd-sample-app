@echo off

set REPOSITORIO=jobs.rtve.local:5000

docker image tag unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-id-app:latest %REPOSITORIO%/unix-piloto-mss-r01a-id-app:latest
docker image push %REPOSITORIO%/unix-piloto-mss-r01a-id-app:latest

docker image tag unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-id-web:latest %REPOSITORIO%/unix-piloto-mss-r01a-id-web:latest
docker image push %REPOSITORIO%/unix-piloto-mss-r01a-id-web:latest

pause
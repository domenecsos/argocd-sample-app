@echo off

rem App contiene una mayuscula no valida para dar nombre a una imagen.

cd docker

docker build -f DockerfileApp -t unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-id-app .

pause

@echo off


rem Web contiene una mayuscula no valida para dar nombre a una imagen.

rem cd despliegues
rem docker build -f ../unix-piloto-mss-r01a-idWeb/Dockerfile -t unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-id-web .

cd docker
docker build -f DockerfileWeb -t unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-id-web .

rem Se puede probar unitariamente con 
rem docker run -d -p 80:80 --name unix-piloto-mss-r01a-id-web unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-id-web
rem http://localhost/hw.html
rem docker stop unix-piloto-mss-r01a-id-web
rem docker rm unix-piloto-mss-r01a-id-web

pause

@echo off

echo ==========================================================================================
echo Una vez arrancada la aplicacion pruebe
echo http://localhost:8080/api/swagger-ui.html
echo http://localhost:8080/api/profiles
echo http://localhost:8080/api/props
echo http://localhost:8080/api/envvars
echo Este es un arranque como Docker individual en el que el puerto 8080 se expone directamente
echo ==========================================================================================

start http://localhost:8080/api/swagger-ui.html

docker run -p 8080:8080 --name perrito_piloto unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-id-app

pause

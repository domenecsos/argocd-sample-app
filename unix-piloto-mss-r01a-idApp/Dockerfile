# Alpine Linux es una distribucion lightweight con solo lo esencial
# OpenJSDK es una JVM Oracle plenamente operativa
FROM openjdk:8-jdk-alpine

# Etiquetas descriptivas
# Visibles con
# docker image inspect unix-piloto-mss-r01a-id/unix-piloto-mss-r01a-idApp
LABEL org.opencontainers.image.authors="Ministerio Sanidad"
LABEL version="0.0.1-SNAPHOT"
LABEL description="Piloto de despliegue en Openshift."

# Por defecto está en la zona UTC, un par de horas atras de la hora peninsular española
RUN apk add -U tzdata
RUN cp  /usr/share/zoneinfo/Europe/Madrid /etc/localtime

# Grupo y usuario con los que ejecuta
RUN addgroup -S spring && adduser -S spring -G spring

# Ejemplo (opcional) de creacion de un directorio donde la aplicacion pueda escribir ficheros
RUN mkdir /logs
RUN chown spring /logs
RUN chgrp -R 0 /logs && chmod -R g=u /logs

USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

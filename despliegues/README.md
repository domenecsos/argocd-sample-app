Los ficheros en este directorio son copiados de cada proyecto por el plugin Maven `copy-rename-maven-plugin` configurado en los respectivos `pom.xml`.

En el caso de los est�ticos del proyecto web, antes se ejecuta un plugin `maven-assembly-plugin</artifactId>` configurado en 
el descriptor `src/assembly/dep.xml`.

En ambos casos, la versi�n se maneja de forma autom�tica tanto para el fichero original generado por Maven en target como para el fichero desplegable copiado en este directorio `despliegues`.
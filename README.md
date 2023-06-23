# argocd-sample-app

Aplicación ejemplo compuesta por una API en SpringBoot y un site estático

Cada uno de los dos modulos copia el artefacto generado en `target` al directorio común `despliegues`, cambiando el nombre del artefacto pero incluyendo la versión.

## Modo de uso

Disponer de Maven y Java 8 en la línea de comandos.

Ejecutar [100-mvnBuild.bat](100-mvnBuild.bat).

El script borra el directorio de despliegues y a continuación hace un `mvn clean package` del proyecto padre.

Al final de la construcción del \*.jar de SpringBoot este se copia en el directorio de desplegables.
```
[INFO] Building UnixPilotoMssR01aIdApp 0.0.1-SNAPSHOT                     [1/3]
(...)
[INFO] --- maven-jar-plugin:3.2.2:jar (default-jar) @ unix-piloto-mss-r01a-id-app ---
[INFO] Building jar: C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idApp\target\unix-piloto-mss-r01a-id-app-0.0.1-SNAPSHOT.jar
[INFO] --- spring-boot-maven-plugin:2.7.12:repackage (repackage) @ unix-piloto-mss-r01a-id-app ---
[INFO] Replacing main artifact with repackaged archive
[INFO] --- copy-rename-maven-plugin:1.0:copy (copy-file) @ unix-piloto-mss-r01a-id-app ---
[INFO] Copied C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idApp\target\unix-piloto-mss-r01a-id-app-0.0.1-SNAPSHOT.jar to C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idApp\..\despliegues\unix-springboot-0.0.1-SNAPSHOT.jar
```

La aplicación web genera un \*.jar vacío sin utilidad.
Interesa el assembly del contenido web (configurado en tres formatos comprimidos a la vez, elegir el preferido).
Finalmente se copia un comprimido en el directorio de `despliegues`.
```
[INFO] -------< es.gob.sanidad.piloto.k8s:unix-piloto-mss-r01a-id-web >--------
[INFO] Building UnixPilotoMssR01aIdWeb 0.0.1-SNAPSHOT                     [3/3]
(...)
[INFO] --- maven-assembly-plugin:3.3.0:single (create-archive) @ unix-piloto-mss-r01a-id-web ---
[INFO] Reading assembly descriptor: C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idWeb/src/assembly/dep.xml
[INFO] Building tar: C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idWeb\target\unix-piloto-mss-r01a-id-web-0.0.1-SNAPSHOT-estaticos.tar.gz
[INFO] Building tar: C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idWeb\target\unix-piloto-mss-r01a-id-web-0.0.1-SNAPSHOT-estaticos.tar.bz2
[INFO] Building zip: C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idWeb\target\unix-piloto-mss-r01a-id-web-0.0.1-SNAPSHOT-estaticos.zip
[INFO]
[INFO] --- copy-rename-maven-plugin:1.0:copy (copy-file) @ unix-piloto-mss-r01a-id-web ---
[INFO] Copied C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idWeb\target\unix-piloto-mss-r01a-id-web-0.0.1-SNAPSHOT-estaticos.zip to C:\_exe\E31710\Fuentes\AppPrueba\argocd-sample-app\unix-piloto-mss-r01a-idWeb\..\despliegues\unix-estaticos-0.0.1-SNAPSHOT.zip
```


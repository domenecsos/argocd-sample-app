FROM httpd:2.4
 
COPY ./public-html/ /usr/local/apache2/htdocs/


# Para obtener la config inicial de Apache
# docker run --rm httpd:2.4 cat /usr/local/apache2/conf/httpd.conf > unix-piloto-mss-r01a-id-httpd.conf
# Cambios a la config de Apache
# LoadModule proxy_module modules/mod_proxy.so
# LoadModule proxy_http_module modules/mod_proxy_http.so
# <IfModule proxy_module>
# 	ProxyPass "/api"  "http://unix-piloto-mss-r01a-id-api:8080/api/"
# 	ProxyPassReverse "/api"  "http://unix-piloto-mss-r01a-id-api:8080/api/"
# </IfModule>

COPY ./unix-piloto-mss-r01a-id-httpd.conf /usr/local/apache2/conf/httpd.conf



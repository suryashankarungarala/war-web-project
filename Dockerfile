FROM tomcat9:latest
COPY /target/*.war /usr/local/tomcat/webapps/wwp-1.0.0.war

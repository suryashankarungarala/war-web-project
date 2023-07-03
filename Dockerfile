FROM tomcat:latest
ADD /target/*.war /usr/local/tomcat/webapps/wwp-1.0.0.war
EXPOSE 8080

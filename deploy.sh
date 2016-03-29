#!/bin/bash
mvn clean install
rm -r /home/danish/Documents/Softwares/Tomcat/apache-tomcat-7.0.68/webapps/web-application-0.0.1-SNAPSHOT*
cp web-application/target/web-application-0.0.1-SNAPSHOT.war /home/danish/Documents/Softwares/Tomcat/apache-tomcat-7.0.68/webapps/
/home/danish/Documents/Softwares/Tomcat/apache-tomcat-7.0.68/bin/shutdown.sh
/home/danish/Documents/Softwares/Tomcat/apache-tomcat-7.0.68/bin/startup.sh

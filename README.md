# AUTHMANAGER
Test Proyecto Web con Apis
Configuracion:
Crear Variables de Entorno de Cuenta 

GRAILS_HOME
D:\INSTALADORES\JAVA\grails-3.3.11\bin

JAVA_HOME
C:\Program Files\Java\jdk1.8.0_271\

DESCARGAR GRAILS 3
Buscar la 3.3.11
https://grails.org/download.html

DESCARGAR JAVA
https://www.oracle.com/ar/java/technologies/javase/javase-jdk8-downloads.html

START APPLICATION
grails run-app

CONFIGURACION MYSQL:
(*) En Application.yml

dataSource:
    pooled: true
    jmxExport: true
    driverClassName: com.mysql.jdbc.Driver
    dialect: org.hibernate.dialect.MySQL5InnoDBDialect
    username: root
    password: ''

environments:
    development:
        dataSource:
            dbCreate: create-drop
            url: jdbc:mysql://localhost/workflows
            
 (*) En Build.gradle
 Agregar en Dependencies
    runtime "com.h2database:h2"
    runtime 'mysql:mysql-connector-java:5.1.36'
    runtime "org.apache.tomcat:tomcat-jdbc"

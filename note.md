
C:\Program Files\AdoptOpenJDK\jdk-11.0.11.9-hotspot\bin

C:\Program Files\AdoptOpenJDK\jdk-8.0.292.10-hotspot
=================
spring.datasource.url=jdbc:mysql://localhost:3306/db_demo_api?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=springuser
spring.datasource.password=

spring.jpa.hibermate.ddl-auto=update
spring.jpa.show-sql=true
=================
spring:
    datasource:
        driverClassName: com.mysql.jdbc.Driver
        url: jdbc:mysql://localhost:3306/db_demo_api
        username: root
        password:
    jpa:
        hibernate.ddl-auto:update
        generate-ddl:true
        show-sql:true
========================
spring:datasource:driverClassName: com.mysql.jdbc.Driver
spring.datasource.url:jdbc:mysql://localhost:3306/db_demo_api
spring.datasource.username:root
spring.datasource.password:

spring.jpa.hibermate.ddl-auto:update
spring.jpa.show-sql:true
========================
spring.datasource.url=jdbc:mysql://localhost:db_demo_api?serverTimezone=UTC
//set username and password as environment variables under application configuration so that the real ones won't be pushed to github, only their aliases: USERNAME and PASSWORD in this case. 
spring.datasource.username="root" // instead of ${USERNAME} you may use a generic one as well, like 'root' but then it will be pushed to github with the app so anyone can see you username and password.
spring.datasource.password=""
spring.jpa.hibernate.ddl-auto=update //running after the first time (when the tables are created in the database) or later when you want the data remain for later tests you have to change the key word 'create-drop' to 'update' so that the data remains in place. Oops! the database itself without the tables needs to be created manually first.
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.logging.level.org.hibernate.SQL=debug
spring.jpa.show-sql=true




Buat form Input dan Show 
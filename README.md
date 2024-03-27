jwt Spring boot Authentication and Authorization

dependencies: Spring Web, Spring Security, Lombok, Spring Data Jpa, MySql Driver
mvn repository for jwt: jjwt-impl, jjwt-api, jjwt-jackson version: 0.11.5
Database: Mysql
testing: PostMan


application.properties:

spring.application.name=spring.Jwt


# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/spring_jwt
spring.datasource.username=root
spring.datasource.password=
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect


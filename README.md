# CRUD-Spring-Boot-JPA-MySQL

# CRUD Example of Spring-Boot-REST-JPA-MySQL (Product)

### 1. You can clone it from github by running following command

```
  $ https://github.com/Kasun002/product.git
```

### 2. Import project into idea
```
  File -> Open 
```
### 3. Download mvn

### 4. Import src/main/java/resources/product.sql into MySQL database

### 5. Update database credential and other configuration into application.properties available in src/main/java/resources

```

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/sspj
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect

```

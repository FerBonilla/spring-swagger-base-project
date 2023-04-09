spring-swagger-base-project
=============================
 
 **TODO**: Add more endpoints with multiple REST mock requests

 ## Summary

Generated at https://start.spring.io
This spring REST project it's a template for Spring Boot 2 integration with swagger 2

- Spring Boot 2.7.10
- Spring Web, Spring Boot Dev Tools and Lombok
- JDK 17. It can be from JDK 11 to latest. You can switch your JDK after cloning this repository or chosing your preferred JDK version while generating the project at https://start.spring.io
- .gitignore by @fedir
- Added the springfox dependencies

```
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>3.0.0</version>
</dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-boot-starter</artifactId>
	<version>3.0.0</version>
</dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>3.0.0</version>
</dependency>
```

Must have spring.mvc.pathmatch.matching-strategy property to solve issues related to the swagger ui not showing

```
spring.mvc.pathmatch.matching-strategy=ant-path-matcher
```

swagger ui at:
```
*context-path*/swagger-ui/index.html
```

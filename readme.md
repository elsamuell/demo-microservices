## Demo Microservices

This project consists of the following services by implementing <b> Clean Architecture</b> 

![clean-arhictecture-diagram](https://user-images.githubusercontent.com/107911002/176683673-13e05dc8-0cad-412e-84ea-144869b9182b.jpeg)

#### The following services :
* merchant-service
* product-service
* gateway-service
* config-service
* eureka-service

#### Built With :
* Spring Boot Framework
* Spring Cloud Gateway
* Spring Cloud Netflix Eureka
* Spring Cloud Config
* Spring Doc Open API
* H2database
* Swagger UI

####  Usage
```
 mvn clean install
 mvn spring-boot:run
```

#### Swagger UI Merchant Service
```
http://localhost:8081/swagger-ui/index.html#
```

#### Swagger UI Product Service
```
http://localhost:8082/swagger-ui/index.html#
```
#### Endpoint Gateway
```
http://localhost:8080
```

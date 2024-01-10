# Spring Boot Example with Swagger UI, H2 DB, and Spring Data JPA
Sample spring boot rest api with Swagger documentation using JPA and in-memory h2 database
Developed for RV University and presented to concerned faculty on 11 Jan 2024.

# Requirements
	Java - 17
	Maven - 3.8.x
	Swagger - 3.x.x

Highly recommend that you use [IntelliJ IDEA](https://www.jetbrains.com/idea/) as your IDE with this project.

# Steps to setup
### 1. Clone repository
Clone repository to your local machine using "git clone

https://github.com/hhk998402/restapi-springboot-swagger-jpa-h2inmemory.git

### 2. Configure server port
Open `src/main/resources/application.properties`

Configure server port in application.properties file

Add or change server.port = 8080 or 8081 whichever port is available in your local

### 3. Build and run the app using maven
`mvn package`

`java -jar target/springboot-swagger-h2-0.0.1-SNAPSHOT.jar`

Alternatively, you can run the app without packaging it using -

`mvn spring-boot:run`

### 4. Run application
After successful compile and build of application.

Use http://localhost:8080. or http://localhost:8081.

Alter the port number based on the server configuration done in `application.properties` file

### 5. H2 database console
Open H2 database console using http://localhost:8081/h2-console

Alter the port number based on the server configuration done in `application.properties` file

### 6. Swagger documentation
Open swagger document using http://localhost:8081/swagger-ui/index.html

Alter the port number based on the server configuration done in `application.properties` file

### 7. Explore APIs
	
	Create employee: POST /employees 
	Get employee by id: GET /employees/{id}
	Get all employees: GET /employees
	Update employee by id: PUT /employee/{id}
	Delete employee by id: DELETE /employee/{id}

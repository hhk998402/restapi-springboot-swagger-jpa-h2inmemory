# restapi-springboot-swagger-jpa-h2inmemory
Sample spring boot rest api with swagger documentation using jpa and in-build h2 database for caching

# Requirements
	Java - 1.8.x
	Maven - 3.x.x
	Swagger - 2.x.x

# Steps to setup
### 1. Clone repository
Clone repository to your local machine using "git clone

https://github.com/tameemansari510/restapi-springboot-swagger-jpa-h2inmemory.git"

### 2. Configure server port
Open src/main/resources/application.properties

Configure server port in application.properties file

Add or change server.port = 8080 or 8081 whichever port are available in your local

### 3. Build and run the app using maven
mvn package

java -jar target/easy-notes-1.0.0.jar

Alternatively, you can run the app without packaging it using -

mvn spring-boot:run

### 4. Run application
After successfull compile and build of application.

Use http://localhost:8080. or http://localhost:8081.

port number based on the server configuration done in application.properties file

### 5. H2 database console
Open H2 database console using http://localhost:8080/h2-console

port number based on the server configuration done in application.properties file

### 6. Swagger documentation
Open swagger document using http://localhost:8080/swagger-ui.html

port number based on the server configuration done in application.properties file

### 7. Explore APIs
	
	Create employee: POST /employees 
	Get employee by id: GET /employees/{id}
	Get all employees: GET /employees
	Update employee by id: PUT /employee/{id}
	Delete employee by id: DELETE /employee/{id}

# Spring Boot 2 CURD With Database PostgreSQL and JPA

### Read More Application
- Spring Boot 2 With CURD, Postgres SQL, JPA, and Tools Lombok [here](https://github.com/rochiyat/spring-boot-curd-postgre-jpa-lombok)
- Spring Boot JWT [here](https://github.com/rochiyat/sping-boot-jwt-postgresql)

## Requirement Tools
1. Maven 3.xx
2. Java 8
3. Spring Boot 2
4. Postgres SQL
5. Postman or similar tools

## Running to Localhost
1. Clone repository github
2. Change connection to database in file application.properties
3. Running application in command **mvn spring-boot:run**
4. Ready to call API

## Test Application via Postman
1. POST posting \
   curl --location 'http://localhost:8080/api/postings' \
   --header 'Content-Type: application/json' \
   --data '{
   "tittle": "Second Posting",
   "description": "Second Description"
   }'
2. GET all posting \
   curl --location 'http://localhost:8080/api/postings'
3. GET posting by id \
   curl --location 'http://localhost:8080/api/postings/1'
4. PUT posting by id \
   curl --location --request PUT 'http://localhost:8080/api/postings/2' \
   --header 'Content-Type: application/json' \
   --data '{
   "tittle": "Second Posting 2",
   "description": "Second Description 2",
   "published": true
   }'
5. GET posting published
   curl --location 'http://localhost:8080/api/postings/published'
6. DELETE posting by id \
   curl --location --request DELETE 'http://localhost:8080/api/postings/2'
7. DELETE all posting \
   curl --location --request DELETE 'http://localhost:8080/api/postings'

Reference: https://www.bezkoder.com/spring-boot-postgresql-example/
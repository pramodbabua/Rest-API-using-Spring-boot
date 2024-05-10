Prerequisites:
Java 17 &
Maven 

Build:
mvn clean package 

Run:
mvn clean spring-boot:run

Details:
API Endpoint - Operations supported  
http://localhost:8080/items - GET, POST
http://localhost:8080/items/{id} - PUT, DELETE
Swagger - http://localhost:8080/swagger-ui/index.html#/

Get Sample Output
{
	"id": 1,
	"name": "Item 1"
}

POST Sample Request 
{
	"name": "Item 3"
}

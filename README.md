# Baufinanzierung2
Spring Boot Micro Service zum Erstellen eines Finanzierungsangebotes


# api
- Swagger UI page: http://localhost:8082/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
- OpenAPI description im json format: http://localhost:8082/v3/api-docs

-----

# General Info
- App laeuft auf port 8082
- actuator ist verfuegbar: http://localhost:8082/actuator
- http file mit Beispielrequests ist verfuegbar `src/main/resources/http/ExampleRequests.http`
- um Exceptions und ResponseCodes zu demonstrieren wird bei der Suche nach Angebot mit id 666 eine Beispielexception
 geworfen, siehe auch `src/main/resources/http/ExampleRequests.http`


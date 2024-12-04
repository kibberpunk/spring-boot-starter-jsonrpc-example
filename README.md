# Spring Boot Starter JSON-RPC example

Sample project to demonstrate [spring-boot-starter-jsonrpc](https://github.com/kibberpunk/spring-boot-starter-jsonrpc)

## Run

1. Build project `mvn clean install`
2. Open project in IDE
3. Run [Example](/src/main/java/com/kibberpunk/spring/boot/starter/jsonrpc/example/Example.java)
4. Perform test JSON-RPC call 
   controller [NemesisController](/src/main/java/com/kibberpunk/spring/boot/starter/jsonrpc/example/controller/NemesisController.java)

```shell
curl --location 'http://localhost:8080/api' \
--header 'Content-Type: application/json' \
--data '{
  "id": "68998eaf-dee3-4652-90fe-776a397ed1ab",
  "method": "nemesisController.attack",
  "params": {
    "coordinates": {
      "x": 10,
      "y": 20,
      "z": 30
    },
    "description": "goal - Alice project" 
  },
  "jsonrpc": "2.0"
}'
```

## Swagger

Swagger configuration has default profile `Swagger`. To start Swagger you need to set `Swagger` profile to run command
and open [Local Swagger URL](http://localhost:8080/swagger-ui/index.html)\
![example](/images/Configuration.jpg "example")
![swagger](/images/Swagger.jpg "swagger")


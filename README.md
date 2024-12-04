# Spring Boo Starter JSON-RPC example

Sample project to demonstrate [spring-boot-starter-jsonrpc](https://github.com/kibberpunk/spring-boot-starter-jsonrpc)

## Run

1. Download
2. Build project

```shell
mvn clean install
```

3. Open project in IDE
4. Run [Example](/src/main/java/com/kibberpunk/spring/boot/starter/jsonrpc/example/Example.java)
5. Perform test call totest JSON-RPC
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
1. Open [Swagger](http://localhost:8080/swagger-ui/index.html)
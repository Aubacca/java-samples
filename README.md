# Spring Boot Try and Error Project

## Library Dependency

The library in this project must be installed in the local maven repository.
So other project depending on this library can load resp. reference it.

Goto library project and execute maven command:

```shell script
mvn install
```

## Run via Maven

```shell script
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081 -pl app-of-lib
```

### Prerequisites
- JDK 21

### To run the project
````shell
sbt run
````

### To package the project in a fat JAR
```shell
sbt assemnbly
```
then run:
```shell
java -jar target/scala-3.6.2/scala-desktop-assembly-0.1.0-SNAPSHOT.jar
```
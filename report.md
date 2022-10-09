#   Learning outputs
Integration Testing is defined as a type of testing where software modules are integrated logically and tested as a group. A typical software project consists of multiple software modules, coded by different programmers. The purpose of this level of testing is to expose defects in the interaction between these software modules when they are integrated.

#    Implementation
The code snippet below is used for integration testing. It creates a test template and by using `getForObject` method fetches the data for the given response type from the given URL template using HTTP GET method.
After that it is verified that the response is not equal to null.
```
public void getReposTest() throws Exception {
        TestRestTemplate restTemplate = new TestRestTemplate();
        String RepoURL = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos";
        String response = restTemplate.getForObject(RepoURL, String.class);
        assertNotNull(response);
    }
```

#   Setup
Instructions to run integration test:

* Build Application
```
./gradlew build
```

* Run Integration Testing
```
./gradlew test
```

**Note:** You need to make sure `./gradlew` file is executable before building application and running testing.
To do this run the following command:
```
chmod +x ./gradlew
```
 

#   Used resources
[Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)

[Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/htmlsingle/)

[Writing Integration Tests for Rest Services with Spring Boot](https://www.springboottutorial.com/integration-testing-for-spring-boot-rest-services)

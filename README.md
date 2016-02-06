# grails3springfox

Grails 3 SpringFox Swagger REST 'Hello world' implementation. The application is a work in progress to be able to correctly and automatically generate Swagger REST endpoint documentation with the SpringFox library.

Once the application is checked out and is started by running the `grails run-app` command you have access to the 'Hello World' REST endpoint by opening the url `http://localhost:8080/hellloworldapi`.

The documentation should become available by opening `http://localhost:8080/swagger-ui.html` which under water tries to retrieve the needed JSON datastructure of the endpoints from `http://localhost:8080/v2/api-docs`.

This doesn't seem to be working YET, somehow the hello world controller is not picked up or scanned. As soon as this does work I will update this repository.



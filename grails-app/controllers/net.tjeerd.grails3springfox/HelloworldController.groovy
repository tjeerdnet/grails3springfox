package net.tjeerd.grails3springfox
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import net.tjeerd.grails3springfox.HelloWorld

@Api(value = "helloworld", description = "Endpoint for Hello World")
class HelloworldController {
	static responseFormats = ['json', 'xml']

	@ApiOperation(value = "doStuff", nickname = "doStuff", response = HelloWorld.class)
    def index() { 		
		HelloWorld helloWorld = new HelloWorld(helloworld:"Hello world GET (listing)")
		respond helloWorld
	}
	
	def show() {
		HelloWorld helloWorld = new HelloWorld(helloworld:"Hello world GET")
		respond helloWorld
	}
	
	def update() {
		HelloWorld helloWorld = new HelloWorld(helloworld:"Hello world PUT")
		respond helloWorld
	}
	
	def delete() {
		HelloWorld helloWorld = new HelloWorld(helloworld:"Hello world DELETE")
		respond helloWorld
	}
	
	def save() {
		HelloWorld helloWorld = new HelloWorld(helloworld:"Hello world POST")
		respond helloWorld
	}
}

package social.ict

class Greeter {

	fun greet(name: String) {
        println("Hi $name")
	}

}

fun main(args: Array<String>) {
	val greeter = Greeter()
	greeter.greet("Carl")
}	

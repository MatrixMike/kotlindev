package social.ict

class Greeter {
    var text: String = ""

    fun greet(name: String) {
        println("$text $name")
    }
}

fun main(args: Array<String>) {
	val greeter = Greeter()
	greeter.greet("Carl")
}	

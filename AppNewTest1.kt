//private lateinit var latitudeText: TextView
//latitudeText  = findViewById(R.id.latitude_text)

//latitudeText.text = resources
//	.getString(R.string.latitude_label, location?.latitude)    

fun String.removeFirstLastChar():
String = this.substring(1, this.length -1)

fun main(args: Array<String>) { 
    fun printDouble(d: Double) { print(d) }

val string1 = "Today is cloudy"
val string2 = string1.removeFirstLastChar()	
//val location = taskLocation.result
	println("$string2")


val b: Int = 10000
val boxedB: Int? = b
val anotherBoxedB: Int? = b 
println("$boxedB")
println("$anotherBoxedB")
val numbers = IntArray(5) { 10 * (it + 1) }
//              println( numbers{} )
val i: Int = b.toInt() // OK: explicitly widened
print(i)  
var cont = "ALEC"
println("Hi ${cont.toLowerCase()}") 

//val string1: Any = "Today is Monday"
when(string1)
{
	is String  -> string1.length
//	Is Int -> string1.inc()
}


    }
    

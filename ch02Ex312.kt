package ch02.ex3_1_2_DeclaringEnumClasses1
import java.time.LocalDateTime


enum class Color(
        val r: Int, val g: Int, val b: Int
) { MJHTEST(1,2,3),
    BLACK(0,0,0),
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

//long M = date
fun main(args: Array<String>) {
    val  month = 12;
    val  millisecondsInDay = 24*60*60*1000;
    val  date = ((month - 1L)*30 + 15)*millisecondsInDay;
    val current = LocalDateTime.now()

    println(Color.VIOLET.rgb())  // prints as decimal - maybe better as HEX
    println(Color.RED.rgb())
    println(Color.BLACK.rgb())
    val pi = 3.14159265358979323  // maybe try math.pi 
    val pi2 = Math.PI
    val formatted =  String.format("%.4f", pi) ;
    val formatted2 = String.format("%.4f", pi2) ;
    println(formatted)
    println(formatted2)
    println(String.format("0x%08X", Color.MJHTEST.rgb()))
    println(String.format("%tB",7L))
    println(String.format("%tB",1L))
    println(String.format("%tB", date))
//    println(String.format("%tB", Date.now()))
    println("Current Date and Time is: $current")
    println(String.format("%tB", current)    )
}

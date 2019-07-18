package ch02.ex3_1_2_DeclaringEnumClasses1

enum class Color(
        val r: Int, val g: Int, val b: Int
) { MJHTEST(1,2,3),
    BLACK(0,0,0),
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Color.VIOLET.rgb())  // prints as decimal - maybe better as HEX
    println(Color.RED.rgb())
    println(Color.BLACK.rgb())
    val pi = 3.14159265358979323  // maybe try math.pi 
    val formatted = String.format("%.3f", pi) ;
    println(formatted)
    println(String.format("0x%08X", Color.MJHTEST.rgb()))
}

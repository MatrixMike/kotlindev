package ch02.ex2_2_CustomAccessors

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle1 = Rectangle(41, 43)
    val rectangle2 = Rectangle(29, 29)
    println(rectangle1.isSquare)
    println(rectangle2.isSquare)
}

fun main(args: Array<String>) {


val a = listOf(7, 1, 2, 3, 3, 4, 5, 5, 5, 6)
val b = listOf(1, 3, 3, 3, 4, 4, 5, 6, 6, 7)

var counter = 0

a.intersect(b).forEach { x -> counter += listOf(a.count {it == x}, b.count {it == x}).min()!! }

println(counter)

}

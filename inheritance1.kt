 // https://www.tutorialkart.com/kotlin/kotlin-inheritance/
fun main() {   // was    fun main(args: Array<String>) ; removed to avoid warning message
    var student_1 = Student("Arjun")
    var teacher_1 = Teacher("Amit")
 
    println("\n\nAbout "+student_1.name+"\n---------------")
    student_1.doAll()
 
    println("\n\nAbout "+teacher_1.name+"\n---------------")
    teacher_1.doAll()
}
 
/**
* Person is a Parent Class  // pity about using people twice
*/
open class Person(var role: String = "Person", var name: String = "X") {
    fun eat(){
        println(name + " is eating.")
    }
    fun sleep(){
        println(name + " is sleeping.")
    }
}
 
/**
* Student class inherits Person class
*/
class Student(name: String): Person("Student", name) {
    // activity function belongs to Student only
    fun activity(){
        println("$name is a $role. $name is studying in school.")
    }
 
    fun doAll(){
        eat()
        sleep()
        activity()
    }
}
 
/**
* Teacher class inherits Person class
*/
class Teacher(name: String): Person("Teacher", name) {
    fun profession(){
        println("$name is a $role. $name teaches at school.")
    }
 
    fun doAll(){
        eat()
        sleep()
        profession()
    }
} 

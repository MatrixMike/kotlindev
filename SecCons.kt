 
fun main(args: Array<String>){
    var person_0 = Person("Ranjan",21)   // there is underbar between person and 0
    person_0.printPersonDetails()
    var person_1 = Person("Suresh",25, "Teaching")
    person_1.printPersonDetails()
} 
 
/**
* Kotlin Secondary Constructor Example - Kotlin Classes and Kotlin Constructors
*/
class Person constructor(var name: String, var age: Int){
    var profession: String = "Not Mentioned"
    // initializer block is run during the initialization of class object, after executing constructor
    init{
        println("$name's details are being held in this class object.")
    }     
    constructor (name: String, age: Int, profession: String): this(name,age){
        this.profession = profession
    }
    
    fun printPersonDetails(){
        println("$name whose profession is $profession, is $age years old.")
    }
} 

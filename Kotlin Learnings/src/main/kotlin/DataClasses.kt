data class Book(val name: String, val publisher: String, var reviewScore: Int)

data class Employees(val _name: String, val age: Int, val dept:String)
fun main(args: Array<String>) {

    val book = Book("Kotlin", "Ritvik Shukla", 10)

    println("Name = ${book.name}")
    println("Publisher = ${book.publisher}")
    println("Score = ${book.reviewScore}")
    var (name,publisher,reviewScore) = book
    println(name)
    println(publisher)
    println(reviewScore)
    val employee = Employees("Ramesh",12,"Tech")
    val (_name,age,dept) = employee
    println(employee)
}
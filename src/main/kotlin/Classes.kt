class MyClass {
    private var name: String = "Tutorialspoint.com"
    fun printMe() {
        println("The best Learning website - $name")
    }
    class NestedClass{
        private var age: Int = 27
        fun printMe() {
            println("The age is $age")
        }
    }
}
class Outer {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
    inner class Inner {
        fun foo() = welcomeMessage
    }
}

// Anonymous Classes
interface Human {
    fun think()
}
interface HeyBuoy{
    fun Hello()
}
fun main(args: Array<String>) {
    val obj = MyClass()
    obj.printMe()
    val nested = MyClass.NestedClass()
    nested.printMe()
    val obj2 = Outer().Inner()
    print(obj2.foo())
    var programmer :Human = object:Human {
        override fun think() {
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
    val hey: HeyBuoy = object:HeyBuoy{
        override fun Hello() {
            println("Jello")
        }
    }
    hey.Hello()
    println(HelloUser())
}

typealias User = Triple<String,String,Int>

fun HelloUser(): User{
    return Triple("Ramesh","Rakesh",1)
}

class Person  (val _firstName: String, val _age: Int) {
    var name: String
    var age: Int
//    var occupation: String

    init {
        this.name = _firstName
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }

// Can be made as much we want, only one type of constructor can be there
//    constructor (_occupation: String) {
//        this.occupation = _occupation
//    }
}
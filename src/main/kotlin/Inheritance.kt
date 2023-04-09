open class ABC {
    open val count: Int = 0

    open fun think () {
        println("Hey!! i am thiking ")
    }
}
class BCD(override val count: Int = 200): ABC(){
//    override val count: Int
//    init{
//        count = 100
//    }
    final override fun think(){
        println("Hello")
    }
}

open class Base() {
    open val name:String
    init{
        name = "Base"
    }
    open fun displayName(){
        println("I am in " +  this.name)
    }
}
class Child(): Base() {
    override fun displayName(){
        super.displayName()
        println("I am in " + super.name)

    }
}
fun main(args: Array<String>) {
    var  a = BCD()
    a.think()
}
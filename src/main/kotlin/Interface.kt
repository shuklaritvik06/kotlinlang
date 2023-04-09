interface Hey{
    fun Hello(str:String)
    fun printMe(){
        println("Hello")
    }
}

interface Hi{
    fun Heybuoy(str:String)
    fun printM(){
        println("Hello")
    }
}

class A: Hey,Hi{
    override fun Hello(str: String) {
        println("Hello Chomu $str")
    }

    override fun Heybuoy(str: String) {
        println("Hey $str")
    }
}

fun main(){
    var a = A()
    a.Hello("Ramesh")
    a.printMe()
    a.printM()
}
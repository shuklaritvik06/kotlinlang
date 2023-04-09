// Should be top level declaration
const val a = "Rakesh"
fun main(args: Array<String>) {
    var x: Int = 40
    val y: Int = 20
    var b: Boolean = true
    var a: Boolean = false


    println("x + y = " +  (x + y))
    println("x - y = " +  (x - y))
    println("x / y = " +  (x / y))
    println("x * y = " +  (x * y))
    println("x % y = " +  (x % y))

    println("x > y = " +  (x > y))
    println("x < y = " +  (x < y))
    println("x >= y = " +  (x >= y))
    println("x <= y = " +  (x <= y))
    println("x == y = " +  (x == y))
    println("x != y = " +  (x != y))

    println("+x = " +  (+x))
    println("-x = " +  (-x))
    println("++x = " +  (++x))
    println("--x = " +  (--x))
    println("!b = " +  (!b))

    println("a && b = " +  (a && b))
    println("b || a = " +  (b || a))

    var z:Int = x.shl(2)       // 240 = 1111 0000
    println("x.shl(2) = $z")

    z = x.shr(2)       // 15 = 0000 1111
    println("x.shr(2) = $z")

    z = x.and(y)       // 12 = 0000 1100
    println("x.and(y)  = $z")

    z = x.or(y)        // 61 = 0011 1101
    println("x.or(y)  = $z")

    z = x.xor(y)       // 49 = 0011 0001
    println("x.xor(y)  = $z")

    z = x.inv()        // -61 = 1100 0011
    println("x.inv()  = $z")
}
fun main(){
    for (num in 1.rangeTo(4)){
        println(num)
    }
    for ( num in 1..4 ) {
        println(num)
    }
    for ( num in 'A'..'Z' ) {
        println(num)
    }
    for (num in 4 downTo 1){
        println(num)
    }
    for (num in 1..5 step 2){
        println(num)
    }
    for (num in 1 until 5){
        println(num)
    }
    println((5..10).first)
    println((5..10 step 3).step)
    println((5..10).reversed().last)
}
fun main(){
    val fruits = arrayOf("Apple", "Mango", "Banana", "Orange")
    println(fruits.toString())
    val list = listOf<String>("Ramesh","Suresh")
    println(list)
    println(fruits.size)
    for( item in fruits ){
        println( item )
    }
    if ("Mango" in fruits){
        println("Mango is there")
    }
    val distinct = fruits.distinct()
    println(distinct)
    println(distinct.isEmpty())
    println(distinct.drop(2))
}
fun main() {
    val numbers = mutableListOf("one", "two", "three", "four")

    numbers.add("five")

    println(numbers)
    val itr = numbers.listIterator()
    while (itr.hasNext()) {
        println(itr.next())
    }
    numbers.forEach { element:String-> println(element) }
    println(numbers.contains("one"))
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("four", "five", "six")
    val resultList = firstList + secondList

    println(resultList)
    println(firstList-secondList)
    println(firstList.filterNotNull())
    println(firstList.filter { element:String->element!="one" })
    println(firstList.groupBy { element:String->element.startsWith("t") })
    println(firstList.chunked(3))
    println(firstList.map { element:String->element.startsWith("t") })
    val theSet = setOf("one", "two", "three", "four")
    println(theSet)

    val theMutableSet = mutableSetOf("one", "two", "three", "four")
    println(theMutableSet)

    theSet.forEach { element:String->println(element) }
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMap)

    val theMutableMap = mutableSetOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMutableMap)

    println("Entries: " + theMap.entries)
    println("Keys:" + theMap.keys)
    println("Values:" + theMap.values)
    val itrr = theMap.keys.iterator()
    while (itrr.hasNext()) {
        val key = itrr.next()
        val value = theMap[key]
        println("${key}=$value")
    }
    theMap.forEach { (k, v) -> println("Key = $k, Value = $v")
    }
}
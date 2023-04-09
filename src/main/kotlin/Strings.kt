import java.util.*

fun main(args: Array<String>) {
    val escapedString : String  = "I am escaped String!\n"
    var rawString :String  = """This
        ia 
        a
        multiline
        string
    """.trimMargin();

    print(escapedString)
    println(rawString)
    // Both are same
    println(rawString.length)
    println(rawString.count())
    // Last Char
    println(rawString.last())
    // Last Index
    println(rawString.lastIndex)
    // Uppercase & Lowercase
    println(rawString.uppercase())
    println(rawString.lowercase())
    // Trim Chars
    println(rawString.drop(2))
    println(rawString.dropLast(2))
    // Find String
    println(rawString.indexOf("string"))
}

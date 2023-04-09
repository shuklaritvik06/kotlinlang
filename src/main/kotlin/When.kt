fun main(){
    when (2) {
        1 -> {
            println("Monday")
            println("Weekday")
        }
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }
    when (2) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }
    when (2) {
        in 1..5 -> println("Weekday")
        else -> println("Weekend")
    }
}
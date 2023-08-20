interface EmployeeInterface{
    fun getDept(): String
}
class EmployeeImpl(dept: String): EmployeeInterface{
    val _dept: String
    init {
        this._dept = dept
    }

    override fun getDept(): String {
        return _dept
    }
}

class EmployeeDerived(b: EmployeeImpl): EmployeeInterface by b
fun main(){
    val b = EmployeeImpl("Tech")
    println(EmployeeDerived(b).getDept())
}

// import kotlin.properties.Delegates

// class User {
//     // Define a property that will be observed
//     var name: String by Delegates.observable("John") { _, oldName, newName ->
//         println("Name changed from $oldName to $newName")
//     }
// }

// fun main() {
//     val user = User()
    
//     user.name = "Alice" // This will trigger the observable delegate and print the change.
//     user.name = "Bob"   // This will trigger the observable delegate again.
// }

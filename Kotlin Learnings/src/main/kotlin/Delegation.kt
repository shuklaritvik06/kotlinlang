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
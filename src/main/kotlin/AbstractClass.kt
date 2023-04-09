abstract class Persons(_name: String) {
    var name: String
    abstract var age: Int

    init {
        this.name = _name
    }

    abstract fun setPersonAge(_age:Int)
    abstract fun getPersonAge():Int

    fun getPersonName(){
        println("Name = $name")
    }
}
class Employee(_name: String): Persons(_name) {
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
}
fun main(){
    val employee = Employee("Zara")

    employee.setPersonAge(20)

    var age : Int = employee.getPersonAge()

    employee.getPersonName()
    println("Age = $age")
}
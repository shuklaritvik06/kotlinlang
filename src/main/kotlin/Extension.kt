class ExtensionClass(var _skills: String){
    var skills: String
    init {
        this.skills = _skills
    }
}
fun main(){
    var a = ExtensionClass("Java")
    var b = ExtensionClass("Python")
    println(a.AddSkills(b))
}

fun ExtensionClass.AddSkills(a: ExtensionClass):String{
    return this.skills+a.skills
}
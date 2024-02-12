class ClassCompanion(val a: Int){
    companion object CompanionObject {
        val b = 10
    }
}

val obj1 = ClassCompanion(1)
val obj2 = ClassCompanion(2)

println(obj1)
println(ClassCompanion.CompanionObject.b)

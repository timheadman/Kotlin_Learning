class ClassWithCompanion(){
    companion object CompanionObject {
        val a = 10
        fun compFunc(b: Int) : Int = b + 1
    }
}

println(ClassWithCompanion.a)
println(ClassWithCompanion.compFunc(10))



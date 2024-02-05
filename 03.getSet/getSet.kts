class Clazz {
    var example = 0
        get() = field + 10
        set(value) {
            field = value + 1000
        }

}

val clazz = Clazz()
println(clazz.example)
clazz.example = 33
println(clazz.example)


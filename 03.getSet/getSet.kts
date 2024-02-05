class Clazz {
    var field1 = 0
        get() = field + 10
        set(value) {
            field = value + 1000
        }
 }

val clazz = Clazz()
println(clazz.field1)
clazz.field1 = 33
println(clazz.field1)


package lateinitLazy

val clazz = Clazz()
clazz.Method()

class Clazz{
    var string: String = "12ab"

    fun Method(){
        println("Method $string")
    }
}
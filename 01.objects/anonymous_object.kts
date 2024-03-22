open class SomeClass {
    open fun someFunction() {
        println("Some function in SomeClass")
    }
}


val myObject = object : SomeClass() {
    override fun someFunction() {
        println("Overridden function in anonymous object")
    }
}

myObject.someFunction() // Выведет: Overridden function in anonymous object

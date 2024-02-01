package ru.megaland

firstExample()
secondExample()
thirdExample()

// object Name — это объявление объекта (оbject declaration), реализация паттерна Singleton;
object SingletonObject {
    const val X = 100 // значение константно и известно на этапе компилляции
    var y = 0
    val Z = -1 // значение константно, НО может вычисляться во время выполнения
}

private fun firstExample(){
    println("---------------- firstExample() ----------------")
    // object — это объект-выражение (анонимный объект/object expression), не Singleton.
    val object1 = object {
        val first = "String"
        var second = 0
 
        override fun toString(): String {
            return "hashCode = ${this.hashCode()}, first = $first, second = $second "
        }
    }

    val object2 = object1
 
    println(object1)
    object1.second = 2
    println("object1: $object1")
    println("object2: $object2")
    println("SingletonObject: $SingletonObject")
    println(object1 == object2)
    println(object1 === object2)
}

private fun secondExample(){
    println("---------------- secondExample() ----------------")
    val newObject = getCoordinates(x = 21, y = 78)
    println("${newObject.x}, ${newObject.y}")
 
    val newObject2 = getCoordinates(x = 23, y = 99)
    println("${newObject2.x}, ${newObject2.y}")
}

private fun thirdExample(){
    println("---------------- thirdExample() ----------------")
    SingletonObject.y = 2
    println("x=${SingletonObject.X} y=${SingletonObject.y}")
}

private fun getCoordinates(x: Int, y: Int) = object {
    val x: Int = x * 2
    val y: Int = y * 2
}




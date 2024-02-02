package ru.megaland

objectInsideExample()
companionExample()
objectOutsideExample()

private fun objectInsideExample(){
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

// ----------------------------------------------------------------------------

class SingletonClass private constructor() {
    // Приватный конструктор, чтобы нельзя было создать экземпляр класса извне!

    companion object {
        // Это объект-компаньон, который будет служить единственным экземпляром класса
        private var instance: SingletonClass? = null

        fun getInstance(): SingletonClass {
            // Если экземпляр еще не создан, создаем его
            if (instance == null) {
                instance = SingletonClass()
            }
            // Возвращаем единственный экземпляр класса
            return instance!!
        }
    }

    fun doSomething() {
        println("doSomething()")
    }
}

private fun companionExample(){
    println("---------------- companionExample() ----------------")
    // Попытка создать экземпляр класса (невозможно из-за приватного конструктора)
    // val obj = SingletonClass() // Ошибка компиляции

    // Получаем единственный экземпляр класса через объект-компаньон
    val singletonInstance = SingletonClass.getInstance()

    // Вызываем метод класса
    singletonInstance.doSomething()
}

// ----------------------------------------------------------------------------

// object Name — это объявление объекта (оbject declaration), реализация паттерна Singleton;
object SingletonObject {
    const val X = 100 // значение константно и известно на этапе компилляции
    var y = 0
    val z = -1 // значение константно, НО может вычисляться во время выполнения
}

private fun objectOutsideExample(){
    println("---------------- thirdExample() ----------------")
    SingletonObject.y = 2
    println("x=${SingletonObject.X} y=${SingletonObject.y} z=${SingletonObject.z}")
}


class Person(val name: String, var age: Int) {
    var id: Int = 0

    init {
        // require выдает ошибку с указанным текстом, если условие в левой части false
        require(name.isNotBlank(), { "У человека должно быть имя!" })
        require(age > -1, { "Возраст не может быть отрицательным." })
    }

    constructor(name: String, age: Int, id: Int) : this(name, age) {
        if (id > 0) this.id = id * 2
    }

    override fun toString(): String {
        return "$name, $age, $id"
    }
}

val person = Person("Ivan", 34)
println(person)
val person1 = Person("Tim", 47, 1)
println(person1)



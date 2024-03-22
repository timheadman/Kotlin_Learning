val languageName: String? = null


if(languageName != null) {
    println("Name is : $languageName")
} else {
    println("Please enter a valid name")
}

// Вызов лямбда-функции произойдет только если не null
languageName?.let{ println(it) }

// Оператор безопасного вызова "?."
languageName?.length


// Элвис оператор или оператор объединения по null "?:"
val size1 = languageName ?: "string"
println(size1)

// Оператор "!!", преобразуют его к типу без поддержки null-safety
// Использование данного оператора крайне не рекомендуется, потому что (очевидно) это один из немногих способов словить NPE
val size_null = languageName!!.length

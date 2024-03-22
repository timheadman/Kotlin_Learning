    val j = readLine()!!
    val s = readLine()!!

    println(j)
    println(s)

    var result = 0
    for (c in s) {
        if (j.contains(c)) {
            result += 1;
        }
    }

    println(result)

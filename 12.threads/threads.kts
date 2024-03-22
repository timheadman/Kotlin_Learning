import kotlin.concurrent.thread

// ------------------------------------------

val thread0 = thread {
    println("start: ${Thread.currentThread().name}")
    Thread.sleep(500)
    println("end: ${Thread.currentThread().name}")
}

fun thread1(callback: (String) -> Unit) {
    thread {
        println("start: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        callback("end: ${Thread.currentThread().name}")
    }
}

fun thread2(callback: (String) -> Unit) {
    thread {
        println("start: ${Thread.currentThread().name}")
        Thread.sleep(1500)
        callback("end: ${Thread.currentThread().name}")
    }
}

thread1 { // Callback Hell
    println(it)
    thread2 {
        println(it)
    }
}

println("end: Script")


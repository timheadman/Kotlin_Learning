import kotlin.concurrent.thread

val thread1 = Thread {
    val threadName = Thread.currentThread().name
    println("Hello from: $threadName!")
}
thread1.start()

// ------------------------------------------
val thread2 = thread {
    Thread.sleep(1000)
    println("end: ${Thread.currentThread().name}!")
}

val thread3 = thread {
    Thread.sleep(2000)
    println("end: ${Thread.currentThread().name}!")
}

thread2.join()
thread3.join()
println("end")
// ------------------------------------------

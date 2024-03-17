enum class MyState (val code: Int){
    OK(0),
    CANCEL(1),
    ERROR(2);

    val test_field = "test_1"

    fun print(){
       println(this)
    }

    fun print_field(){
        println(test_field)
    }

    fun print_code(){
        println(code)
    }

}

var myState = MyState.OK

println(myState)
myState.print()
myState.print_field()
myState.print_code()
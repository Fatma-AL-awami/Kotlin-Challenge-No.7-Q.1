class MemberFunction {

// So, you can use them when assigning the result to a variable,
// chaining operations on the result, and so on.
    fun  Lambda() {

    val sum = {num1: Int, num2: Int -> num1 + num2}
    println("10+5: ${sum(10,5)}")

    }
    inline fun inLinefunction(x: String, y: (String) -> Unit) {
        y(x)
    }

    fun LocalFunction() {
        var var1 = " local function"

        fun thePrint() {
            println(var1)

        }
        thePrint()
    }


}



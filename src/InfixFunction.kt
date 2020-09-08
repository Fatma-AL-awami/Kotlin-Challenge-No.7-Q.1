class infixFunction {



   fun standardInfix(){
       val numbers = mutableListOf("one", "two", "three")
           add("four")
           add("five")

       println("There are $numbers elements that end with e.")

   }

    infix fun add(s: String) { /*...*/ }
    fun userinfix() {

        this add "The infix function"
        add("this add The infix function")
    }
}
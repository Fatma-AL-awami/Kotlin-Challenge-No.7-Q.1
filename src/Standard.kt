class Standard {
    data class Employee(var name: String, var contactNumber: String, var address: String, var salary: Double) {
        fun takeIf(predicate: (Standard.Employee) -> Unit) {

        }
    }

    //let, run, and with return the lambda result.
        fun displayInfo_let() = Employee("Fatma", "100601", "Dhamar", 200.000)
            .let {
                println(it)
                it.address = "sanaa"
                it.salary = 150.000
                println("let function $it")
            }

    fun displayInfo_Run() = Employee("Noor", "100902", "Dhamar", 200.000)
        .run {
            println(this)
            this.address = "taiz"
            this.salary = 170.00
            println("Run function $this")
        }

    fun displayInfo_With() {
      val emp= Employee("Hoda", "100402", "Dhamar", 200.000)
        with(emp) {
        println("with function  ${this.toString()}")
       emp.address="landon"
        println("with function  ${this.toString()}")
    }
        }
    //apply and also return the context object.
    fun displayInfo_Apply_Also() = Employee("saad", "100702", "Dhamar", 200.000)
        .apply {
            contactNumber="1300090"
            println("Apply ALSO functions $this")
        }.also { println("ALSO function") }

    fun displayInfo_takeIf() = Employee("saad", "100702", "Dhamar", 200.000)
        .takeIf {
            it.address="sanaa"
            it.salary=700.000
            println("takeIf functions $it")
        }







    }


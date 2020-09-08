import com.sun.xml.internal.bind.api.impl.NameConverter

//private fun performLetOperation() {
fun main()
{

   println("***********Standard function*************")

   var stand=Standard()
stand.displayInfo_let()
   stand.displayInfo_Run()
   stand.displayInfo_With()
   stand.displayInfo_Apply_Also()
   stand.displayInfo_takeIf()

   println("***********infix function*************")
   var infix=infixFunction()
   infix.standardInfix()
   infix.userinfix()


   println("***********infix function*************")
   var memberfun=MemberFunction()

   memberfun.Lambda()
   memberfun.LocalFunction()
   memberfun.inLinefunction("Fatma Alawami", ::print)


   println("***********infix function*************")

   var userdefined=UserDefined()
   userdefined.define1("fatma")
   var return1=userdefined.defind2()
   println("$return1")
}
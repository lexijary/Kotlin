import kotlin.system.exitProcess

fun main(args: Array<String>) {
   if (args.size != 3) {
    println("Error")
    exitProcess(1) // echo $?
   }  
   else {
    val num1 = args[0].toInt()
    val num2 = args[1].toInt()
    val num3 = args[2].toInt()
    val sum = num1 + num2 + num3
    val average = sum / 3

    val grade = when (average) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }

    println(grade)
   }
    


}
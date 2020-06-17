package collections

fun initArray(){
    val variables = arrayOf(Pair("Kotlin","101"), Pair("Java","101"))
    variables.forEach {
        println("${it.first} - ${it.second}")
    }
    val booleans = booleanArrayOf(true, false, true)
    booleans.forEach {
        println(it)
    }
}
fun main(args : Array<String>){
    initArray()
}
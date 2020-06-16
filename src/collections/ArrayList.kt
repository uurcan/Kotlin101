package collections

fun main(args : Array<String>){
    val list = arrayListOf(1,2,3)
    list.forEach{ println(it)}

    val list2 = arrayListOf(Pair("Kotlin","101"),
                Pair("Java","101"),
                Pair("Android","101"))

    list2.add(Pair("C++","101"))
    list2.forEach{println("${it.first} - ${it.second}")}
}
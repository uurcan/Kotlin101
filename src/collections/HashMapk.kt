package collections

fun main(){
    val dict = hashMapOf(
            "Java" to "101",
            "Kotlin" to "101",
            "C++" to "101"
    )
    println("Current language ${dict["Java"]}")

    for ((k,v)in dict)
        println("Key in $k has value $v")

    for (k in dict.keys)
        println("Key in $k with value '${dict[k]}'")

    println("Loop using entry set")

    for (n in dict.entries)
        println("Key ${n.key} with value ${n.value}")
}
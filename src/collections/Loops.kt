package collections

fun main(){
    val languages = arrayOf("Java","Kotlin","C++")

    print("Programming is hard ")
    for (l in languages)
        print("$l, ")

    var i = languages.size
    while (i > 0){
        i--
        print("${languages[i]}, ")
    }
}
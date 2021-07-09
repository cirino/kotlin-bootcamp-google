package example.myapp.example

data class Fish (var name: String)

//fun fishExamples() {
//    val fish = Fish("splashy")
//    with(fish.name) {
//        println(capitalize())
//    }
//}

fun fishExamples2() {
    val fish = Fish("splashy")
    myWith(fish.name) {
        println(capitalize())
    }
//    fish.run {
//        println(name)
//    }

//    val fish2 = Fish("splashy").apply {
//        name = "shark"
//    }
//    println(fish2.name)

    println(fish.let{ it.name.capitalize() }
        .let{ it + "fish" }
        .let{ it.length}
        .let{ it + 31}
    )
    println(fish.name)

}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun main() {
//    fishExamples()
    fishExamples2()
}

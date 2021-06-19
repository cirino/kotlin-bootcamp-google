package example.myapp.decor

data class Decoration(val rocks: String) {
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270)
}

fun makeDecorations() {

    val data1 = Decoration("granite")
    println(data1)

    val data2 = Decoration("slate")
    println(data2)

    val data3 = Decoration("slate")
    println(data3.rocks)

    println(data1 == data2)
    println(data3.equals(data2))
}

data class Decorations2(
    val rocks: String,
    val wood: String,
    val diver: String){
}

fun makeDecorations2() {
    val data4 = Decorations2(
        "crystal",
        "wood",
        "diver")

    println(data4)

    // desestruturando objeto para variáveis
    val (rock, _, diver) = data4
    println(rock)
//    println(wood) // _ ignora a posição no objeto
    println(diver)
}

fun main() {
//    makeDecorations()
    makeDecorations2()

    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}

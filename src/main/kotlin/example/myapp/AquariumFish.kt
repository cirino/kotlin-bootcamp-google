package example.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal){
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("come peixe")
    }
}

class Plecostomus: FishAction, FishColor by GoldColor {
    override fun eat() {
        println("come alga")
    }
}

object GoldColor: FishColor {
    override val color = "padrão gold"
}

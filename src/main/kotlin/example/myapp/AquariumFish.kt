package example.myapp

sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal){
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
        get() = "Goldinho"
}

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("come peixe")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("come alga"),
    FishColor by fishColor


object GoldColor: FishColor {
    override val color = "padrão gold"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}
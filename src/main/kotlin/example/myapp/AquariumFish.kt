package example.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
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

object GoldColor : FishColor {
    override val color = "padrao gold"
}

package example.myapp

interface FishAction {
    fun eat()
}

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("comer")
}

//interface AquariumAction {
//    fun eat()
//    fun jump()
//    fun clean()
//    fun catchFish()
//    fun swim()  {
//        println("swim")
//    }
//}

class Shark: AquariumFish() {
    override val color = "gray"
    override fun eat() {
        println("Tubarao come peixe")
    }
}

class Plecostomus: AquariumFish() {
    override val color = "gold"
    override fun eat() {
        println("Cascudo come alga")
    }
}

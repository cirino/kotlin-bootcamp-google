package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}

fun buildAquarium2() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
//    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l\n")
}

fun buildAquarium3() {
    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printSize()
}

fun buildAquarium4() {
    val aquarium8 = Aquarium(width = 25, length = 25, height = 40)
    aquarium8.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    println("Shark: ${shark.color}")
    shark.eat()

    println("---")

    val plecostomuse = Plecostomus()
    println("Plecostomuse: ${plecostomuse.color}")
    plecostomuse.eat()
}

fun main() {
    println("Manda o sub para o CasaDoDev")

//    buildAquarium()
//    buildAquarium2()
//    buildAquarium3()
//    buildAquarium4()

    makeFish()

}

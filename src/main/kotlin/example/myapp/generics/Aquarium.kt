package example.myapp.generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) {
            "water supply needs processing first"
        }
        println("adding water from $waterSupply")
    }
}


fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)

//    val aquarium3 = Aquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//    }

//    val aquarium4 = Aquarium("string")
//    println(aquarium4.waterSupply)

    val aquarium5 = Aquarium(LakeWater())
    aquarium5.waterSupply.filter()
    aquarium5.addWater()

}

fun main() {
    genericsExample()
}
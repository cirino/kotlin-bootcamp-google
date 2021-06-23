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

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
        println("Aquario limpo")
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("água adicionada")

//        check(!waterSupply.needsProcessing) {
//            "water supply needs processing first"
//        }
//        println("adding water from $waterSupply")
    }

}

fun addItemTo(aquarium: Aquarium<WaterSupply>) {
    println("item adicionado")
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquario está limpo: ${!aquarium.waterSupply.needsProcessing}")
}

inline fun <reified T: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is T

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T


fun genericsExample() {
//    val aquarium = Aquarium(TapWater())
//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
//    aquarium.waterSupply.addChemicalCleaners()
//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)

//    val aquarium3 = Aquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//    }

//    val aquarium4 = Aquarium("string")
//    println(aquarium4.waterSupply)

//    val aquarium5 = Aquarium(LakeWater())
//    aquarium5.waterSupply.filter()
//    aquarium5.addWater()

//    val aquarium6 = Aquarium(TapWater())
//    addItemTo(aquarium6)

//    val cleaner = TapWaterCleaner()
//    val aquarium7 = Aquarium(TapWater())
////    aquarium7.waterSupply.addChemicalCleaners()
//    aquarium7.addWater(cleaner)

//    val aquarium8 = Aquarium(TapWater())
//    isWaterClean(aquarium8)

//    val aquarium9 = Aquarium(TapWater())
//    println(aquarium9.hasWaterSupplyOfType<TapWater>())

//    val aquarium10 = Aquarium(TapWater())
//    println(aquarium10.waterSupply.isOfType<TapWater>())
}



fun main() {
    genericsExample()


}

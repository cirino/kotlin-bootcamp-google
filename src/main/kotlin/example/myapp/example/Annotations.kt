package example.myapp.example
import kotlin.reflect.full.*    // required import

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImAPlant class Plant {
    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

fun testAnnotations() {
    val classObj = Plant::class

    val findAnnotation = classObj.findAnnotation<ImAPlant>()
    println(findAnnotation)

    for (m in classObj.annotations) {
        println(m.annotationClass)
    }
}

annotation class ImAPlant

fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop  // breaks to outer loop
        }
    }
}


fun main() {
//    testAnnotations()
    labels()
}

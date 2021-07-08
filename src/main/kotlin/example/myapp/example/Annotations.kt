package example.myapp.example
import kotlin.reflect.full.*    // required import


@ImAPlant class Plant {
    fun trim() {}
    fun fertilize() {}
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

fun main() {
    testAnnotations()
}

package creational.singleton

/**
 * In Kotlin, singleton pattern is basically consisted of "Object" definition.
 * So this example is not necessary, but also simple use case purpose.
 */
object SingleObject {
    /**
     * in JVM instance : "INSTANCE" field is created
     */
    fun getInstance(): SingleObject = this

    fun showMessage() = println("Hello Singleton")
}
package creational.singleton

fun main() {
    val singleObject: SingleObject = SingleObject.getInstance()

    // show the message
    singleObject.showMessage()
}
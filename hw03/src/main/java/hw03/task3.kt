package hw03

fun main() {
    var studentName: String? = null

    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let { println("Hello, $it!") }
}
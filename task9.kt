class Vector(val x: Double, val y: Double, val z: Double) {
    fun length() = kotlin.math.sqrt(x * x + y * y + z * z)

    fun dot(other: Vector) = x * other.x + y * other.y + z * other.z

    infix fun infixDot(other: Vector) = dot(other)

    operator fun times(other: Vector) = dot(other)
}

fun dotProduct(first: Vector, second: Vector) =
    first.x * second.x + first.y * second.y + first.z * second.z

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)
    println(v1.length())
    println(v1.dot(v2))
    println(v1 infixDot v2)
    println(v1 * v2)
    println(dotProduct(v1, v2))
}
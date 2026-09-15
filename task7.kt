fun sqr(n: Double) = n * n

fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + kotlin.math.sqrt(d)) / (2 * a)
            val x2 = (-b - kotlin.math.sqrt(d)) / (2 * a)
            println("Корни: $x1, $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Корень: $x")
        }
        else -> println("Действительных корней нет")
    }
}

fun main() {
    quadraticRoot(1.0, -3.0, 2.0)
}
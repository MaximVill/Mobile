class NumberArray(val values: IntArray) {
    fun sumOfPositives(): Int {
        var sum = 0
        for (value in values) {
            if (value > 0) sum += value
        }
        return sum
    }

    fun product(): Long {
        var product = 1L
        for (value in values) {
            product *= value
        }
        return product
    }

    fun average(): Double {
        var sum = 0
        for (value in values) {
            sum += value
        }
        return sum.toDouble() / values.size
    }
}

fun main() {
    val numbers = NumberArray(intArrayOf(-3, 5, 7, -2, 4))
    println(numbers.sumOfPositives())
    println(numbers.product())
    println(numbers.average())
}
fun productFor(array: IntArray): Long {
    var product = 1L
    for (value in array) {
        product *= value
    }
    return product
}

fun productWhile(array: IntArray): Long {
    var product = 1L
    var i = 0
    while (i < array.size) {
        product *= array[i]
        i++
    }
    return product
}

fun productForEach(array: IntArray): Long {
    var product = 1L
    array.forEach { product *= it }
    return product
}

fun main() {
    val array = intArrayOf(2, 4, 6, 1, 9, 3)
    println(productFor(array))
    println(productWhile(array))
    println(productForEach(array))
    println(array.reduce { acc, value -> acc * value })
    println(array.min())
    println(array.max())
}
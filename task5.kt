fun printPeaksFor(array: IntArray) {
    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            println(array[i])
        }
    }
}

fun printPeaksWhile(array: IntArray) {
    var i = 1
    while (i < array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            println(array[i])
        }
        i++
    }
}

fun printPeaksForEach(array: IntArray) {
    array.forEachIndexed { index, value ->
        if (index in 1 until array.size - 1 && value > array[index - 1] && value > array[index + 1]) {
            println(value)
        }
    }
}

fun main() {
    val array = intArrayOf(1, 5, 2, 8, 3, 9, 1)
    printPeaksFor(array)
    printPeaksWhile(array)
    printPeaksForEach(array)
}
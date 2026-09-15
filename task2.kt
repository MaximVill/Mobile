fun main() {
    var count = 0
    var sum = 0
    while (true) {
        val n = readln().toInt()
        if (n == 0) break
        count++
        sum += n
    }
    val average = if (count > 0) sum.toDouble() / count else 0.0
    println("Количество: $count")
    println("Сумма: $sum")
    println("Среднее: $average")
}
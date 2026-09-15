fun main() {
    val target = (0..10).random()
    while (true) {
        val guess = readln().toInt()
        when {
            guess > target -> println("Много")
            guess < target -> println("Мало")
            else -> {
                println("Угадал")
                break
            }
        }
    }
}
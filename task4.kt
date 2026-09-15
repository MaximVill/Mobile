fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2..number / 2) {
        if (number % i == 0) return false
    }
    return true
}

fun main() {
    val n = readln().toInt()
    var found = 0
    var candidate = 2
    while (found < n) {
        if (isPrime(candidate)) {
            found++
            println("$found-ое число: $candidate")
        }
        candidate++
    }
}
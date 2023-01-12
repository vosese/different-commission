fun main() {
    val result = comission(amount = 75_000)
    println("Комиссия: $result")
}

fun comission(typeCard: String = "VK Pay", history: Int = 0, amount: Int): Any {
    return when (typeCard) {
        "VK Pay" -> 0
        "MasterCard" -> if (amount + history < 75_000) 0 else (amount * 0.006 + 20)
        "Maestro" -> if (amount + history < 75_000) 0 else (amount * 0.006 + 20)
        "Visa" -> if (amount >= 4666.666666667) (amount * 0.0075).toFloat() else 35
        "Мир" -> if (amount >= 4666.666666667) (amount * 0.0075).toFloat() else 35
        else -> "Error"
    }
}
import kotlin.math.max

fun main() {
    println(commission("VkPay", 750, 0))
    println(commission("VkPay", 30000, 0))
    println(commission("VkPay", 800000, 0))
}

fun commission(typeCard: String, amount: Int, history: Int): Int {
    return when (typeCard) {
        "VkPay" -> if (amount + history > 150000) -1 else max(35, (amount * 0.03).toInt())
        else -> -2
    }
}


fun main() {
    val amount: Int = 200

    println("Сумма платежа при текущей продаже на $amount р. при различных сценариях")
    println()

    println("Сумма платежа составляет: ${calculateFee(amount, total = 500, exclusive = true)} р.")
    println("Сумма платежа составляет: ${calculateFee(amount, total = 500, exclusive = false)} р.")
    println()

    println("Сумма платежа составляет: ${calculateFee(amount, total = 5_000, exclusive = true)} р.")
    println("Сумма платежа составляет: ${calculateFee(amount, total = 5_000, exclusive = false)} р.")
    println()

    println("Сумма платежа составляет: ${calculateFee(amount, total = 11_000, exclusive = true)} р.")
    println("Сумма платежа составляет: ${calculateFee(amount, total = 11_000, exclusive = false)} р.")
    println()

    println("Сумма платежа составляет: ${calculateFee(amount, total = 100_000, exclusive = true)} р.")
    println("Сумма платежа составляет: ${calculateFee(amount, total = 100_000, exclusive = false)} р.")

}

fun calculateFee(
    amount: Int,
    total: Int,
    exclusive: Boolean
): Double {
    var tax: Double = when {
        total <= 1000 -> 0.3
        total in 1001..10_000 -> 0.25
        total in 10_001..50_000 -> 0.20
        else -> 0.15
    }

    if (exclusive) {
        tax -= 0.05
    }

    return amount * tax
}
import kotlin.math.pow

fun main() {
    val mass = 70
    val height = 1.73

    val index = bodyMassIndex(mass, height)
    val verdict = when {
        index <= 16 -> "Выраженный дефицит массы тела"
        index > 16 && index <= 18.5 -> "Недостаточная (дефицит) масса тела"
        index > 18.5 && index <= 25 -> "Норма"
        index > 25 && index <= 30 -> "Избыточная масса тела (предожирение)"
        index > 30 && index <= 35 -> "Ожирение"
        index > 35 && index <= 40 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println("ИМТ = $index: $verdict")
}

fun bodyMassIndex(
    mass: Int,
    height: Double
): Double {
    return mass / height.pow(2)
}



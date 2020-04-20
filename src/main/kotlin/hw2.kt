import kotlin.math.pow

fun main() {
    val mass = (30..150).random()
    val height = 1.70

    val index = bodyMassIndex(mass, height)
    val verdict = toMakeConclusion(index)

    println("Масса тела: $mass кг; Рост: $height м.")
    println("ИМТ = $index: $verdict")
}

private fun toMakeConclusion(index: Double): String = when {
    index <= 16 -> "Выраженный дефицит массы тела"
    index > 16 && index <= 18.5 -> "Недостаточная (дефицит) масса тела"
    index > 18.5 && index <= 25 -> "Норма"
    index > 25 && index <= 30 -> "Избыточная масса тела (предожирение)"
    index > 30 && index <= 35 -> "Ожирение"
    index > 35 && index <= 40 -> "Ожирение резкое"
    else -> "Очень резкое ожирение"
}


fun bodyMassIndex(
    mass: Int,
    height: Double
): Double = mass / height.pow(2)




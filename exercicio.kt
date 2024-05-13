fun main() {
    transformYear(2)
    println(quantCharac("Análise e Desenvolvimento de Sistemas"))
    println(cube(5))
    println(miles(8f))
    changeCharac("One Piece é simplesmente o melhor mangá que existe e continuará sendo o melhor pra sempre!")
}

fun transformYear (year: Int) {
    val months = year * 12
    val days = year * 365
    val hours = days * 24
    val minutes = hours * 60
    val second = minutes * 60
    println("$year anos equivale a: \n$months meses \n$days dias \n$hours horas \n$minutes minutos \n$second segundos")
}

fun quantCharac (phrase: String) = phrase.length

fun cube (number: Int) = number * number * number

fun miles (number: Float) = number * 1.6f

fun changeCharac (str: String) {
    println(str.lowercase().replace("a", "x").replace("á", "x"))
}


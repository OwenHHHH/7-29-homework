fun main () {
    val x = RationalNumber(3,4)
    val y = RationalNumber(4,3)
    var z = add(x, y)
    println("$z")
    val w = toDouble(x)
    println("$w")
}
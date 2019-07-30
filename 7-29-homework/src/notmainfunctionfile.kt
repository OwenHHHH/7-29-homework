package myPackage

fun toDouble (w: RationalNumber) {
    return input.numerator.toDouble()/input.denominator.toDouble()
}
//
//fun toDouble(input: RationalNumber): Double {
//    return input.numerator.toDouble()/input.denominator.toDouble()
//}//teacher version
//

fun add (x: RationalNumber, y: RationalNumber): Int {

    val numeratorfinal = (x.numerator * y.denominator) + (y.numerator * x.denominator)

    val denominatorfinal = (x.denominator * y.denominator)
    return RationalNumber(numeratorfinal, denominatorfinal)
}
//
//fun add(valueOne: RationalNumber, valueTwo: RationalNumber): RationalNumber {
//    val numeratorOne = valueOne.numerator * valueTwo.denominator
//    val numeratorTwo = valueTwo.numerator * valueOne.denominator
//    val denominatorOne = valueOne.denominator * valueTwo.denominator
//    return RationalNumber ((numeratorOne+numeratorTwo), denominatorOne)
//}


//can you explain why this doesn't work or what the code should be?
//because I don't get why this doesn't work



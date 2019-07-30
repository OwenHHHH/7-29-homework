fun toDouble (x: RationalNumber) {
    return(x.numerator/x.denominator)
}

fun add (x: RationalNumber, y: RationalNumber){

    return(((x.numerator*y.denominator)+(y.numerator*x.denominator))/(x.denominator*y.denominator))
}


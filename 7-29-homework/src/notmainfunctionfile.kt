fun toDouble (w: RationalNumber) {
    return(w.numerator/w.denominator)
}

fun add (x: RationalNumber, y: RationalNumber){

    return(((x.numerator*y.denominator)+(y.numerator*x.denominator))/(x.denominator*y.denominator))
}

//can you explain why this doesn't work or what the code should be?
//because I don't get why this doesn't work

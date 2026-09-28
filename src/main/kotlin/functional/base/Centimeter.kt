package functional.base.centimeter

import kotlin.math.abs

class Centimeter(val value: Double) {
    fun plus(other: Centimeter): Centimeter =
        Centimeter(value + other.value)

    fun times(other: Double): Centimeter =
        Centimeter(value * other)

    override fun toString(): String = "$value cm"
}

val Int.cm get() = Centimeter(this.toDouble())

fun distance(from: Centimeter, to: Centimeter): Centimeter =
    Centimeter(abs(to.value - from.value))

fun main() {
    val f1 = Centimeter::plus
    val f2 = Centimeter::times
    val f3 = Centimeter::value
    val f4 = Centimeter::toString
    val f5 = Centimeter(1.0)::plus // 2
    val f6 = Centimeter(2.0)::times // 4 // 4
    val f7 = Centimeter(3.0)::value //3
    val f8 = Centimeter(4.0)::toString // "4 cm"
    val f9 = Int::cm
    val f10 = 123::cm /// 123.00
    val f11 = ::distance
    println("result for number f1 $f1")
    println("result for number f2 $f2")
    println("result for number f3 $f3")
    println("result for number f4 $f4")
    println("result for number f5 $f5")
    println("result for number f6 $f6")
    println("result for number f7 $f7")
    println("result for number f8 $f8")
    println("result for number f9 $f9")
    println("result for number f10 $f10")
    println("result for number f11 $f11")
}

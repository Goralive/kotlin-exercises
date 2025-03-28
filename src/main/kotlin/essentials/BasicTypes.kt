package essentials

import kotlin.random.Random

fun basicTypes() {
    println(1 + 2 * 3) // 7
    println(10 % 3) // 1

    println(-1 % 3) // 1
    println(8.8 / 4) // 2.2
    println(10 / 3) // 3
    println(11.toFloat()) // 11.0

    println(10.10.toInt()) // 10
    var a = 10
    a += 5
    println(a) // 15

    a -= 3
    println(a) // 12

    a++
    println(a) // 13

    println(a++) // 13

    println(a) // 14

    println(--a) // 13

    println(a) // 13

    println(true && false) // false

    println(true || false) // true
     println(!!!!true) // true

    println('A'.code) //65
     println('A' + 1) // B

    println('C'.code) // 67
    println("A + B") // A + B
    println("A" + "B") // AB

    println("A" + 1) // A1

    println("A" + 1 + 2) // A12

    val bigger = if (Random.nextInt() < a) "Hello" else "GoodBuy"


    println(bigger)
}

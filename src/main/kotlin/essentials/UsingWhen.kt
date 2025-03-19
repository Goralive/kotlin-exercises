package essentials

import kotlin.random.Random

private val magicNumbers = listOf(7, 13)

fun name(a: Any?): String = when (a) {
    null -> "Nothing"
    1, 2, 3 -> "Small number"
    in magicNumbers -> "Magic number"
    in 4..100 -> "Big number"
    is String -> "String: $a"
    is Int, is Long -> "Int or Long: $a"
    else -> "No idea, really"
}
package essentials.classes

import com.sun.org.apache.xerces.internal.util.XMLChar.trim


fun lengthOfLastWord(s: String): Int {
    val count = s.trimEnd().split(" ")
    return count.last().length
}

fun main() {
  val s = "   fly me   to   the moon  "
    lengthOfLastWord("Lenght -> $s")
}
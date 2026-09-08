package essentials.classes.data

import essentials.classes.PersonData

fun main() {
    // Write your code here
    val person = PersonData("John", 30)
    println(person)
    val person2 = person.copy(name = "Jane")
    val person3 = PersonData("Jane", 30)
    println("Is equal? ${person2 == person3}")
    println("Hashcode p1 ${person.hashCode()}")
    println("Hashcode p2 ${person2.hashCode()}")
    println("Hashcode p3 ${person3.hashCode()}")
    val (name, age) = person2
    println("Name and age for person2 $name, $age")
}

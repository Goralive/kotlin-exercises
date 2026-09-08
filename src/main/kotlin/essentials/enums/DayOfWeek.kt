package essentials.enums.dayofweek

// TODO
enum class DayOfWeek(val dayName: String, val isWeekend: Boolean) {
    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    fun nextDay() : DayOfWeek {
        return DayOfWeek.entries[ordinal + 1]
    }
}

fun main() {
    val friday: DayOfWeek = DayOfWeek.FRIDAY
    println(friday.dayName) // Friday
    println(friday.isWeekend) // false
    val saturday: DayOfWeek = friday.nextDay()
    println(saturday.dayName) // Saturday
    println(saturday.isWeekend) // true
}

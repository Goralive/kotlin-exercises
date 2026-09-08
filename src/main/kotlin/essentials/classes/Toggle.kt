package essentials.classes

class Toggle(id: String, var isOn: Boolean = false) : View(id, true) {
    fun click() = if (isOn) this.isOn = false else this.isOn = true


}
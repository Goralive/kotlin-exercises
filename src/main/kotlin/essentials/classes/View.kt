package essentials.classes

open class View(
    val id: String,
    var isVisible: Boolean
) {
    fun show() {
        this.isVisible = true
    }

    fun hide() {
        this.isVisible = false
    }
}
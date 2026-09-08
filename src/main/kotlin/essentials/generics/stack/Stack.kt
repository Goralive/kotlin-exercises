package essentials.generics.stack

class Stack<T> {
    val stack = mutableListOf<T>()

    fun push(t: T) = stack.add(t)

    fun peek(): T? = stack.lastOrNull()
    fun isEmpty(): Boolean = stack.isEmpty()
    fun pop(): T? {
        return if (isEmpty()) null
        else stack.removeAt(size() - 1)
    }

    fun size(): Int = stack.size

}

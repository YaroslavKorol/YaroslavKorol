package helpers

class Stack {
    val elements: MutableList<Any> = mutableListOf()

    fun isEmpty() = elements.isEmpty()

    fun add(item: Any) {
        elements.add(item)
        println("Добавлен элемент: $item")
        println("Элементы стака: $elements")
    }

    fun delete(index: Int): Any {
        val item = elements.elementAt(index)

        if (!isEmpty()) {
            elements.removeAt(elements.size - (elements.size - index))
            println("Удален элемент: $item")
            println("Элементы стака: $elements")

        }

        return item
    }
}

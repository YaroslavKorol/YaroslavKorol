package tests

import helpers.Stack
import org.junit.Test
import java.io.File


class Part2 {

    @Test
    fun task1() {
        val w = "tr"
        val lineList = mutableListOf<String>()
        val textList = mutableListOf<String>()

        File("part2_task1.txt").useLines { lines -> lines.forEach {
            lineList.add(it)
            if (it.indexOf(w)>-1) textList.add(it)
            }
        }
        println("Текст в файле:")
        lineList.forEach { println(it) }
        println("Строка(и) имеющая искаемое значение '$w':")
        textList.forEach { println(it) }
        }


    @Test
    fun task2() {
        val stackList = Stack()

        stackList.add("das")
        stackList.add(5)
        stackList.add(15)
        stackList.delete(2)
        stackList.add(30)
        stackList.delete(0)
    }

}




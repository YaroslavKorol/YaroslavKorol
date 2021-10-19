package tests

import org.junit.Test
import java.io.File


class Part2 {

    @Test
    fun task1() {
        val W = "tr"
        val lineList = mutableListOf<String>()
        val textList = mutableListOf<String>()

        File("part2_task1.txt").useLines { lines -> lines.forEach {
            lineList.add(it)
            if (it.indexOf(W)>-1) textList.add(it)
            }
        }
        println("Текст в файле:")
        lineList.forEach { println(it) }
        println("Строка(и) имеющая искаемое значение '$W':")
        textList.forEach { println(it) }
        }
    }




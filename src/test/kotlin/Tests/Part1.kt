package Tests

import org.junit.Test


class Part1 {
@Test
    fun task1() {
        println("Числа [1;99] и которые кратные 3:")
        for (i in 1..100) {
            if (i % 3 == 0)
                println(i)
        }
    }
}
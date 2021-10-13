package Tests

import org.junit.Test


class Part1 {

    @Test
    fun task1() {
        println("Числа отразка от 1 до 99 кратные 3:")
        for (i in 1..99) {
            if (i % 3 == 0) println(i)
        }
    }


    @Test
    fun task2() {
        val k = (1..10).random()
        println("Значение k равно $k \nЧисла кратные числу k:")
        for (i in 10..99) {
            if (i % k == 0) println(i)
        }
    }


    @Test
    fun task3() {
        val a = (1..900).random()
        val b = (1..900).random()
        val c = (1..900).random()
        val d = (1..900).random()
        val res = a + b + c + d
        var out = res
        var len = 0

        while (out != 0) {
            len++
            out /= 10
        }
        println("Даны 4 числа: $a, $b, $c, $d. \nСумма чисел равна $res содержит $len цифры.")
    }


    @Test
    fun task4() {
        val a = (-100..100).random()
        val b = (-100..100).random()
        val c = (-100..100).random()
        val d = (-100..100).random()

        var max: Int
        var min: Int

        if (a > b) {max = a; min = b} else {max = b; min = a}

        if (c > max) {max = c} else if (min > c) {min = c}

        if (d > max) {max = d} else if (min > d) {min = d}

        println("Даны 4 числа: $a, $b, $c, $d.\nМаксимальное число $max.\nМинимальное число $min.")
    }


    @Test
    fun task5() {
        var a = 5
        var b = 10
        val c = a

        println("Вариант А: \nНачальные значения $a, $b")
        a = b
        b = c
        println("Конечный результат $a, $b")

        println("Вариант Б: \nНачальные значения $a, $b")
        a = a + b
        b = a - b
        a = a - b
        println("Конечный результат $a, $b")
    }


    @Test
    fun Task6() {
        val k = (1..27).random()

        println("Значение k равно $k \nCумма цифр которые равны числу k :")

        for (i in 100..999) {
            var n = i
            var a = 0
            while (n > 0) {
                a += (n % 10)
                n /= 10
            }
            if (k == a) println(i)
        }
    }


    private fun fibonachiMethod(a: Int): Int {
        if (a == 0 || a == 1) return a

        return fibonachiMethod(a - 1) + fibonachiMethod(a - 2)

    }

    @Test
    fun task7() {
        val k = (5..10).random()
        println("Последовательность Фиббоначи из $k чисел:")
        for (i in 0 until k) println(fibonachiMethod(i))

    }


    private fun sumDigit(N: Int): Int {
        return if (N == 0) 0 else N % 10 + sumDigit(N / 10)
    }

    @Test
    fun task8() {
        val N = (100..1000).random()
        println("Сумма цифр натурального числа $N:")
        println(sumDigit(N))
    }


    private fun sumNumber(N: Int): Int {
        return if (N == 0) 0 else if (N % 10 == 1) 1 + sumNumber(N / 10) else sumNumber(N / 10)
    }

    @Test
    fun task9() {
        val k = 11918

        println("Количество единиц в натуральном числе $k")
        println("составляет " + sumNumber(k) + " еденицы")
    }

}
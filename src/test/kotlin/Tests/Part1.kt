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

    @Test
    fun task2() {

        val k = 7
        println("2. Числа двузначные числа,кратные $k:")
        for (i in 10..100) {
            if (i % k == 0)
                println(i)
        }
    }

    @Test
    fun task3() {
        val a = (1..900).random()
        val b = (1..900).random()
        val c = (1..900).random()
        val d = (1..900).random()

        println(" 3. Сгенерировано 4 числа $a, $b, $c, $d ")
        println("Определить сколько цифр содержит сумма полученных чисел ")
        val summa = (a + b + c + d)
        println(summa)
        val length = summa.toString().length
        println(length)
    }


    @Test
    fun task4() {
        val a = (1..100).random()
        val b = (1..100).random()
        val c = (1..100).random()
        val d= (1..100).random()

        var max: Int
        var min: Int

        println(" 4. Даны четыре числа $a, $b, $c, $d ")
        println("Определить  наибольшее и наименьшее среди них")

        if (a > b) {max = a; min = b} else {max = b; min = a}
        if (c > max) {max = c} else if (min > c) {min = c}
        if (d > max) {max = d} else if (min > d) {min = d}

        println("Наибольшее число $max.Наименьшее число $min.")
    }

    @Test
    fun task5() {
        var a = (15)
        var b = (11)
        println(" 5(а). Даны два числа a-$a, b-$b ")
        println("Поменять местами числа у переменных c добавлением 3ий переменной")
        var c = (0)
        c = a + b
        a = c - a
        b = c - b
        println("a-$a,b-$b")

        println(" 5(б). Даны два числа a-$a, b-$b ")
        println("Поменять местами числа у переменных не добавляя 3ую переменную")
        a = (a + b)
        b = (a - b)
        a = (a - b)
        println("a-$a,b-$b")
    }

    @Test
    fun Task6() {
        val k = (1..26).random()

        println("Число k равно $k Cумма цифр трехзначнего числа которые равны k :")

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
        println("Напечатать на экране последовательность Фиббоначи из $k элементов")
        println("Последовательность Фиббоначи из $k элементов:")
        for (i in 0 until k) println(fibonachiMethod(i))

    }


    private fun sumDigit(N: Int): Int {
        return if (N == 0) 0 else N % 10 + sumDigit(N / 10)
    }

    @Test
    fun task8() {
        val N = (100..1000).random()
        println("Дано натуральное число $N, Вычислить сумму его цифр")
        println("Сумма цифр числа $N:")
        println(sumDigit(N))
    }


    private fun sumNumber(N: Int): Int {
        return if (N == 0) 0 else if (N % 10 == 1) 1 + sumNumber(N / 10) else sumNumber(N / 10)
    }

    @Test
    fun task9() {
        val n = 12141

    println("Дано натуральное число $n, Вычислить количество единиц. ")
    println("Количество единиц составляет " + sumNumber(n)  )
    }

}

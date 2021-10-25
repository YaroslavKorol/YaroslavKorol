package Tests

import org.junit.Test
import java.lang.Integer.sum


class Part1 {

    @Test
    fun `Задача №1 | Напечатайте на экране монитора числа, принадлежащие отрезку 1-99 и кратные числу 3` () {
        println("Числа, принадлежащие отрезку [1;99] и кратные числу 3:")
        for (i in 1..99) {
            if (i % 3 == 0)
                println(i)
        }
    }

    @Test
    fun `Задача №2 | Напечатайте на экране все двузначные числа, кратные данному числу k` () {
        val k = 10
        println("Все двузначные числа, кратные числу $k:")
        for (i in 10..99)
            if (i % k == 0)
                println(i)
    }

    @Test
    fun `Задача №3 | Датчиком случайных чисел сгенерируйте четыре натуральных числа в интервале от 1 до 900, определите, сколько цифр содержит сумма полученных чисел, нельзя использовать строки, списки, массивы` () {

        val number1 = (1..900).random()
        val number2 = (1..900).random()
        val number3 = (1..900).random()
        val number4 = (1..900).random()

        val result = (number1 + number2 + number3 + number4)
        var sum = result
        var length = 0
        while (sum !== 0) {
            ++length
            sum /= 10
        }

        println("Полученные числа: $number1; $number2; $number3; $number4.")
        println("Результат. Сумма $result содержит $length цифры.")

    }

    @Test
    fun `Задача №4 | Даны четыре числа, найдите наибольшее и наименьшее среди них, используя не более четырех сравнений` () {

        val a = (1..1000).random()
        val b = (1..1000).random()
        val c = (1..1000).random()
        val d = (1..1000).random()

        println("Дано 4 числа: $a, $b, $c, $d")
        println("Необходимо найти минимальное и максимальное из них.")
        var max: Int
        var min: Int

        if (a > b) {max = a; min = b}
        else {max = b; min = a}

        if (max < c) {max = c}
        else if (min > c) {min = c}

        if (max < d) {max = d}
        else if (min > d) {min = d}

        println("Максимальное число: $max")
        println("Минимальное число: $min")
    }

    @Test
    fun `Задача №5 (а) | Имеются две переменные одинакового типа целые или вещественные, обменяйте их значения используя дополнительную переменную` () {

        var a = 5
        var b = 9
        var c = 0

        c=a; a=b; b=c

        println("Переменная a=$a; b=$b.")
    }

    @Test
    fun `Задача №5 (б) | Имеются две переменные одинакового типа целые или вещественные, обменяйте их значения не вводя дополнительную переменную` () {

        var a = 5
        var b = 9

        a=a+b
        b=a-b
        a=a-b

        println("Переменная a=$a; b=$b.")
    }

    @Test
    fun `Задача №6 | Напишите программу нахождения всех трехзначных чисел, сумма цифр которых равна данному числу k, нельзя использовать строки, списки, массивы` () {
        val k = (10..20).random()

        println("Все трехзначные числа, сумма цифр которых равна числу $k:")

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


    private fun fibonachi(a: Int): Int {
        if (a == 0 || a == 1) return a

        return fibonachi(a - 1) + fibonachi(a - 2)

    }

    @Test
    fun `Задача №7 | Напечатать на экране последовательность Фиббоначи из k элементов, при решении использовать рекурсию, нельзя использовать строки, списки, массивы` () {

        val k = (1..10).random()
        println("Последовательность Фиббоначи из $k элементов:")
        for (i in 0 until k) println(fibonachi(i))
    }

    @Test
    fun `Задача №8 | Дано натуральное число N, вычислите сумму его цифр, при решении использовать рекурсию, нельзя использовать строки, списки, массивы` () {
        val n = 1337
        val sum = 0
        println(" " + (sum(n, sum)).toString())
    }

    private fun units(n: Int, y: Int): Int {
        var n = n
        var y = y
        var sum = 0
        if (n != 0) {
            sum += n % 10
            n = n / 10
            return if (sum == 1) {
                y++
                units(n, y)
            } else units(n, y)
        }
        return y
    }

    @Test
    fun `Задача №9 | Дано натуральное число N, вычислить количество единиц, при решении использовать рекурсию, нельзя использовать строки, списки, массивы` () {
        val n = 1112113
        val y = 0
        println(units(n, y))
    }
}

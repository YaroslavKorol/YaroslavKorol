package Tests

import org.junit.Test


class Part1 {

    @Test
    fun task1() {
        for (i in 1..99) {
            if (i % 3 == 0) {
                println("$i")
            }
        }
    }

    @Test
    fun task2() {
        val k = 10
        for (i in 10..99) {
            if (i % k == 0) {
                println("$i")
            }
        }
    }

    @Test
    fun task3() {
        val z = (1..900).random()
        val x = (1..900).random()
        val c = (1..900).random()
        val v = (1..900).random()

        var sum = z + x + c + v


        for (i in 1..4) {
            sum /= 10
            if (sum == 0) {
                println("$i")
                break
            }
        }
    }

    @Test
    fun task4() {
        val z = 9
        val x = 3
        val c = 5
        val v = 6

        var max = 0
        var min = 0

        if (z >= x) {
            max = z
            min = x
        } else {
            max = x
            min = z
        }

        var max2 = 0
        var min2 = 0

        if (c >= v) {
            max2 = c
            min2 = v
        } else {
            max2 = v
            min2 = c
        }

        if (max >= max2) println("Максимальное число $max")
        else println("Максимальное число $max2")

        if (min <= min2) println("Минимальное число $min")
        else println("Минимальное число $min2")
    }

    @Test
    fun task5_1() {

        var x = 7
        var y = 8
        println("Изначально x=$x y=$y")
        val k = y
        y = x
        x = k
        println("В итоге x=$x y=$y")
    }

    @Test
    fun task5_2() {
        var x = 7
        var y = 8
        println("Изначально x=$x y=$y")
        x += y
        y = x - y
        x -= y
        println("В итоге x=$x y=$y")
    }


    @Test
    fun task6() {
        val k = 25
        var l = 0
        println("Все трехзначные числа, сумма цифр которых равна числу $k")
        for (i in 100..999) {
            var sum = 0
            l = i
            for (i in 1..4) {
                if (l == 0) break
                sum += l % 10
                l /= 10
            }
            if (sum == k) println("$i")
        }

    }
}



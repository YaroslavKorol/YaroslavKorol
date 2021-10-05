package Tests

import org.junit.Test


class Part1 {

    @Test
    fun task1() {
       for (i in 1..99) {
          if (i % 3 == 0) println(i)
       }
    }



    @Test
    fun task2() {
        val k = (1..10).random()
        println("Значение k равно $k")
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

        while (out !== 0) {
            len ++
            out /= 10
        }
        println("Даны 4 числа: $a, $b, $c, $d. \nСумма чисел равна $res содержит $len цифры.")
    }

    @Test
    fun task4() {
        val a = (1..100).random()
        val b = (1..100).random()
        val c = (1..100).random()
        val d = (1..100).random()
        val max = maxOf(a,b,c,d)
        val min = minOf(a,b,c,d)

        println("Даны 4 числа: $a, $b, $c, $d. \nМаксимальное значение:$max. \nМинимальное значение:$min.")
    }

    @Test
    fun task5() {
        var a = 5
        var b = 10
        var c:Int

        println("Вариант А: \nНачальные значения $a, $b")
        c=a
        a=b
        b=c
        println("Конечные результат $a, $b")

        println("Вариант Б: \nНачальные результат $a, $b")
        a=a+b
        b=a-b
        a=a-b
        println("Конечные результат $a, $b")
    }

    @Test
    fun Task6(){
        var k = (1..27).random()

        println("Значение k равно $k \nРезультат:")

        for (i in  100..999){
            var n=i
            var a = 0
            while (n > 0){
                a += (n % 10)
                n /= 10
            }
            if (k==a) println(i)
        }
    }
//aa

}
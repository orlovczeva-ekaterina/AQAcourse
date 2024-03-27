package laba4

/* *   Четвертая лаба. (через owerride)
 * *   Задание 11: Создайте sealed class MathOperation и несколько объектов, представляющих
 * *   различные математические операции (например, Add, Subtract, Multiply, Divide).
 * *   Создайте функцию, которая принимает MathOperation и два числа,
 * *   и выполняет соответствующую операцию.
 * */

abstract class MO {
    abstract fun op(a: Int, b: Int)
}

sealed class MathOp : MO() {
    object Add : MathOp() {
        override fun op(a: Int, b: Int) {
            println("Сумма чисел равна ${a + b}")
        }
    }

    object Divide : MathOp() {
        override fun op(a: Int, b: Int) {
            if (b == 0) {
                println("Нельзя делить на ноль")
            } else {
                println("Частное чисел равно ${a / b}")
            }
        }
    }

    object Multiply : MathOp() {
        override fun op(a: Int, b: Int) {
            println("Произведение чисел равно ${a * b}")
        }
    }

    object Subtract : MathOp() {
        override fun op(a: Int, b: Int) {
            println("Разность чисел равна ${a - b}")
        }
    }
}

fun main() {
    val add = MathOp.Add
    println(add.op(5, 9))
    val divide = MathOp.Divide
    println(divide.op(27, 3))
    val multiply = MathOp.Multiply
    println(multiply.op(4, 6))
    val subtract = MathOp.Subtract
    println(subtract.op(5, 3))
}
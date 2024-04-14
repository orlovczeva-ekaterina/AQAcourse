package laba4

/* *   Четвертая лаба.
 * *   Задание 11: Создайте sealed class MathOperation и несколько объектов, представляющих
 * *   различные математические операции (например, Add, Subtract, Multiply, Divide).
 * *   Создайте функцию, которая принимает MathOperation и два числа,
 * *   и выполняет соответствующую операцию.
 * */

sealed class MathOperation1 {

    object Add : MathOperation1()
    object Subtract : MathOperation1()
    object Multiply : MathOperation1()
    object Divide : MathOperation1()

    fun operation(op: MathOperation1, a: Int, b: Int) = when (op) {
        is Add -> {
            println("Сумма чисел равна ${a + b}")
        }

        is Divide -> {
            if (b == 0) {
                println("Нельзя делить на ноль")
            } else {
                println("Частное чисел равно ${a / b}")
            }
        }

        is Multiply -> {
            println("Произведение чисел равно ${a * b}")
        }

        is Subtract -> {
            println("Разность чисел равна ${a - b}")
        }
    }
}

fun main() {
    val add = MathOperation1.Add
    println(add.operation(MathOperation1.Add, 5, 6))
    val divide = MathOperation1.Divide
    println(divide.operation(MathOperation1.Divide, 5, 0))
    val multiply = MathOperation1.Multiply
    println(multiply.operation(MathOperation1.Multiply, 5, 6))
    val subtract = MathOperation1.Subtract
    println(subtract.operation(MathOperation1.Subtract, 5, 2))
}


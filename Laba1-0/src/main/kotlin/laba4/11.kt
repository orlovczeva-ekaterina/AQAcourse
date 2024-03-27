package laba4

/* *   Четвертая лаба.
 * *   Задание 11: Создайте sealed class MathOperation и несколько объектов, представляющих
 * *   различные математические операции (например, Add, Subtract, Multiply, Divide).
 * *   Создайте функцию, которая принимает MathOperation и два числа,
 * *   и выполняет соответствующую операцию.
 * */

sealed class MathOperation {

    object Add : MathOperation()
    object Subtract : MathOperation()
    object Multiply : MathOperation()
    object Divide : MathOperation()

    fun operation(op: MathOperation, a: Int, b: Int) = when (op) {
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
    val add = MathOperation.Add
    println(add.operation(MathOperation.Add, 5, 6))
    val divide = MathOperation.Divide
    println(divide.operation(MathOperation.Divide, 5, 0))
    val multiply = MathOperation.Multiply
    println(multiply.operation(MathOperation.Multiply, 5, 6))
    val subtract = MathOperation.Subtract
    println(subtract.operation(MathOperation.Subtract, 5, 2))
}


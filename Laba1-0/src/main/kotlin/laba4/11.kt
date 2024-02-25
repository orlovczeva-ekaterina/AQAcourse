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
}

fun executeOperation(operation: MathOperation, a: Double, b: Double): Double {
    return when (operation) {
        is MathOperation.Add -> a + b
        is MathOperation.Subtract -> a - b
        is MathOperation.Multiply -> a * b
        is MathOperation.Divide -> if (b != 0.0) a / b else Double.NaN
    }
}

fun main() {
    println("Add: ${executeOperation(MathOperation.Add, 5.0, 3.0)}")
    println("Subtract: ${executeOperation(MathOperation.Subtract, 5.0, 3.0)}")
    println("Multiply: ${executeOperation(MathOperation.Multiply, 5.0, 3.0)}")
    println("Divide: ${executeOperation(MathOperation.Divide, 5.0, 0.0)}")
}

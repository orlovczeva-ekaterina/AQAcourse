package laba4

/* *   Четвертая лаба.
 * *   Задание 13: Создайте классы Engine и Tires.
 * *   Затем создайте класс Car, который получает Engine
 * *   и Tires через конструктор (Dependency Injection).
 * */

interface Engine {
    fun engineRunning()
}

class GasolineEngine : Engine {
    override fun engineRunning() {
        println("Двигатель работает на бензине")
    }
}

interface Tires {
    fun spinningTires()
}

class SummerTires : Tires {
    override fun spinningTires() {
        println("Шины крутятся")
    }
}

class CarDI(val engine: Engine, val tires: Tires) {
    fun carRunning() {
        engine.engineRunning()
        tires.spinningTires()
        println("Машина едет")
    }
}

fun main() {
    val fordEngine = GasolineEngine()
    val fordTires = SummerTires()
    val ford = CarDI(fordEngine, fordTires)
    ford.carRunning()
}
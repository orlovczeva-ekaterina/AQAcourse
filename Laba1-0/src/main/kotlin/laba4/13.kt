package laba4

/* *   Четвертая лаба.
 * *   Задание 13: Создайте классы Engine и Tires.
 * *   Затем создайте класс Car, который получает Engine
 * *   и Tires через конструктор (Dependency Injection).
 * */

interface Engine {
    fun work()
}

class SomeEngine : Engine {
    override fun work() {
        println("Двигатель вырабатывает энергию")
    }
}

interface Tires {
    fun spinningTires()
}

class CarTires : Tires {
    override fun spinningTires() {
        println("Колеса крутятся")
    }
}

class CarDI(private val engine: Engine, private val tires: Tires) {
    fun run() {
        engine.work()
        tires.spinningTires()
        println("Машина едет")
    }
}

fun main(){
    val engine = SomeEngine()
    val tires = CarTires()
    val car = CarDI(engine, tires)
    car.run()
}


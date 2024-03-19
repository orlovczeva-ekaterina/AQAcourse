package laba4

/* *   Четвертая лаба.
 * *   Задание 12 (старое): Создайте два класса: Mammal и CanFly.
 * *   В классе Mammal определите метод breastfeed(), а в классе CanFly - метод fly().
 * *   Затем создайте класс Bat, который сочетает в себе оба этих поведения (с помощью композиции).
 * */

/* * (Новое) Создайте модель компьютерной системы:
 * * Определите класс CPU с характеристиками, такими как frequency и cores.
 * * Определите класс Memory с полями size и type.
 * * Создайте класс Computer, который использует CPU и Memory для создания полной конфигурации компьютера.
 * * Добавьте метод для отображения информации о компьютере.
 * */

class CPU (val frequency: Double, val cores: Int){
    fun cpuinf (){
        println("У процессора частота $frequency а колличество ядер равно $cores ")
    }
}
class Memory (val size: Int, val type: String){
    fun memoryinf (){
        println("Размер памяти $size и тип памяти $type ")
    }
}
class Computer (private val cpu: CPU, private val memory: Memory, val name: String){
    fun inf(){
        println("Компуктер по имени $name имеет следующие характеристики:")
        cpu.cpuinf()
        memory.memoryinf()
    }
}

fun main(){
    val inteli5 = CPU(2.5,6)
    val DIMM = Memory(8, "Samsung")
    val laptop = Computer(inteli5, DIMM, "book")
    println(laptop.inf())
}



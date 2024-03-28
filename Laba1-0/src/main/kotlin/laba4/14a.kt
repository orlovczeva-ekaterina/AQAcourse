package laba4

/* * Создайте обобщенный класс Warehouse<T>, представляющий склад,
* *  который может хранить товары любого типа T.
* *  Также создайте обобщенный класс Inventory<T>, который отслеживает товары на
* *  складе и принимает экземпляр класса Warehouse<T> через конструктор.
* *
 */

interface Warehouses<T, K> {
    fun warehouseInf() {
    }
}

class Warehouse1<T, K>(val name: T, val shipment: K) : Warehouses<T, K> {
    override fun warehouseInf() {
        println("Название склада $name, товар $shipment")
    }
}

class Inventory1DI<T, K>(val warehouse1: Warehouse1<T, K>, val num: Int) {
    fun inventoryProduct() {
        println("Инвентаризация номер $num")
        warehouse1.warehouseInf()
    }
}

fun main() {
    val jeans = Warehouse1<Int, String>(3564, "Sexy jeans")
    val dress = Warehouse1<String, String>("Maxymir", "Dress")
    val inv1 = Inventory1DI(dress, 1)
    val inv2 = Inventory1DI(jeans, 2)
    inv1.inventoryProduct()
    inv2.inventoryProduct()
}
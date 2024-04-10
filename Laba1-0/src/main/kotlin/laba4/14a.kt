package laba4

/* * Создайте обобщенный класс Warehouse<T>, представляющий склад,
* *  который может хранить товары любого типа T.
* *  Также создайте обобщенный класс Inventory<T>, который отслеживает товары на
* *  складе и принимает экземпляр класса Warehouse<T> через конструктор.
* *
 */

interface Warehouses<T, K> {
    fun warehouseInf()
    fun shipments(barcode: T, shipment: K)
}

class Warehouse1<T, K>(val name: T) : Warehouses<T, K> {
    val listShipments = mutableMapOf<T, K>()
    override fun shipments(barcode: T, shipment: K) {
        listShipments[barcode] = shipment
    }

    override fun warehouseInf() {
        println("Название склада $name")
        for (item in listShipments) {
            println(item)
        }
    }
}

class Inventory1DI<T, K>(val warehouse1: Warehouse1<T, K>, val num: Int) {
    fun inventoryProduct() {
        println("Инвентаризация номер $num")
        warehouse1.warehouseInf()
    }
}

fun main() {
    val befree = Warehouse1<Int, String>(3564)
    befree.shipments(3333333, "JeansType1")
    befree.shipments(3322223, "DressType1")
    befree.shipments(4444444, "DressType2")
    befree.warehouseInf()
    val inv1 = Inventory1DI(befree, 1)
    inv1.inventoryProduct()
}
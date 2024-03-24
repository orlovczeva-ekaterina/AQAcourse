package laba4

/* *   Четвертая лаба.
 * *   Задание 13: (Новое) Создайте классы Product, Warehouse, Inventory, и Order.
 * *   Product представляет товар, Warehouse представляет склад,
 * *   Inventory отслеживает товары на складе, а Order представляет заказ.
 * *   Класс Inventory должен получать экземпляр Warehouse через конструктор,
 * *   а класс Order - экземпляр Inventory.
 * */

interface Product{
    fun clothInformation()
}

class ShopProduct: Product{
    override fun clothInformation() {
        println("Инфа о товаре")
    }
}

interface Warehouse{
    fun warehouseNumber(){
    }
}

class ShopWarehouse: Warehouse{
    override fun warehouseNumber() {
        println("Информация о складе")
    }
}
class InventoryDI(val product: Product, val warehouse: Warehouse){
    fun inventoryProduct(){
        print("Товар: ")
        product.clothInformation()
        print("Хранится на складе: ")
        warehouse.warehouseNumber()
    }
}

class OrderDI(val inventoryDI: InventoryDI){
    fun collectOrder(){
        inventoryDI.inventoryProduct()
        println("Заказ собран")
    }
}

fun main(){
    val product = ShopProduct()
    val warehouse = ShopWarehouse()
    val inventory = InventoryDI(product,warehouse)
    val myOrder = OrderDI(inventory)
    myOrder.collectOrder()
}
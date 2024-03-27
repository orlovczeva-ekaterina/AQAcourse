package laba4

/* *   Четвертая лаба.
 * *   Задание 14: Создайте обобщенный интерфейс Repository<T>,
 * *   который содержит методы для сохранения (save(item: T)),
 * *   удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
 * *   Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 * */

interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

class UserRepository<User> : Repository<User> {

    private val users = mutableListOf<User>()
    override fun getAll(): List<User> {
        users.forEach {
            println(it)
        }
        return users.toList()
    }

    override fun save(item: User) {
        users.add(item)
    }

    override fun delete(item: User) {
        users.remove(item)
    }
}

fun main() {
    val vlad = User("Vlad", 25)
    val dasha = User("Dasha", 19)
    val list = UserRepository<User>()
    list.save(vlad)
    list.save(dasha)
    list.getAll()
    list.delete(dasha)
    println("Final User Repository:")
    list.getAll()
}
package laba4

/* *   Четвертая лаба.
 * *   Задание 13: Создайте обобщенный интерфейс Repository<T>,
 * *   который содержит методы для сохранения (save(item: T)),
 * *   удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
 * *   Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 * */

interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

class UserRepository : Repository<User> {  //используем класс юзер из 10 задания
    private val users = mutableListOf<User>()

    override fun save(item: User) {
        users.add(item)
        println("Пользователь ${item.name} сохранен")
    }

    override fun delete(item: User) {
        users.remove(item)
        println("Пользователь ${item.name} удален")
    }

    override fun getAll(): List<User> {
        return users
    }
}

fun main() {
    val user1 = User("Катя", 24)
    val user2 = User("Даша", 19 )
    val userRepository = UserRepository()

    userRepository.save(user1)
    userRepository.save(user2)
    println("Список пользователей:")
    userRepository.getAll().forEach { println(it) }

    userRepository.delete(user2)
    println("Список пользователей:")
    userRepository.getAll().forEach { println(it) }
}
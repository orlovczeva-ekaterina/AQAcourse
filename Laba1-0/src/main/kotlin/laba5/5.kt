package laba5

/* *   Пятая лаба.
 * *   Задание 5: Создайте объект класса Person со свойствами name и age.
 * *   Создайте список из нескольких таких объектов.
 * *   Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
 * */

class Person (val name: String, val age: Int){
    override fun toString(): String {
        return "Person($name, $age)"
    }
}

fun main(){
    val Kate = Person("Kate", 24)
    val Tom = Person("Tom", 23)
    val Marta = Person("Marta", 19)
    val qa = listOf(Kate,Tom,Marta)
    val qa18 = qa.filter { it.age > 18 }
    println(qa18.toString())
}
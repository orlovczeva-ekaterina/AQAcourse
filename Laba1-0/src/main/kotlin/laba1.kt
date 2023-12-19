/**
 *   Начинаю делать
 *   свою первую лабу
 *   на котлин в этом курсе
 */
fun laba1VoroninVlad(){}


fun main(){
    println("Hello World!") //печатаю хеллоу ворд (лаба 2)

    val age: Int //задаю неизменяемую переменную типа инт (лаба 3)
    age = 24
    println(age)

    //const val maxAge = 120 //константа объявляется вне функции мейн

    val h: Int = 172 //задаю неизменяемую переменную типа инт и сразу ее объявляю
    println(h)

    var y: Int = 2023 //задаю изменяемую переменную типа инт и сразу ее объявляю
    println(y)

    y = 2024 //присваиваю новое значение переменной
    println(y)

    var a: Double = 1.33 //число с плавающей точкой
    println(a)

    var t: Char = 'a' //буквенный тип
    println(t)

    var m: Boolean = true
    println(m)

    val ar: Array<Int> = arrayOf(1, 2, 3, 4, 5) //массив целых чисел
    println(ar)

    val firstName = "Kate"
    val lastName = "Orlovtseva"
    val welcome = "Hello, $firstName $lastName"
    println(welcome)    //выводим имя фамилию

    val s = """ 
        Большой текст 
        с новой строки 
    """.trimIndent()
    println(s) //объявление без написания типа + тройные ковычки для большого текста

    var days: Any = 365 //тип Any, который позволяет присвоить переменной этого типа любое значение
    println(days)

    y = age + h //(лаба 4)
    println(y)

    y = h % age  //остаток от целочисленного деления
    println(y)

    y++  //инкремент
    println(y)

    m = h == y // применила оператор сравнения для двух целочисленных переменных записав результат в булевскую переменную
    println(m)

    m = (age < 30) && (h > y) //логический оператор "и"
    println(m)

    m = !(age < 30) || (h > y) //логический оператор "не" и "или"
    println(m)

    y %= 5 //оператор присваивания
    println(y)

    println("Введите свой знак зодиака:")
    var input = readLine() // лаба 5
    println("Вы: $input! Послушаем что об этом думает Маша")

}

/*
    многострочный комментарий
    извещающий о конце лабы
*/
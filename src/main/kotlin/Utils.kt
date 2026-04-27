import java.util.Scanner

// пользовательский ввод числа
fun scannerInt(): Int? {
    return Scanner(System.`in`).nextLine().toIntOrNull()
}

// обработка пользовательского ввода строки
fun newString () : String {
    var str: String
    do {
        str = Scanner(System.`in`).nextLine().trim()
        if (str.isEmpty()) { println("Строка не может быть пустой.")}
        else break
    } while (str.isEmpty())
    return str
}

var archiveList: ArrayList<Archive> = ArrayList() // список архивов
var userDigit: Int = -1 // переменная для отслеживания выбранного архива

// вызовы пунктов меню
fun <T: Named> runMenu(list: List<T>) {
        list.forEachIndexed { index, element -> println("${index + 1}. ${element.name}") }
        println("${list.size + 1}. Назад")
        println("Введите цифру:")
    }

// обработка неверного ввода цифр
fun <T> nullError(list: ArrayList<T>) {
    println("Пожалуйста, введите цифру от 0 до ${list.size+1}")
}

// интерфейс для работы с дженериками
interface Named {
    val name: String
    }


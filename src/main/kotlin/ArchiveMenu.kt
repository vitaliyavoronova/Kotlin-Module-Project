fun archiveMenu() {
    do {
        println("Архивы:")
        println("0. Создать новый архив")
        runMenu(archiveList)
        val digitCommand: Int? = scannerInt()
        when {
            digitCommand == 0 -> archiveCreator(archiveList)
            digitCommand == null -> error(archiveList)
            digitCommand > archiveList.size+1 -> error(archiveList)
            digitCommand < 0 -> error(archiveList)
            digitCommand == archiveList.size+1 -> {
                println("Работа завершена. Хорошего дня!")
                break
            }
            else -> {
                userDigit = digitCommand
                noteMenu(digitCommand)
            }
        }
    } while (digitCommand != archiveList.size+1)
}

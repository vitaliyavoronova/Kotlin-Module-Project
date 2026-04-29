fun noteMenu(digitCommand: Int) {
    val archiveItem = archiveList[digitCommand-1]
    val notes = archiveItem.notes
    do {
        println("Заметки:")
        println("0. Создать новую заметку")
        runMenu(notes)
        val digitCommand: Int? = scannerInt()
        when {
            digitCommand == 0 -> noteCreator(archiveItem)
            digitCommand == null -> error(notes)
            digitCommand > notes.size+1 -> error(notes)
            digitCommand < 0 -> error(notes)
            digitCommand == notes.size+1 -> break
            else -> noteViewer(archiveItem.notes[digitCommand-1])
        }
    } while (digitCommand != notes.size+1)
}

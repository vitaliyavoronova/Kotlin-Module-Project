fun noteCreator(noteList: Archive) {
    println("Введите название новой заметки:")
    val name: String = newString()
    println("Введите текст новой заметки:")
    val text: String = newString()
    val note = Note(name, text)
    noteList.notes.add(note)
}
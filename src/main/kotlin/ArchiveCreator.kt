fun archiveCreator(archiveList: ArrayList<Archive>) {
    println("Введите название нового архива:")
    val name: String = newString()
    val archive = Archive(name)
    archiveList.add(archive)
}
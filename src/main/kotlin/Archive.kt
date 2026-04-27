data class Archive (
    override val name: String,
) : Named {
    var notes: ArrayList<Note> = ArrayList()
}


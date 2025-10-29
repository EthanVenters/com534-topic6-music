fun main() {
    var hh = Song("123", "123", 181.3)
    var a = Song("A", "A", 177.7)
    val imagine = Song("Imagine", "John Lennon", 213.0)
    val vienna = Song("Vienna", "Ultravox", 300.6)


    var b = Single(hh, a)

    var songList = mutableListOf(hh, a, imagine, vienna)

    var c = Album(songList)

    val musicList : List<Music> = listOf(b, c)

    val player = RecordPlayer()
    player.play(c)
    player.play(b)
}
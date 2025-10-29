class Album(val songs: List<Song>) : Music {

    fun getSongsByArtist(artist: String): List<Song> {
        //return songs.filter{i -> i.artist === artist}
        return songs.filter{ it.artist === artist}
    }

    override fun getPlayingTime(): Double {

        var duration = 0.0
        
        for (song in songs) {
            duration += song.playingTime
        } 
        
        return duration
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }

}
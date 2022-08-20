
interface Downloader {
    fun downloaderInfo() { // because this function has a body it is not abstract
        println("Download V1")
    }
    fun download() // this function does not have a body so it is abstract by default, and must be implemented in class
}

interface Player {
    fun playerInfo() {
        println("Play V1")
    }
    fun play()
}

class Audio(private val name: String): Downloader, Player { // this class inherits from two interfaces, so it must
    // implement both abstract functions (download() from Downloader, play() from Player)
    override fun download() {
        println("Playing audio $name") // this function uses the val name
    }

    override fun play() {
        println("Playing audio $name")
    }
}

class Video(private val name: String): Downloader, Player {
    override fun download() {
        println("Playing video $name")
    }

    override fun play() {
        println("Playing video $name")
    }
}


fun main() {
    val audio = Audio("Radiohead")
    val video = Video("Westworld")

    audio.downloaderInfo()
    audio.download()
    audio.playerInfo()
    audio.play()
}
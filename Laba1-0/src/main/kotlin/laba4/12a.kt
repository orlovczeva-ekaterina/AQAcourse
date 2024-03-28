package laba4

/* * Решила сделать еще одно задание
 * * Создайте модель компьютерной системы:
 * * Определите класс Song с информацией о песне: title и artist.
 * * Определите класс Playlist, содержащий список песен.
 * * Включите методы для добавления песен в плейлист.
 * */

class Song(val title: String, val artist: String){
    fun composition(){
        print("Song named $title by artist $artist")
    }
}
class Playlist(){
    private val listToPlay = mutableListOf<Song>()
    fun lib (song: Song){
        song.composition()
        listToPlay.add(song)
        println(" now in my playlist")
    }
    fun showLib (){
        println("In my playlist:")
        listToPlay.forEach {
            println("Song named ${it.title} by artist ${it.artist}")
        }
    }
}
fun main(){
    val firstSong = Song("Love Game", "Lady Gaga")
    val secondSong = Song("Behind Blue Eyes", "Limp Bizkit")
    val myList = Playlist()
    myList.lib(firstSong)
    myList.lib(secondSong)
    myList.showLib()
}
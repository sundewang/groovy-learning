/**
 * @author sundewang
 * @date 18-12-7
 */
class Song {
    def name
    def artist
    def genre

    static void main(args) {
        def song = new Song(name:"Le Freak",
        artist: "Chic", genre: "Disco")
        println(song)


        def song2 = new Song()
        song2.name = "发如雪"
        song2.artist = "周杰伦"
        song2.genre = "hip-hop"
        println(song2.genre)
    }
}

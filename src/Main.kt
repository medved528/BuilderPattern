fun main() {
    val game: Game = Game.Builder("Silent Hill")
        .publishedYear(1999)
        .platform("PlayStation 1")
        .genre("Horror")
        .build()
    println(game.getInfo())
}
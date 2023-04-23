class Game private constructor(val title: String,
                               val publishedYear: Int,
                               val platform: String,
                               val genre: String) {
    constructor(builder: Builder) : this(builder.title,
        builder.publishedYear,
        builder.platform,
        builder.genre)

    fun getInfo(): String {
        return "\n title: $title\n year of publish: $publishedYear\n platform: $platform\n genre: $genre"
    }

    class Builder(val title: String) {
        var publishedYear: Int = 1970
        var platform: String = ""
        var genre: String = ""

        fun publishedYear(value: Int) = apply { publishedYear = value }
        fun platform(value: String) = apply { platform = value }
        fun genre(value: String) = apply { genre = value }

        fun build(): Game {
            return Game(this)
        }
    }
}
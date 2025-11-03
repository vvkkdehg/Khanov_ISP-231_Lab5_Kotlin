package artifact

fun main() {
    val artifacts = listOf<MagicItem>(
        Weapon("Супер Меч", 45, "Epic", "огонь", true),
        Potion("Зелье урона", 30, "Rare", 60, true),
        Relic("Шапка монаха", 75, "Common", "демоническое", 3)
    )

    for (art in artifacts){
        art.describe()
        println(art.use())
        println()
    }
}
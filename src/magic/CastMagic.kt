package magic

fun main() {
    val fireWall = Spell("Огненная стена", 5, 3, "\uD83D\uDD25")
    fireWall.cast()
    val iceSheet = Spell("Ледяной щит", 4, "\u2744\uFE0F")
    iceSheet.cast()
    val spell = Spell()
    spell.cast()

    println(fireWall.area())
    println(iceSheet.area())
    println(spell.area())
}
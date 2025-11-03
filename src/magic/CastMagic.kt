package magic

fun main() {
//    val fireWall = Spell("Огненная стена", 5, 3, "\uD83D\uDD25")
//    fireWall.cast()
//    val iceSheet = Spell("Ледяной щит", 4, "\u2744\uFE0F")
//    iceSheet.cast()
//    val spell = Spell()
//    spell.cast()
//
//    println(fireWall.area())
//    println(iceSheet.area())
//    println(spell.area())
    val fireball = Spell(name = "Огненный шар", width = 3, height = 3, symbol = "\uD83D\uDD25")
    val heal = InstantSpell(name = "Лечение", symbol = "\uD83C\uDF9A", power = 5)

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}
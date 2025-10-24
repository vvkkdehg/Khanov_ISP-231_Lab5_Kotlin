package charactrers

class Enemy(
    val name: String,
    var hp: Int,
    val stikh: String,
    val aggressionLevel: Int = 2
) {

    fun takeDamage(amount: Int){
        if (hp - amount < 0) {
            println("$name получил $amount урона!")
            hp = 0
            println("$name умер :(")}
        else {
            println("$name получил $amount урона!")
            hp -= amount
            println("Оставшееся здоровье: $hp")
        }
    }
    fun isStrong(): Boolean {
        return hp > 100
    }
    fun getThreatLevel(): String {
        if (hp < 0) {
            return "Некорректное здоровье"
        }
        return when {
            hp >= 150 -> "Высокий"
            hp > 50 -> "Средний"
            else -> "Низкий"
        }
    }
    fun calculatePower(): Int{
        var power = hp * aggressionLevel
        return power
    }
}
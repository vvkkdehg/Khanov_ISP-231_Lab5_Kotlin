class Enemy {
    var name: String = "Враг"
    var hp: Int = 50
    var stikh = "Огонь"
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

}
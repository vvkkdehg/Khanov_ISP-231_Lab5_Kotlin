class Hero {
    var name: String = "Undefined"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var stikh: String = "Огонь"

    fun sayHello() {
        println("Мое имя - $name. Мое путешествие только начинается")
    }
    fun showStatus(){
        println("Имя - $name,\nПол - $gender,\nКласс - $role,\nЗдоровье - $hp,\nMP - $mp, \nУровень - $level, \nСтихия - $stikh")
    }
    fun meditate(){
        println("$name медитирует")
        mp += 20
        println("$name восстановил ману. Её количество $mp")
    }
    fun takeDamage(amount: Int){
        if (hp - amount < 0)  {
            hp = 0
            die()
        }
        else{
            println("$name получает урон!")
            hp -= amount
            println("Здоровья осталось: $hp")}
    }
    fun castSpell(){
        if (mp - 10 < 0){
            println("Не хватает маны для магии!")}
        else {
            println("Герой применяет магию!")
            mp -= 10}
    }
    fun heal(){
        if (mp - 10 < 0){
            println("Не хватает маны для лечения! У вас только $mp")}
        else {
            println("Лечусь! Восстановлено здоровье, потрачено 10 маны.")
            mp -= 10
            hp += 10
            println("Здоровье: $hp | Мана: $mp")
        }
    }
    fun greet(name: String) {
        println("Привет, $name")
    }
    fun die() {
        println("Герой погиб!")
    }
    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует ${enemy.name}!")
        enemy.takeDamage(damage)
    }
    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int){
        if (mp > 10) {
            println("$name использует заклинание '$spellName' против ${enemy.name}!")
            if (stikh == enemy.stikh) {
                println("Стихии совпадают! Урон снижен.")
                val reducedDamage = damage / 2
                enemy.takeDamage(reducedDamage)
            } else {
                enemy.takeDamage(damage)
            }
            mp -= 10
            if (mp < 0) mp = 0
            println("Осталось маны: $mp")
        }
    }
    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается")

        println("$name атакует первым!")
        opponent.takeDamage(15)

        println("${opponent.name} отвечает!")
        this.takeDamage(15)
        println("Дуэль завершена.")
        println("Состояние героев:")
        this.showStatus()
        opponent.showStatus()
    }
}
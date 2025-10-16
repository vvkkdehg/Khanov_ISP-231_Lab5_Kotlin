//Задание 1
class Weapon {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"

    fun showInfo(){
        println("Наименование: $name, Урон: $damage, Прочность: $durability, Тип: $type")
    }
    fun use(){
        durability -= 10
        if (durability < 0) {
            durability = 0
            println("Оружие сломано!")}
        else
            println("Прочность оружия уменьшилась на 10. Прочность: $durability")
    }
    fun upgrade(bonus: Int){
        println("Ваш урон увеличен! Бонус к урону - $bonus!")
        damage += bonus
    }
}
package artifact

class Potion(
    name: String,
    power: Int,
    rarity: String,
    val effectDuration: Int,
    val isConsumable: Boolean
) : MagicItem(name, power, rarity){
    override fun describe() {
        println("Название зелья: $name, Сила зелья: $power, Редкость: $rarity, Длительность эффекта: $effectDuration")
    }

    override fun use(): String {
        if (isConsumable){
            return "Зелье применено с силой $power, однако больше его у вас нету"
        }
        else{
            return "Зелье применено с силой $power. Оно готово поразить еще кучу врагов"
        }
    }
}
package artifact

class Relic(
    name: String,
    power: Int,
    rarity: String,
    val origin: String,
    var charges: Int
) : MagicItem(name, power, rarity) {
    override fun describe() {
        println("Название реликвии: $name, Сила реликвии: $power, Редкость: $rarity, Происхождение: $origin")
    }

    override fun use(): String {
        if (charges > 0){
            charges -= 1
            return "Реликвия использована. Зарядов: $charges"
        }
        else {
            return "Заряды закончились"
        }
    }
}
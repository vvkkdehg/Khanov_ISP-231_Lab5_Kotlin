package artifact

class Weapon(
    name: String,
    power: Int,
    rarity: String,
    val damageType: String,
    val isTwoHanded: Boolean
) : MagicItem(name, power, rarity){
    override fun describe(){
        println("Название оружия: $name, Сила оружия: $power, Редкость: $rarity, Тип урона: $damageType")
    }
    override fun use(): String{
        return "Наносит $damageType урон силой $power"
    }
}
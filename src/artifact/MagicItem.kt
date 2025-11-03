package artifact

open class MagicItem (
    val name: String,
    val power: Int,
    val rarity: String
) {
    open fun describe(){
        println("Название артефакта: $name, Сила артефакта: $power, Редкость: $rarity")
    }
    open fun use(): String{
        return "Артефакт $name применен"
    }
}
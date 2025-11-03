package charactrers

class NPC(
    name: String,
    hp: Int = 100,
    stikh: String = "Нейтральный",
    val faction: String = "Городские жители",
    val hasQuest: Boolean = false
) : GameCharacter(name, hp, stikh){

    fun giveQuest(): String {
        return if (hasQuest) {
            "$name предлагает вам квест"
        } else{
            "$name не имеет заданий для вас"
        }
    }
    fun trade(){
        println("$name открыл торговлю")
    }
}
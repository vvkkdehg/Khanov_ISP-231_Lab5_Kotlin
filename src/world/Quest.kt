package world

class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String,
    val questType: QuestType
) : Mission(title, reward) {

    fun printInfo(){
        println("Название квеста: ${this.title}, Тип квеста: ${questType.description}, Время выполнения: ${this.duration} ч., Награда: ${this.reward} монет, Уровень сложности: ${this.difficulty}")
    }
    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
        println("Тип квеста: ${questType.description}")
    }

    fun goldPerHour(): Int {
        require(duration >= 0) { "Длительность не может быть отрицательной!" }
        return if (duration == 0) 0 else reward / duration
    }

    fun isHard(): Boolean {
        return difficulty.equals("сложный", ignoreCase = true)
    }
}
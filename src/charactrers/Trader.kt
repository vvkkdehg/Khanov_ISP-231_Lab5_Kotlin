package charactrers
import world.Quest
import world.QuestType

class Trader (
    val name: String,
            private val quests: MutableList<Quest> = mutableListOf()
){
    fun showAvailableQuests() {
        println("Доступные квесты от $name:")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золота")
        }
    }
    fun giveQuest(index: Int): Quest? {
        if (index !in 1..quests.size) {
            return null
        }
        return quests[index - 1]
    }
    fun addQuest(quest: Quest){
        quests.add(quest)
        println("Квест '${quest.title}' добавлен в список $name.")
    }
    fun removeQuest(index: Int) {
        if (index !in 1..quests.size) {
            println("Некорректный номер квеста.")
            return
        }
        val udalQuest = quests.removeAt(index - 1)
        println("Квест '${udalQuest.title}' удален.")
    }
    fun start() {
        while (true) {
            println("Выберите действие:")
            println("1 - Добавить квест")
            println("2 - Показать все квесты")
            println("3 - Взять квест (удалить из списка)")
            println("0 - Выйти")
            print("Ваш выбор: ")

            when (readln()) {
                "1" -> {
                    println("Введите название квеста: ")
                    val title = readln()
                    println("Введите длительность (часы): ")
                    val duration = readln().toIntOrNull() ?: 0
                    println("Введите награду (золото): ")
                    val reward = readln().toIntOrNull() ?: 0
                    println("Введите сложность: ")
                    val difficulty = readln()
                    println("Введите тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
                    val questType = when (readln().uppercase()) {
                        "DELIVERY" -> QuestType.DELIVERY
                        "ELIMINATION" -> QuestType.ELIMINATION
                        "ESCORT" -> QuestType.ESCORT
                        "EXPLORE" -> QuestType.EXPLORE
                        "BOSSFIGHT" -> QuestType.BOSSFIGHT
                        else -> {
                            println("Я не знаю такого типа квеста, пусть будет ESCORT:")
                            QuestType.ESCORT
                        }
                    }
                    val quest = Quest(title, duration, reward, difficulty, questType)
                    addQuest(quest)
                }
                "2" -> showAvailableQuests()
                "3" -> {
                    if (quests.isEmpty()){
                        println("В списке еще нет квестов")
                    }
                    else {
                        println("Введите номер квеста, который хотите взять: ")
                        val nomer = readln().toIntOrNull()
                        if (nomer == null || nomer !in 1..quests.size) {
                            println("Нет квеста под таким номером.")
                            continue
                        }
                        else {
                            val quest = giveQuest(nomer)
                            if (quest != null){
                                removeQuest(nomer)
                                println("Вы взяли квест: ${quest.title}")}
                            else {
                                println("Квест взять нельзя")
                            }
                        }
                    }
                }
                "0" -> {
                    println("Выход из меню торговца.")
                    break
                }
                else -> println("Некорректный ввод. Попробуйте снова.")
            }
        }
    }
}
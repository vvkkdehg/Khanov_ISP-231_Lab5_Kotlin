fun main() {
    val quest = Quest()
    print("Введите название квеста: ")
    val title = readln()
    print("Введите время выполнения (в часах): ")
    val duration = readln().toInt()
    print("Введите награду (в монетах): ")
    val reward = readln().toInt()
    print("Введите уровень сложности: ")
    val difficulty = readln()
    quest.title = title
    quest.duration = duration
    quest.reward = reward
    quest.difficulty = difficulty
    println("Название квеста: ${quest.title} Время выполнения: ${quest.duration} ч. Награда: ${quest.reward} монет Уровень сложности: ${quest.difficulty}")

    quest.printInfo()
    quest.init(title = "Охота на тролля", duration = 3, reward = 500, difficulty = "Средний")
    quest.printInfo()

    val quests = mutableListOf<Quest>()
    for (i in 1 .. 3 ){
        println("Добавим квест #$i")
        val q = Quest()
        print("Название: ")
        val title = readln()
        print("Время (ч): ")
        val duration = readln().toInt()
        print("Награда: ")
        val reward = readln().toInt()
        print("Сложность: ")
        val difficulty = readln()

        q.init(title, duration, reward, difficulty)
        quests.add(q)
        println()
    }

    println("Все доступные квесты:")
    for (q in quests) {
        q.printInfo()
    }
}
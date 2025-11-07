package world

fun main() {
    //val quest = world.Quest("Охота на Евгения", 2, 3000, "Невозможно")
//    print("Введите название квеста: ")
//    val title = readln()
//    print("Введите время выполнения (в часах): ")
//    val duration = readln().toInt()
//    print("Введите награду (в монетах): ")
//    val reward = readln().toInt()
//    print("Введите уровень сложности: ")
//    val difficulty = readln()
    //println("Название квеста: ${quest.title} Время выполнения: ${quest.duration} ч. Награда: ${quest.reward} монет Уровень сложности: ${quest.difficulty}")

    //quest.printInfo()
    //quest.printInfo()

//    val quests = mutableListOf<world.Quest>()
//    for (i in 1 .. 3 ){
//        println("Добавим квест #$i")
//        val q = world.Quest("Охота на гоблинов", 3, 3000, "Средний")
//        print("Название: ")
//        val title = readln()
//        print("Время (ч): ")
//        val duration = readln().toInt()
//        print("Награда: ")
//        val reward = readln().toInt()
//        print("Сложность: ")
//        val difficulty = readln()

        //q.init(title, duration, reward, difficulty)
//        quests.add(q)
//        println()
//    }

//    println("Все доступные квесты:")
//    for (q in quests) {
//        q.printInfo()
//    }
//    val quest = Quest("Охота на Евгения", 2, 3000, "Невозможно",)
//    println("Квест сложный? ${quest.isHard()}")
//    val quest1 = Quest(title = "Охота", duration = 2, reward = 300, difficulty = "Средний")
//    println("${quest1.title}: ${quest1.goldPerHour()} золота в час")
//
//    val quest2 = Quest(title = "Рыбалка", duration = 0, reward = 500, difficulty = "Лёгкий")
//    println("${quest2.title}: ${quest2.goldPerHour()} золота в час")
//
//    val quest = Quest(title = "Поиск артефакта", duration = 3, reward = 800, difficulty = "Средний")
//    val contract = Contract(title = "Защита каравана", clientName = "Гильдия купцов", taskDescription = "Охрана груза", reward = 1200)
//    val specialOp = SpecialOperation(title = "Операция 'Тень'", reward = 2500, requiredClearance = 2, isCovert = true)
//
//    println("Информация о квесте:")
//    println("Название: ${quest.title}, Награда: ${quest.reward}")
//
//    println("\nИнформание о контракте:")
//    println("Название: ${contract.title}, Заказчик: ${contract.clientName}")
//
//    println("\nИнформация о спецоперации:")
//    println("Название: ${specialOp.title}")
//    specialOp.showReward()
//    val missions = listOf(
//        Quest(title = "Охота на монстров", duration = 3, reward = 600, difficulty = "Средний"),
//        SpecialOperation(title = "Ночной рейд", reward = 1500, requiredClearance = 2, isCovert = true),
//        Contract(title = "Сопровождение каравана", clientName = "Гильдия Торговцев",
//            taskDescription = "Доставить груз через лес", reward = 600, isUrgent = true)
//    )
//
//    for (mission in missions) {
//        mission.describe()
//        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
//        println()
//    }
    val escortQuest = Quest(
        title = "Сопроводи торговца до деревни",
        duration = 4,
        reward = 120,
        difficulty = "Средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()

    //Самостоятельное задание 1.

    val quest1 = Quest(
        title = "Устрани гонца",
        duration = 3,
        reward = 200,
        difficulty = "Средний",
        questType = QuestType.ELIMINATION
    )
    val quest2 = Quest(
        title = "Битва с главарем разбойников",
        duration = 5,
        reward = 1000,
        difficulty = "Сложный",
        questType = QuestType.BOSSFIGHT
    )
    val quest3 = Quest(
        title = "Доставить письмо королю",
        duration = 3,
        reward = 100,
        difficulty = "Легкий",
        questType = QuestType.DELIVERY

    )
    val quest4 = Quest(
        title = "Исследовать поместье Милославского",
        duration = 6,
        reward = 400,
        difficulty = "Сложный",
        questType = QuestType.EXPLORE

    )
    escortQuest.describe()
    escortQuest.printInfo()
    println()
    quest1.describe()
    quest1.printInfo()
    println()
    quest2.describe()
    quest2.printInfo()
    println()
    quest3.describe()
    quest3.printInfo()
    println()
    quest4.describe()
    quest4.printInfo()
    println()
    println("Квесты типа EXPLORE:")
    val quests = listOf(escortQuest, quest1, quest2, quest3, quest4)
    OnlyExplore(quests)
}
fun OnlyExplore(quests: List<Quest>){
    var kvest = false
    for (i in quests) {
        if (i.questType == QuestType.EXPLORE) {
            i.printInfo()
            kvest = true
        }
    }
    if (!kvest){
        println("Квестов типа 'Исследование' не найдено")
    }
}
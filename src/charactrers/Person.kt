package charactrers
import world.Quest
import world.QuestType
fun main() {
//    val naruto = Hero("Наруто узумаки", "Мужской", "Хокаге", 350, 120, 1, "Огонь")
//    naruto.name = "Наруто Узумаки"
//    naruto.sayHello()
//    naruto.showStatus()
//    naruto.meditate()
//    naruto.takeDamage(10)
//    naruto.takeDamage(10)
//    naruto.takeDamage(10)
//    naruto.takeDamage(10)
//    for (i in 0..9)
//        naruto.castSpell()
//    for (i in 0..6)
//        naruto.heal()
//    naruto.castSpell()
//    naruto.takeDamage(400)
//    naruto.greet("Саске")
//    println("Имя - ${naruto.name},\nПол - ${naruto.gender},\nКласс - ${naruto.role},\nЗдоровье - ${naruto.hp},\nMP - ${naruto.mp}")
//    println()
//    val sasuke: Hero = Hero("Саске Учиха", "Мужской", "Шиноби-отступник", 300, 180, 1, "Вода")
//    sasuke.sayHello()
//    println("Имя - ${sasuke.name},\nПол - ${sasuke.gender},\nКласс - ${sasuke.role},\nЗдоровье - ${sasuke.hp},\nMP - ${sasuke.mp}")
//    println()
//    val godgo: Hero = Hero("Годжо Сатору", "Мужской", "Маг-проклятий", 160, 300, 1, "Земля")
//    godgo.sayHello()
//    println("Имя - ${godgo.name},\nПол - ${godgo.gender},\nКласс - ${godgo.role},\nЗдоровье - ${godgo.hp},\nMP - ${godgo.mp}, Уровень - ${godgo.level}, Стихия - ${godgo.stikh}")
//    println()
//    val prish: Enemy = Enemy("Аркадий", 100, "Огонь")
//    println("${prish.name} очень добрый пришелец :)")
//    println("Имя: ${prish.name}, Здоровье: ${prish.hp} ")
//    naruto.attack(prish, 30)
//    naruto.meditate()
//    naruto.castSpellOn(prish, "Абракадабра", 30)
//    naruto.duel(godgo)
//
//    val hero4 = Hero(name = "Артур", role = "Танк", gender = "Мужской", hp = 100, mp = 50, level = 5, stikh = "Воздух")
//    println("Герой жив? ${hero4.isAlive()}")
//    val hero5 = Hero(name = "Артур", role = "Танк", gender = "Мужской", hp = 0, mp = 50, level = 5, stikh = "Воздух")
//    println("Герой жив? ${hero5.isAlive()}")
//
//    val enemy1 = Enemy("Гоблин", 30, "Огонь")
//    println("${enemy1.name}: ${enemy1.getThreatLevel()}")
//
//    val enemy2 = Enemy("Орк", 100, "Огонь")
//    println("${enemy2.name}: ${enemy2.getThreatLevel()}")
//
//    val enemy3 = Enemy("Дракон", 200, "Огонь")
//    println("${enemy3.name}: ${enemy3.getThreatLevel()}")

//    val blacksmith = NPC(name = "Кузнец Ульфрик", hasQuest = true)
//    println(blacksmith.giveQuest())
//    blacksmith.trade()
//
//    val dragon = Boss(name = "Алдуин", hp = 500, stikh = "Огонь", phaseCount = 4, isFinalBoss = true)
//    dragon.startPhase(phaseNumber = 2)
//    println(dragon.dropLoot())
//    dragon.takeDamage(amount = 150)
//
//    val enemy: Enemy = Enemy(
//        "Джин",
//        hp = 100,
//        stikh = "Огонь",
//        aggressionLevel = 2,
//    )
//    val hero: Hero = Hero(
//        "Наруто",
//        gender = "Мужской",
//        role = "Хокаге",
//        hp = 150,
//        mp = 100,
//        level = 3,
//        stikh = "Вода",
//        expirience = 3
//    )
//    val npc: NPC = NPC("Торговец")
//    println(enemy.name)
//    (enemy as Enemy).takeDamage(20)
//    enemy.takeDamage(20)

//    val trader = Trader(name = "Ральф")
//
//    trader.addQuest(Quest(title = "Собрать травы", duration = 2, reward = 50, difficulty = "Лёгкий", questType = QuestType.DELIVERY))
//    trader.addQuest(Quest(title = "Убить волков", duration = 3, reward = 100, difficulty = "Средний", questType = QuestType.ELIMINATION))
//
//    trader.showAvailableQuests()
//
//    val selectedQuest = trader.giveQuest(index = 1)
//    selectedQuest.describe()

    //Самостоятельное задание 2
    val trader = Trader("Васёк")
    trader.start()
}
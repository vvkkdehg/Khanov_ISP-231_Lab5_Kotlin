fun main() {
    val naruto: Hero = Hero()
    naruto.name = "Наруто Узумаки"
    naruto.sayHello()
    naruto.hp = 350
    naruto.mp = 120
    naruto.role = "Хокаге"
    naruto.gender = "Мужской"
    naruto.showStatus()
    naruto.meditate()
    naruto.takeDamage(10)
    naruto.takeDamage(10)
    naruto.takeDamage(10)
    naruto.takeDamage(10)
    for (i in 0..9)
        naruto.castSpell()
    for (i in 0..6)
        naruto.heal()
    naruto.castSpell()
    naruto.takeDamage(400)
    naruto.greet("Саске")
    println("Имя - ${naruto.name},\nПол - ${naruto.gender},\nКласс - ${naruto.role},\nЗдоровье - ${naruto.hp},\nMP - ${naruto.mp}")
    println()
    val sasuke: Hero = Hero()
    sasuke.sayHello()
    sasuke.name = "Саске Учиха"
    sasuke.hp = 300
    sasuke.mp = 180
    sasuke.role = "Шиноби-отступник"
    sasuke.gender = "Мужской"
    println("Имя - ${sasuke.name},\nПол - ${sasuke.gender},\nКласс - ${sasuke.role},\nЗдоровье - ${sasuke.hp},\nMP - ${sasuke.mp}")
    println()
    val godgo: Hero = Hero()
    godgo.sayHello()
    godgo.name = "Годжо Сатору"
    godgo.hp = 160
    godgo.mp = 300
    godgo.role = "Маг Проклятий"
    godgo.gender = "Мужской"
    println("Имя - ${godgo.name},\nПол - ${godgo.gender},\nКласс - ${godgo.role},\nЗдоровье - ${godgo.hp},\nMP - ${godgo.mp}, Уровень - ${godgo.level}, Стихия - ${godgo.stikh}")
    println()
    val prish: Enemy = Enemy()
    prish.name = "Аркадий"
    println("${prish.name} очень добрый пришелец :)")
    println("Имя: ${prish.name}, Здоровье: ${prish.hp} ")
    naruto.attack(prish, 30)
    naruto.meditate()
    naruto.castSpellOn(prish, "Абракадабра", 30)
    naruto.duel(godgo)
}
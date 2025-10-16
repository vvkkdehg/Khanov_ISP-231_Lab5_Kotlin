fun main() {
    //Задание 1
    val oruzh = Weapon()
    oruzh.name = "Меч кладенец"
    oruzh.damage = 20
    oruzh.durability = 40
    oruzh.type = "Волшебный"
    oruzh.showInfo()
    oruzh.use()
    oruzh.upgrade(15)
    println()
    //Задание 2
    val stud = Student()
    stud.name = "Влад"
    stud.age = 18
    stud.introduce()
    stud.haveBirthday()

    val stud2 = Student()
    stud2.name = "Женя"
    stud2.age = 17
    println()

    //Задание 3
    val group = Group()
    group.groupName = "ИСП-231"
    group.addStudent(stud)
    group.addStudent(stud2)
    println()
    group.listStudents()
    println()
    group.celebrateBirthdays()
    println()

    //Задание 4
    var fig = GeometryCalculator()
    println("=== ПРЯМОУГОЛЬНИКИ ===")
    fig.rectangleInfo(4, 5)
    println()
    fig.rectangleInfo(3, 6)
    println()
    println("=== ТРЕУГОЛЬНИКИ ===")
    fig.triangleInfo(3, 4, 5)
    println()
    fig.triangleInfo(5, 5, 5)
    println()
    fig.triangleInfo(2, 3, 4)
    println()
    println("=== ОКРУЖНОСТИ ===")
    fig.circleInfo(5)
    println()
    fig.circleInfo(10)
}
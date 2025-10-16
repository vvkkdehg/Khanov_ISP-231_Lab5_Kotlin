class Group {
    var groupName: String = ""
    var students = mutableListOf<Student>()

    init {
        println("Создана группа")
    }
    fun addStudent(s: Student){
        students.add(s)
        println("Студент ${s.name} добавлен в группу $groupName")
    }
    fun listStudents(){
        println("Студенты группы $groupName:")
        for (i in students)
            i.introduce()
    }
    fun celebrateBirthdays(){
        println("В группе $groupName празднуют дни рождения!")
        for (i in students)
            i.haveBirthday()
    }

}
class Item2 (
    var name: String,
    var type: String,
    var value: Int
){
    constructor (name: String, type: String) : this(name, type, 0)
    fun printInfo(){
        println("Название предмета: $name, Тип: $type, Стоимость: $value")
    }
}
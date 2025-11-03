package transport

open class Transport (
    val name: String,
    val speed: Int,
    val capacity: Int
){
    fun describe() {
        println("Название транспорта: $name, Скорость: $speed, Вместительность: $capacity")
    }
    open fun move(){
        println("$name двигается")
    }
    open fun specialAbility() {
        println("$name имеет специальную способность")
    }
}
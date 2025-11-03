package transport

class Horse (
    name: String = "Скакун",
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){

    override fun move() {
        println("$name скачет по равнинам")
    }
    override fun specialAbility() {
        println("Может ускориться в бою")
    }
}
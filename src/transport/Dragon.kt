package transport

class Dragon (
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){
    override fun move() {
        println("Летит высоко над землей")
    }

    override fun specialAbility() {
        println("Дышит огнем и перевозит героя по воздуху")
    }
}
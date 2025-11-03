package transport

class Teleport(
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){
    override fun move() {
        println("Мгновенно перемещается в другое место")
    }

    override fun specialAbility() {
        println("Нужна мана для активации, мгновенное перемещение")
    }
}
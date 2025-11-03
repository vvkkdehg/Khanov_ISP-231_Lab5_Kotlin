package transport

class Boat (
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){
    override fun move() {
        println("Плывет по воде")
    }

    override fun specialAbility() {
        println("Может перевозить группу по рекам и озерам")
    }
}
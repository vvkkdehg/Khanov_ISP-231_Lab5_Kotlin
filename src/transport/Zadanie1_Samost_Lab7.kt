package transport

fun main() {
    val transports = listOf<Transport>(
        Horse("Скакун", 60, 2),
        Dragon("Огнедых", 80, 4),
        Boat("Победа", 70, 6),
        Teleport("Вжух", 10000, 1)
    )
    for (transport in transports) {
        transport.describe()
        transport.move()
        transport.specialAbility()
        println()
    }
}
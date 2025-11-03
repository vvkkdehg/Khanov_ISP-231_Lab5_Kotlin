package pets

fun main() {
    val wolf = Wolf("Волчок")
    println(wolf.packSize)
    val pets = listOf(
        Wolf("Фенрир"),
        Cat("Мурзик"),
        Eagle("Скайвинд"),
        Bear("Балу"),
        //"Pets"
    )
    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }
}
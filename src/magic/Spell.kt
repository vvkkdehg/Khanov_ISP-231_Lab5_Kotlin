package magic

class Spell (
    val name: String = "",
    val width: Int = 0,
    val height: Int = 0,
    val symbol: String = "")
    {
    //constructor() : this("", 0, 0, "")
    constructor(name: String, size: Int, symbol: String) : this(name, size, size, symbol)

    fun cast() {
        println("Кастуем $name!")
        repeat(height) {
            repeat(width){
                print(symbol)
            }
            println()
        }
    }
    fun area(): Int {
        return width * height
    }
   fun description(): String {
       return "Заклинание $name занимает область ${width}x$height и использует символ $symbol"
   }
}
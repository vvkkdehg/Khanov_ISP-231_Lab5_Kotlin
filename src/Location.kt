class Location (
    var name: String,
    var dangerLevel: String,
    var requiredLevel: Int
){
    fun isDangerous(): Boolean {
        if (dangerLevel == "Высокий"){
            return true
        }
        else {
            return false
        }
    }
}
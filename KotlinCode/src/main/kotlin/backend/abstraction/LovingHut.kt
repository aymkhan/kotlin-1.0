package backend.abstraction

class LovingHut: Restaurant(4.3,"Vegan") {
    fun greeting(){
        println("Welcome to Loving Hut")
    }
    override fun parking(){
        println("Easy Parking. Far drive: ~1.5 hours")
    }

    override fun favoriteMenuItems() {
        val foods = listOf("Potstickers",
            "Basil Fried Rice",
            "Lucky Curry",
            "General Tso")
        println(foods)
    }
}
package backend.abstraction

class Zareens: Restaurant(4.8,"Pakistani") {
    override fun parking() {
        println("Easy parking. Drive is ~1.5 hours")
    }

    override fun favoriteMenuItems() {
        val foods = listOf("Student Biryani", "Samosa", "Chai",
        "Grilled Chicken Boti Sizzler",
        "Sabri Nihari",
        "Sheermal",
        "Silver Spoon Paratha roll",
        "Daal",
        "Thaali style - with Grilled Chicken Boti")
        println(foods)
    }
}
package backend.abstraction

abstract class Restaurant(var rating:Double, var cuisine:String) {
    open fun favoriteMenuItems(){}

    open fun parking(){}

    fun comeAgain(){
        println("Thank you, come again :) ")
    }
}

fun main(args: Array<String>) {
    // Create an instance of Zareen's restaurant
    val zareens = Zareens()
    zareens.favoriteMenuItems()
}

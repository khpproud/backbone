package builder

import builder.meal.MealBuilder

fun main() {
    val vegMeal = MealBuilder.prepareVegMeal()
    println("Veg Meal")
    vegMeal.showItems()
    println("Total Cost : ${vegMeal.getCost()}")

    val nonVegMeal = MealBuilder.prepareNonVegMeal()
    println("\n\nNon-Veg Meal")
    nonVegMeal.showItems()
    println("Total Cost : ${nonVegMeal.getCost()}")
}
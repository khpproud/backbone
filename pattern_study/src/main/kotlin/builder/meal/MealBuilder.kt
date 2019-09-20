package builder.meal

import builder.item.burger.ChickenBurger
import builder.item.burger.VegBurger
import builder.item.drink.Coke
import builder.item.drink.Pepsi

object MealBuilder {
    fun prepareVegMeal(): Meal {
        val meal = Meal()
        meal.addItem(VegBurger())
        meal.addItem(Coke())
        return meal
    }

    fun prepareNonVegMeal(): Meal {
        val meal = Meal()
        meal.addItem(ChickenBurger())
        meal.addItem(Pepsi())
        return meal
    }
}
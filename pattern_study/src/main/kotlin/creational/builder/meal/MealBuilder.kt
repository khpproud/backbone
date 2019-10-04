package creational.builder.meal

import creational.builder.item.burger.ChickenBurger
import creational.builder.item.burger.VegBurger
import creational.builder.item.drink.Coke
import creational.builder.item.drink.Pepsi

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
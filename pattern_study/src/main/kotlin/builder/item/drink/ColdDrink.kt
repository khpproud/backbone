package builder.item.drink

import builder.item.Item
import builder.item.packing.Bottle
import builder.item.packing.Packing

abstract class ColdDrink : Item {
    override fun packing(): Packing {
        return Bottle()
    }

    abstract override fun price(): Float
}
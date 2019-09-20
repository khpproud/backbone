package builder.item.burger

import builder.item.Item
import builder.item.packing.Packing
import builder.item.packing.Wrapper

abstract class Burger : Item {
    override fun packing(): Packing {
        return Wrapper()
    }

    abstract override fun price(): Float
}
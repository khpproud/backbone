package builder.item

import builder.item.packing.Packing

interface Item {
    fun name(): String
    fun packing(): Packing
    fun price(): Float
}
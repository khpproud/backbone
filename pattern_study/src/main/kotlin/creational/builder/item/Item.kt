package creational.builder.item

import creational.builder.item.packing.Packing

interface Item {
    fun name(): String
    fun packing(): Packing
    fun price(): Float
}
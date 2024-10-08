package com.example.bearwear

class ItemRepository {
    fun getItems(): List<Item> {
        return listOf(
            Item(1, "Robot A"),
            Item(2, "Robot B"),
            Item(3, "Robot C"),
            Item(4, "Robot D"),
            Item(5, "Robot E"),
            Item(6, "Robot F"),
            Item(7, "Robot G"),
            Item(8, "Robot H"),
            Item(9, "Robot I"),
            Item(10, "Robot J"),
        )
    }
}
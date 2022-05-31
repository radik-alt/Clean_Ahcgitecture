package com.example.cleanahcgitecture.Domain

data class ShopItem (
    var id: Int = UNDEFIND_ID,
    val name: String,
    val count: Int,
    val enabled: Boolean
) {
    companion object{
        const val UNDEFIND_ID = -1
    }
}

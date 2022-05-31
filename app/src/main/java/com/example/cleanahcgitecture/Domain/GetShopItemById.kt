package com.example.cleanahcgitecture.Domain

class GetShopItemById (private val repository: ShopItemRepository) {

    fun getShopItem(id: Int) : ShopItem = repository.getShopItem(id)

}
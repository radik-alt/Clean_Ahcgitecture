package com.example.cleanahcgitecture.Domain

interface ShopItemRepository {

    fun getShopList():List<ShopItem>

    fun getShopItem(id: Int) : ShopItem

    fun pushShopItem(shopItem: ShopItem)

    fun changeShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

}
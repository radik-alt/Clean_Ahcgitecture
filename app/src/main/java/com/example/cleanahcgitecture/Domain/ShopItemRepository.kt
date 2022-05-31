package com.example.cleanahcgitecture.Domain

import androidx.lifecycle.LiveData

interface ShopItemRepository {

    fun getShopList():LiveData<List<ShopItem>>

    fun getShopItem(id: Int) : ShopItem

    fun pushShopItem(shopItem: ShopItem)

    fun changeShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

}
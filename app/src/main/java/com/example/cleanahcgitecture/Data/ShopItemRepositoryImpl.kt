package com.example.cleanahcgitecture.Data

import com.example.cleanahcgitecture.Domain.ShopItem
import com.example.cleanahcgitecture.Domain.ShopItemRepository
import java.lang.RuntimeException

object ShopItemRepositoryImpl : ShopItemRepository{

    private val shopList = mutableListOf<ShopItem>()
    private var autoincrementID = 0

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }

    override fun getShopItem(id: Int): ShopItem {
        return shopList.find { it.id == id } ?: throw RuntimeException("По данному id $id нет обьекта в списке")
    }

    override fun pushShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFIND_ID){
            shopItem.id = autoincrementID++
        }
        shopList.add(shopItem)
    }

    override fun changeShopItem(shopItem: ShopItem) {
        val oldElement = shopList.find { it.id == shopItem.id }
        shopList.remove(oldElement)
        pushShopItem(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }


}
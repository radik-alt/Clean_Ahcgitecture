package com.example.cleanahcgitecture.Domain

class PushShopItemUseCase (private val repository: ShopItemRepository){

    fun pushShopItem(shopItem: ShopItem){
        repository.pushShopItem(shopItem)
    }

}
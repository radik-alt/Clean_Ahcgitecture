package com.example.cleanahcgitecture.Domain

class ChangeShopItemUseCase(private val repository: ShopItemRepository) {

    fun changeShopItem(shopItem: ShopItem){
        repository.changeShopItem(shopItem)
    }

}
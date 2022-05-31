package com.example.cleanahcgitecture.Domain

class DeleteShopItemUseCase(private val repository: ShopItemRepository) {

    fun deleteShopItem(shopItem: ShopItem){
        repository.deleteShopItem(shopItem)
    }

}
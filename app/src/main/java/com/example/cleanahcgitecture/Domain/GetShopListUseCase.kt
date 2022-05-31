package com.example.cleanahcgitecture.Domain

class GetShopListUseCase(private val repository: ShopItemRepository) {

    fun getShopList():List<ShopItem> = repository.getShopList()

}
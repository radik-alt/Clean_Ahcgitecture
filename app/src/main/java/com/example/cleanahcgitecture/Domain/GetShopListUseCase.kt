package com.example.cleanahcgitecture.Domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val repository: ShopItemRepository) {

    fun getShopList():LiveData<List<ShopItem>> = repository.getShopList()

}
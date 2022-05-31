package com.example.cleanahcgitecture.Presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cleanahcgitecture.Data.ShopItemRepositoryImpl
import com.example.cleanahcgitecture.Domain.*

class MainViewModel : ViewModel() {

    private val repository = ShopItemRepositoryImpl

    private val pushUseCase = PushShopItemUseCase(repository)
    private val changeUseCase = ChangeShopItemUseCase(repository)
    private val deleteUseCase = DeleteShopItemUseCase(repository)
    private val getUseCase = GetShopListUseCase(repository)


    private val shopList = getUseCase.getShopList()

    fun getShopList():LiveData<List<ShopItem>> {
        return shopList
    }

    fun deleteShopItem(shopItem: ShopItem){
        deleteUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableShopItem(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = shopItem.enabled)
        changeUseCase.changeShopItem(shopItem)
    }

    fun pushShopItem(shopItem: ShopItem){

    }

}
package com.example.shoplist.domain

class AddShopItemUseCase(private val shopLIstRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem){
        shopLIstRepository.addShopItem(shopItem)
    }
}
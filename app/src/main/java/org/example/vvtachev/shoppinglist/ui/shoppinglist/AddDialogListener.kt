package org.example.vvtachev.shoppinglist.ui.shoppinglist

import org.example.vvtachev.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}
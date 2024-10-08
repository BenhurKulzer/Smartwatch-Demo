package com.example.bearwear.navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.compose.runtime.Composable

import com.example.bearwear.ItemRepository
import com.example.bearwear.screens.ItemListScreen
import com.example.bearwear.screens.DetailScreen

@Composable
fun AppNavHost(navController: NavHostController, itemRepository: ItemRepository) {
    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            ItemListScreen(navController = navController, itemRepository)
        }
        composable("detail/{itemName}") { backStackEntry ->
            val itemName = backStackEntry.arguments?.getString("itemName") ?: "Unknown"
            DetailScreen(itemName = itemName)
        }
    }
}

package uqac.dim.iafarm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uqac.dim.iafarm.presentation.HelpScreen
import uqac.dim.iafarm.presentation.HistoryScreen
import uqac.dim.iafarm.presentation.HomeScreen
import uqac.dim.iafarm.presentation.PhotoScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object History : Screen("history")
    object Help : Screen("help")
    object Photo : Screen("photo")
}

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onTakePhotoClick = { navController.navigate(Screen.Photo.route) },
                onImportPhotoClick = { navController.navigate(Screen.Photo.route) },
                onHistoryClick = { navController.navigate(Screen.History.route) },
                onHelpClick = { navController.navigate(Screen.Help.route) }
            )
        }
        composable(Screen.History.route) {
            HistoryScreen(navController)
        }
        composable(Screen.Help.route) {
            HelpScreen(navController)
        }
        composable(Screen.Photo.route) {
            PhotoScreen(navController)
        }
    }
}

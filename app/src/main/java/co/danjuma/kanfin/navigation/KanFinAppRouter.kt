package co.danjuma.kanfin.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen {

    object SignUpScreen : Screen()
    object TermsAndConditionScreen : Screen()
}


sealed class KanFinAppRouter {

    private var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)


    fun navigateTo(destination: Screen){
        currentScreen.value = destination
    }
}
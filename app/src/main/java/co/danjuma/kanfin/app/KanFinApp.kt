package co.danjuma.kanfin.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import co.danjuma.kanfin.navigation.KanFinAppRouter
import co.danjuma.kanfin.navigation.Screen
import co.danjuma.kanfin.screens.SignUpScreen
import co.danjuma.kanfin.screens.TermsAndConditionsScreen

@Composable
fun KanFinApp() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = KanFinAppRouter.currentScreen, label = "") { currentState ->
            when(currentState.value){
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditionScreen -> {
                    TermsAndConditionsScreen()
                }
            }
            
        }
        
        
        

    }
}
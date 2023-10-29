package co.danjuma.kanfin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.danjuma.kanfin.R
import co.danjuma.kanfin.components.ButtonComponent
import co.danjuma.kanfin.components.ClickableLoginTextComponent
import co.danjuma.kanfin.components.DividerTextComponent
import co.danjuma.kanfin.components.HeadingTextComponent
import co.danjuma.kanfin.components.NormalTextComponent
import co.danjuma.kanfin.components.PasswordTextFieldComponent
import co.danjuma.kanfin.components.TextFieldComponent
import co.danjuma.kanfin.components.UnderlinedTextComponent
import co.danjuma.kanfin.navigation.KanFinAppRouter
import co.danjuma.kanfin.navigation.Screen
import co.danjuma.kanfin.navigation.SystemBackButtonHandler

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {

        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.login))

            HeadingTextComponent(value = stringResource(id = R.string.welcome))

            TextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.email)
            )


            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password)
            )

            Spacer(modifier = Modifier.height(20.dp))

            ButtonComponent(value = stringResource(id = R.string.signin))

            Spacer(modifier = Modifier.height(20.dp))

            UnderlinedTextComponent(
                value = stringResource(id = R.string.forgot_password),
                fontSize = 18.sp
            )

            DividerTextComponent()

            ClickableLoginTextComponent(
                tryingToLogin = false,
                onTextSelected = {},
                fontSize = 15.sp
            )

        }


        SystemBackButtonHandler {
            KanFinAppRouter.navigateTo(Screen.SignUpScreen)
        }

    }
}

@Preview
@Composable
fun LoginScreenPreview() {

    LoginScreen()
}
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
import androidx.lifecycle.viewmodel.compose.viewModel
import co.danjuma.kanfin.components.NormalTextComponent
import co.danjuma.kanfin.R
import co.danjuma.kanfin.components.ButtonComponent
import co.danjuma.kanfin.components.CheckBoxComponent
import co.danjuma.kanfin.components.ClickableLoginTextComponent
import co.danjuma.kanfin.components.DividerTextComponent
import co.danjuma.kanfin.components.HeadingTextComponent
import co.danjuma.kanfin.components.PasswordTextFieldComponent
import co.danjuma.kanfin.components.TextFieldComponent
import co.danjuma.kanfin.data.LoginViewModel
import co.danjuma.kanfin.data.UIEvent
import co.danjuma.kanfin.navigation.KanFinAppRouter
import co.danjuma.kanfin.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(loginViewModel: LoginViewModel = viewModel()) {
    Surface(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column {

            NormalTextComponent(value = stringResource(id = R.string.hello))

            HeadingTextComponent(value = stringResource(id = R.string.create_account))

            Spacer(modifier = Modifier.height(20.dp))

            TextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile),

                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.FirstNameChanged(it))

                }
            )

            TextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile),
                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.LastNameChanged(it))

                }
            )

            TextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.email),
                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.EmailChanged(it))

                }
            )

            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password),
                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.PasswordChanged(it))

                }
            )

            CheckBoxComponent(
                value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {

                    KanFinAppRouter.navigateTo(Screen.TermsAndConditionScreen)

                })
            Spacer(modifier = Modifier.height(80.dp))



            ButtonComponent(value = stringResource(id = R.string.register), onButtonClicked = {
loginViewModel.onEvent(UIEvent.RegistrationButtonClicked)
            })

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {

                KanFinAppRouter.navigateTo(Screen.LoginScreen)

            }, fontSize = 15.sp)
        }
    }
}


@Preview
@Composable
fun SignUpScreenPreview() {

    Surface(
        color = Color.White, modifier = Modifier.fillMaxSize()
    ) {
        SignUpScreen()
    }

}
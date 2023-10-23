package co.danjuma.kanfin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import co.danjuma.kanfin.components.NormalTextComponent
import co.danjuma.kanfin.R
import co.danjuma.kanfin.components.HeadingTextComponent
import co.danjuma.kanfin.components.TextFieldComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {
    Surface(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {

        Column {

            NormalTextComponent(value = stringResource(id = R.string.hello))

            HeadingTextComponent(value = stringResource(id = R.string.create_account))

            TextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile)
            )

            TextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile)
            )

            TextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.email)
            )

            TextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password)
            )

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
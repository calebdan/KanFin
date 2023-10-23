package co.danjuma.kanfin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.danjuma.kanfin.components.NormalTextComponent
import co.danjuma.kanfin.R
import co.danjuma.kanfin.components.HeadingTextComponent

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
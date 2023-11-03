package co.danjuma.kanfin.data

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val TAG = LoginViewModel::class.simpleName

    var registrationUIState = mutableStateOf(RegistrationUIState())

    fun onEvent(event: UIEvent) {
        when (event) {
            is UIEvent.FirstNameChanged -> {

                registrationUIState.value = registrationUIState.value.copy(
                    firstName = event.firstNameChanged
                )

                printState()

            }

            is UIEvent.LastNameChanged -> {

                registrationUIState.value = registrationUIState.value.copy(
                    lastName = event.lastNameChanged
                )
                printState()

            }

            is UIEvent.EmailChanged -> {

                registrationUIState.value = registrationUIState.value.copy(
                    email = event.emailChanged
                )
                printState()

            }

            is UIEvent.PasswordChanged -> {

                registrationUIState.value = registrationUIState.value.copy (
                    password = event.passwordChanged
                )
                printState()
            }
            
            is UIEvent.RegistrationButtonClicked ->{
                signUp()
            }
        }

    }

    private fun signUp() {

        Log.d(TAG, "Inside_signup")
        printState()

    }

    private fun printState() {
        Log.d(TAG, "Inside_printState")
        Log.d(TAG, registrationUIState.value.toString())
    }

}
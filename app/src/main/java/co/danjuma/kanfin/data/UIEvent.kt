package co.danjuma.kanfin.data

sealed class UIEvent {
    data class FirstNameChanged(val firstNameChanged: String) : UIEvent()
    data class LastNameChanged(val lastNameChanged: String) : UIEvent()

    data class EmailChanged(val emailChanged: String) : UIEvent()

    data class PasswordChanged(val passwordChanged: String) : UIEvent()

    object RegistrationButtonClicked: UIEvent()
}
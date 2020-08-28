package farees.hussain.testingapps

object RegistrationUtil  {

    /**
     * ----invalid if
     * ... the username/password is empty
     * ... the username is already taken
     * ... the confirmed password is not the same as the real password
     */

    private val existingUsers = listOf("farees","hussain")

    fun validateRegistrationInput(
        username: String,
        password:String,
        confirmedPassword:String
    ):Boolean{
        if(username.isEmpty() || password.isEmpty()) return false
        if(username in existingUsers) return false
        if(password != confirmedPassword) return false
        if(password.count{it.isDigit()}<4) return false
        return true
    }
}
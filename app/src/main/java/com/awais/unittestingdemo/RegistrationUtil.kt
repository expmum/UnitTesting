package com.awais.unittestingdemo

object RegistrationUtil {

    private val registerNames = listOf("Awais", "Munawar")

    /**
     * the input is not valid if
     * ...the user name is empty/password is empty
     * ...confirm password no matches with password
     * ...the password contains less than 2 digits
     */
    fun validateUserInput(
        userName: String, password: String, confirmPassword: String
    ): Boolean {
        if (userName.isNullOrEmpty() || password.isNullOrEmpty()) {
            return false
        }
        if (userName in registerNames) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}

package com.awais.unittestingdemo

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateUserInput(
            "", "123", "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and password with confirm password return true`() {
        val result = RegistrationUtil.validateUserInput(
            "Ali", "123", "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateUserInput(
            "Munawar", "123", "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateUserInput(
            "Awais", "", ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirm password not matched return false`() {
        val result = RegistrationUtil.validateUserInput(
            "Awais", "1234", "12345"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password length is less than 2 digits return false`() {
        val result = RegistrationUtil.validateUserInput(
            "Awais", "abc1", "abc1"
        )
        assertThat(result).isFalse()
    }
}
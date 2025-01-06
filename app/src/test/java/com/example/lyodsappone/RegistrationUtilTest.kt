package com.example.lyodsappone

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun emptyUsernameTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun emptyPasswordTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "ans",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun emptyUsernameAndPasswordTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun usernameAlreadyExsistTest(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "xyz",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun validateUsernameAndRepeatPasswordTest(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "lmn",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "q",
            "q"
        )
        assertThat(result).isTrue()
    }


}




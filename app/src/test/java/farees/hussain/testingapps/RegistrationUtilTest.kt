package farees.hussain.testingapps

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "farees h",
            "123344",
            "123344"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `existing username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "farees",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password not repeated correctly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123456",
            "24542"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password lenght less than 4 returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }


}
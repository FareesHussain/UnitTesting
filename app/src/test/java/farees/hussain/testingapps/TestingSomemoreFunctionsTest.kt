package farees.hussain.testingapps

import com.google.common.truth.Truth.assertThat
import farees.hussain.testingapps.TestingSomemoreFunctions.checkBraces
import farees.hussain.testingapps.TestingSomemoreFunctions.fib
import org.junit.Test


class TestingSomemoreFunctionsTest {

    @Test
    fun `fib of 0 returns 0`() {
        var res = fib(0)
        assertThat(res).isEqualTo(0)
    }
    @Test
    fun `fib of 1 returns 1`() {
        var res = fib(1)
        assertThat(res).isEqualTo(1)
    }
    @Test
    fun `fib of 4 returns 2`() {
        var res = fib(4)
        assertThat(res).isEqualTo(2)
    }

    @Test
    fun `braces check for {{{}`() {
        var res = checkBraces("{{{}")
        assertThat(res).isFalse()
    }
    @Test
    fun `braces check for {{{}}}()`() {
        var res = checkBraces("{{{}}}()")
        assertThat(res).isTrue()
    }
}
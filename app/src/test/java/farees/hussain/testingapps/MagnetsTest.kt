package farees.hussain.testingapps

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MagnetsTest{
    @Test
    fun FirstTestCase(){
        var result = Magnets.noOfGroupsOfMagnets(6, arrayOf(
            "10","10","10","01","10","10"
        ))
        assertThat(result).isEqualTo(3)
    }
    @Test
    fun SecondTestCase(){
        var result = Magnets.noOfGroupsOfMagnets(4, arrayOf(
            "10","10","01","01"
        ))
        assertThat(result).isEqualTo(2)
    }
}
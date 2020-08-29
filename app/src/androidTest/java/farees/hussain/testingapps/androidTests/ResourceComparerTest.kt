package farees.hussain.testingapps.androidTests

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import farees.hussain.testingapps.R
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{
    private lateinit var resourceComparer : ResourceComparer

    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }

    @After
    fun teardown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returns__True(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        var result = resourceComparer.isEqual(context, R.string.app_name,"Testing Apps")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceDifferentAsGivenString_returns__False(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        var result = resourceComparer.isEqual(context, R.string.app_name,"Testing Aps")
        assertThat(result).isFalse()
    }
}
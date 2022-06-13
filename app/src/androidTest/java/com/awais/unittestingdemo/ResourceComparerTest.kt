package com.awais.unittestingdemo

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer
    private lateinit var context: Context

    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
        context = ApplicationProvider.getApplicationContext()
    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "UnitTestingDemo")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnFalse() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "Awais")
        assertThat(result).isFalse()
    }
}
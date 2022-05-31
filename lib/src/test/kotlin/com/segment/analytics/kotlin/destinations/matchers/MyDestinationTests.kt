package com.segment.analytics.kotlin.destinations.matchers

import android.os.Bundle
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * This is a template with some example code for your tests, which outlines the basics of mocking
 * and matchers. For more info: https://mockk.io/
 *
 * The template uses Robolectric + JUnit as a test runner to simulate the android runtime,
 * and mockK as the mocking framework.
 */
@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE)
class MyDestinationTests {

    class SomeObject {
        fun bundle(bundle: Bundle): Boolean {
            return false
        }
    }

    @Test
    fun `sample mock test`() {
        // https://mockk.io/#dsl-examples
        val bundle = mockk<Bundle>()
        every { bundle.get("key") }.returns("value")
    }

    @Test
    fun `sample bundle matcher`() {
        val valid = Bundle()
        valid.putString("strKey", "invalid")
        valid.putInt("intKey", 10)

        val invalid = Bundle()
        invalid.putString("strKey", "value")
        invalid.putInt("intKey", 10)

        val mock = mockk<SomeObject>()
        // https://mockk.io/#custom-matchers
        every { mock.bundle(matchBundle(valid)) }.returns(true)
        every { mock.bundle(not(matchBundle(valid))) }.returns(false)

        assertTrue(mock.bundle(valid))
        assertFalse(mock.bundle(invalid))
    }
}

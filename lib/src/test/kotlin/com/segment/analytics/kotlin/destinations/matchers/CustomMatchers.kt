package com.segment.analytics.kotlin.destinations.matchers

import android.os.Bundle
import io.mockk.Matcher
import io.mockk.MockKMatcherScope
import org.json.JSONException
import org.json.JSONObject
import org.skyscreamer.jsonassert.JSONAssert
import org.skyscreamer.jsonassert.JSONCompareMode

/**
 * A collection of mockk matchers that are commonly used for testing
 * More info: https://mockk.io/#custom-matchers
 */

private data class BundleMatcher(
    val expectedBundle: Bundle
) : Matcher<Bundle> {

    override fun match(arg: Bundle?): Boolean {
        if (arg == null) return false
        return equalBundles(arg, expectedBundle)
    }

    fun equalBundles(one: Bundle, two: Bundle): Boolean {
        if (one.size() != two.size()) return false

        if (!one.keySet().containsAll(two.keySet())) return false

        for (key in one.keySet()) {
            val valueOne = one.get(key)
            val valueTwo = two.get(key)
            if (valueOne is Bundle && valueTwo is Bundle) {
                if (!equalBundles(valueOne , valueTwo)) return false
            } else if (valueOne != valueTwo) return false
        }

        return true
    }

    override fun toString() = "matchBundle($expectedBundle)"
}

/**
 * Matcher function for Bundle
 * Usage: verify { myFunction(matchBundle(expectedBundle)) }
 */
fun MockKMatcherScope.matchBundle(expectedBundle: Bundle): Bundle =
    match(BundleMatcher(expectedBundle))

private data class JSONObjectMatcher(
    val expectedJSON: JSONObject
) : Matcher<JSONObject> {

    override fun match(arg: JSONObject?): Boolean {
        if (arg == null) return false
        return try {
            JSONAssert.assertEquals(expectedJSON, arg, JSONCompareMode.STRICT)
            true
        } catch (e: JSONException) {
            false
        }
    }

    override fun toString() = "matchJSONObject($expectedJSON)"
}

/**
 * Matcher function for JSONObject
 * Usage: verify { myFunction(matchJSONObject(expectedJSON)) }
 */
fun MockKMatcherScope.matchJSONObject(expectedJSON: JSONObject): JSONObject =
    match(JSONObjectMatcher(expectedJSON))
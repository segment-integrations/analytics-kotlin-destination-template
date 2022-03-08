package com.segment.analytics.kotlin.destinations

import com.segment.analytics.kotlin.core.Analytics
import com.segment.analytics.kotlin.core.platform.Plugin

class Destination: Plugin {
    override var analytics: Analytics
        get() = TODO("Not yet implemented")
        set(value) {}
    override val type: Plugin.Type
        get() = TODO("Not yet implemented")
}
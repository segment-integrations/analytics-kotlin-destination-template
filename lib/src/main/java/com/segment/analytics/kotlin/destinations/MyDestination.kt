package com.segment.analytics.kotlin.destinations

import com.segment.analytics.kotlin.core.AliasEvent
import com.segment.analytics.kotlin.core.BaseEvent
import com.segment.analytics.kotlin.core.GroupEvent
import com.segment.analytics.kotlin.core.IdentifyEvent
import com.segment.analytics.kotlin.core.ScreenEvent
import com.segment.analytics.kotlin.core.Settings
import com.segment.analytics.kotlin.core.TrackEvent
import com.segment.analytics.kotlin.core.platform.DestinationPlugin
import com.segment.analytics.kotlin.core.platform.Plugin

class MyDestination : DestinationPlugin() {
    override val key: String = TODO("Destination Name here")

    override fun update(settings: Settings, type: Plugin.UpdateType) {
        super.update(settings, type)
        if (type == Plugin.UpdateType.Initial) {
            TODO("Setup code with $settings")
        }
    }

    override fun alias(payload: AliasEvent): BaseEvent? {
        return super.alias(payload)
    }

    override fun group(payload: GroupEvent): BaseEvent? {
        return super.group(payload)
    }

    override fun identify(payload: IdentifyEvent): BaseEvent? {
        return super.identify(payload)
    }

    override fun screen(payload: ScreenEvent): BaseEvent? {
        return super.screen(payload)
    }

    override fun track(payload: TrackEvent): BaseEvent? {
        return super.track(payload)
    }
}
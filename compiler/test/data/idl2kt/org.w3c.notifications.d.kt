package org.w3c.notifications

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.events.*
import org.w3c.workers.*

/**
 * Exposes the JavaScript [Notification](https://developer.mozilla.org/en/docs/Web/API/Notification) to Kotlin
 */
public external open class Notification(title: String, options: NotificationOptions = definedExternally) : EventTarget {
    var onclick: ((MouseEvent) -> dynamic)?
    var onerror: ((Event) -> dynamic)?
    open val title: String
    open val dir: NotificationDirection
    open val lang: String
    open val body: String
    open val tag: String
    open val image: String
    open val icon: String
    open val badge: String
    open val sound: String
    open val vibrate: Array<out Int>
    open val timestamp: Number
    open val renotify: Boolean
    open val silent: Boolean
    open val noscreen: Boolean
    open val requireInteraction: Boolean
    open val sticky: Boolean
    open val data: Any?
    open val actions: Array<out NotificationAction>
    fun close()

    companion object {
        val permission: NotificationPermission
        val maxActions: Int
        fun requestPermission(deprecatedCallback: (NotificationPermission) -> Unit = definedExternally): Promise<NotificationPermission>
    }
}

public external interface NotificationOptions {
    var dir: NotificationDirection? /* = NotificationDirection.AUTO */
    var lang: String? /* = "" */
    var body: String? /* = "" */
    var tag: String? /* = "" */
    var image: String?
    var icon: String?
    var badge: String?
    var sound: String?
    var vibrate: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var timestamp: Number?
    var renotify: Boolean? /* = false */
    var silent: Boolean? /* = false */
    var noscreen: Boolean? /* = false */
    var requireInteraction: Boolean? /* = false */
    var sticky: Boolean? /* = false */
    var data: Any? /* = null */
    var actions: Array<NotificationAction>? /* = arrayOf() */
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun NotificationOptions(dir: NotificationDirection? = NotificationDirection.AUTO, lang: String? = "", body: String? = "", tag: String? = "", image: String? = undefined, icon: String? = undefined, badge: String? = undefined, sound: String? = undefined, vibrate: dynamic = undefined, timestamp: Number? = undefined, renotify: Boolean? = false, silent: Boolean? = false, noscreen: Boolean? = false, requireInteraction: Boolean? = false, sticky: Boolean? = false, data: Any? = null, actions: Array<NotificationAction>? = arrayOf()): NotificationOptions {
    val o = js("({})")
    o["dir"] = dir
    o["lang"] = lang
    o["body"] = body
    o["tag"] = tag
    o["image"] = image
    o["icon"] = icon
    o["badge"] = badge
    o["sound"] = sound
    o["vibrate"] = vibrate
    o["timestamp"] = timestamp
    o["renotify"] = renotify
    o["silent"] = silent
    o["noscreen"] = noscreen
    o["requireInteraction"] = requireInteraction
    o["sticky"] = sticky
    o["data"] = data
    o["actions"] = actions
    return o
}

public external interface NotificationAction {
    var action: String?
    var title: String?
    var icon: String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun NotificationAction(action: String?, title: String?, icon: String? = undefined): NotificationAction {
    val o = js("({})")
    o["action"] = action
    o["title"] = title
    o["icon"] = icon
    return o
}

public external interface GetNotificationOptions {
    var tag: String? /* = "" */
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun GetNotificationOptions(tag: String? = ""): GetNotificationOptions {
    val o = js("({})")
    o["tag"] = tag
    return o
}

/**
 * Exposes the JavaScript [NotificationEvent](https://developer.mozilla.org/en/docs/Web/API/NotificationEvent) to Kotlin
 */
public external open class NotificationEvent(type: String, eventInitDict: NotificationEventInit) : ExtendableEvent {
    open val notification: Notification
    open val action: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface NotificationEventInit : ExtendableEventInit {
    var notification: Notification?
    var action: String? /* = "" */
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun NotificationEventInit(notification: Notification?, action: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): NotificationEventInit {
    val o = js("({})")
    o["notification"] = notification
    o["action"] = action
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface NotificationPermission {
    companion object
}

public inline val NotificationPermission.Companion.DEFAULT: NotificationPermission get() = "default".asDynamic().unsafeCast<NotificationPermission>()

public inline val NotificationPermission.Companion.DENIED: NotificationPermission get() = "denied".asDynamic().unsafeCast<NotificationPermission>()

public inline val NotificationPermission.Companion.GRANTED: NotificationPermission get() = "granted".asDynamic().unsafeCast<NotificationPermission>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface NotificationDirection {
    companion object
}

public inline val NotificationDirection.Companion.AUTO: NotificationDirection get() = "auto".asDynamic().unsafeCast<NotificationDirection>()

public inline val NotificationDirection.Companion.LTR: NotificationDirection get() = "ltr".asDynamic().unsafeCast<NotificationDirection>()

public inline val NotificationDirection.Companion.RTL: NotificationDirection get() = "rtl".asDynamic().unsafeCast<NotificationDirection>()
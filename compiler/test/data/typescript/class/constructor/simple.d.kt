// [test] simple.kt
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open class Foo

external open class Bar(a: Number)

external open class BarOptional(a: Number = definedExternally)

external open class BarMultiple {
    constructor(a: Number)
    constructor(b: String)
    constructor(c: Boolean)
}

external open class BarMultipleUnion {
    constructor(a: Number)
    constructor(a: String)
    constructor(a: Boolean)
}
// [test] aliases.kt
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

external var fooKey: dynamic /* String | Foo | Number */

external fun barKey(a: String)

external fun barKey(a: Foo)

external fun barKey(a: Number)

external fun barList(a: List<dynamic /* String | Foo | Number */>)

external fun barArray(a: Array<dynamic /* String | Foo | Number */>)

external interface Parent {
    @nativeInvoke
    operator fun invoke(vararg children: dynamic /* String | Foo | Number */): Foo
}

external interface `T$0` {
    fun ping(): Boolean
}

external interface Argv<T> {
    fun <O> command(handler: (args: Array<O> /* Array<O> & `T$0` */) -> Unit = definedExternally): Argv<T>
}
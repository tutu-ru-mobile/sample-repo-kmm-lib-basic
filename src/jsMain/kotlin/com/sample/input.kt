package com.sample

import kotlinx.html.js.onChangeFunction
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import react.dom.div
import react.dom.input

fun RBuilder.inp(label: String, value: String, onEdit: (String) -> Unit) {
    div {
        input {
            attrs.value = value
            attrs.onChangeFunction = { event ->
                println("event: $event")
                println("event.target: ${event.target}")

                onEdit((event.target as HTMLInputElement).value)
            }
        }
    }
}

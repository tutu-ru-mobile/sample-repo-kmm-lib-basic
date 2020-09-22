package com.sample

import react.RBuilder
import react.dom.div

fun RBuilder.inp(label: String, value: String, onEdit: (String) -> Unit) {
    div {
        +"[in] $label: $value"
    }
}

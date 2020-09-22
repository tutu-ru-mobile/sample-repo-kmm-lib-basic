package com.sample

import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.button
import styled.css
import styled.styledDiv

fun RBuilder.btn(label: String, onClick: () -> Unit) {
    button {
        attrs {
            onClickFunction = {
                onClick()
            }
        }
        styledDiv {
            css {
                fontSize = 20.pt
                if (false) {
                    color = Color.darkGreen
                    fontWeight = FontWeight.bold
                }
            }
            +label
        }
    }
}

package com.sample

import kotlinx.css.*
import kotlinx.css.properties.border
import kotlinx.html.DIV
import react.RBuilder
import react.dom.RDOMBuilder
import react.dom.div
import styled.StyledDOMBuilder
import styled.css
import styled.styledDiv

fun RBuilder.cel(block: RDOMBuilder<DIV>.() -> Unit) {
    styledDiv {
        css {
            padding(all = 10.px)
        }
        styledDiv {
            css {
//                backgroundColor = Color.lightGray
//                border(1.px, BorderStyle.solid, Color.black)
                margin(3.px)
            }
            block()
        }
    }
}

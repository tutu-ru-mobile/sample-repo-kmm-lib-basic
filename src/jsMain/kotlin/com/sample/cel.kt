package com.sample

import kotlinx.css.*
import kotlinx.css.properties.border
import kotlinx.html.DIV
import react.RBuilder
import styled.StyledDOMBuilder
import styled.css
import styled.styledDiv

fun RBuilder.cel(block: StyledDOMBuilder<DIV>.() -> Unit) {
    styledDiv {
        css {
            padding(all = 10.px)
        }
        styledDiv {
            css {
                backgroundColor = Color.lightGray
                border(LinearDimension.borderBox, BorderStyle.solid, Color.black)
            }
            block()
        }
    }
}

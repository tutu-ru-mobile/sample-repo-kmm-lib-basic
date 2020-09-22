package com.sample

import kotlinx.css.Color
import kotlinx.css.backgroundColor
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.html.DIV
import react.RBuilder
import styled.StyledDOMBuilder
import styled.css
import styled.styledDiv

fun RBuilder.cel(block: StyledDOMBuilder<DIV>.() -> Unit) {
    styledDiv {
        css {
            padding(all = 10.px)
            backgroundColor = Color.lightGray
        }
        block()
    }
}

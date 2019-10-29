package com.mumetngoding.firstligadicodingapps

import android.content.res.Resources
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class ClubUI : AnkoComponent<ViewGroup> {

    companion object {
        val club_image = 1
        val club_name = 2
        val club_id = 3
    }

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        verticalLayout {
            orientation = LinearLayout.HORIZONTAL
            padding = dip(16)

            imageView {
                id = club_image
            }.lparams(width = 50.dp, height = 50.dp)

            textView {
                id = club_id
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(7)
            }

            textView {
                id = club_name
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(5)
            }

        }
    }
}
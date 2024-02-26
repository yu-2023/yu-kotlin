
/**
 *
 * Kotlin package     lv.yu.kot.start
 *
 * Kotlin program     KOT_start_visualize_08.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023               mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.start

import java.awt.BorderLayout

fun KOT_start_visualize_08() {

//--------------------------------------------------

        lv.yu.kot.start.KOT_start_08()

//--------------------------------------------------

        lv.yu.kot.desktoppane_08_11.removeAll()

        lv.yu.kot.start.start_11.KOT_start_11_08()

        lv.yu.kot.desktoppane_08_11.add(lv.yu.kot.start.start_11.JInternalFrame_start_08_11, BorderLayout.CENTER)

        lv.yu.kot.panel_08_1.add(lv.yu.kot.desktoppane_08_11, BorderLayout.WEST)

//--------------------------------------------------

        lv.yu.kot.desktoppane_08_12.removeAll()

        lv.yu.kot.start.start_12.KOT_start_12_08()

        lv.yu.kot.desktoppane_08_12.add(lv.yu.kot.start.start_12.JInternalFrame_start_08_12, BorderLayout.CENTER)

        lv.yu.kot.panel_08_1.add(lv.yu.kot.desktoppane_08_12, BorderLayout.CENTER)

//--------------------------------------------------

        lv.yu.kot.desktoppane_08_13.removeAll()

        lv.yu.kot.start.start_13.KOT_start_13_08()

        lv.yu.kot.desktoppane_08_13.add(lv.yu.kot.start.start_13.JInternalFrame_start_08_13, BorderLayout.CENTER)

        lv.yu.kot.panel_08_1.add(lv.yu.kot.desktoppane_08_13, BorderLayout.EAST)

//--------------------------------------------------

        lv.yu.kot.desktoppane_08_21.removeAll()

        lv.yu.kot.start.start_21.KOT_start_21_08()

        lv.yu.kot.desktoppane_08_21.add(lv.yu.kot.start.start_21.JInternalFrame_start_08_21, BorderLayout.CENTER)

        lv.yu.kot.panel_08_2.add(lv.yu.kot.desktoppane_08_21, BorderLayout.WEST)

//--------------------------------------------------

        lv.yu.kot.desktoppane_08_22.removeAll()

        lv.yu.kot.start.start_22.KOT_start_22_08()

        lv.yu.kot.desktoppane_08_22.add(lv.yu.kot.start.start_22.JInternalFrame_start_08_22, BorderLayout.CENTER)

        lv.yu.kot.panel_08_2.add(lv.yu.kot.desktoppane_08_22, BorderLayout.CENTER)

//--------------------------------------------------

        lv.yu.kot.desktoppane_08_23.removeAll()

        lv.yu.kot.start.start_23.KOT_start_23_08()

        lv.yu.kot.desktoppane_08_23.add(lv.yu.kot.start.start_23.JInternalFrame_start_08_23, BorderLayout.CENTER)

        lv.yu.kot.panel_08_2.add(lv.yu.kot.desktoppane_08_23, BorderLayout.EAST)

//--------------------------------------------------

        lv.yu.kot.frame_08.isVisible = true 

}  //  end KOT_start_visualize_08()


/**
 *
 * Kotlin package     lv.yu.kot.start.start_13
 *
 * Kotlin program     KOT_start_13_10.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.start.start_13

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_start_10_13    = JTabbedPane()
    public var JInternalFrame_start_10_13 = JInternalFrame()

fun KOT_start_13_10() {

        JTabbedPane_start_10_13 = JTabbedPane()
        JTabbedPane_start_10_13.removeAll()

        KOT_start_13_about_10()
        KOT_start_13_help_10()

        JTabbedPane_start_10_13.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_10_13.setTabLayoutPolicy(1)

        JInternalFrame_start_10_13 = JInternalFrame("13 START", true, false, true, true)
        JInternalFrame_start_10_13.setLayout(BorderLayout())
        JInternalFrame_start_10_13.setBackground(Color.GRAY)
        JInternalFrame_start_10_13.isVisible = true

        JInternalFrame_start_10_13.add(JTabbedPane_start_10_13, BorderLayout.CENTER)

}  //  end KOT_start_13_10()

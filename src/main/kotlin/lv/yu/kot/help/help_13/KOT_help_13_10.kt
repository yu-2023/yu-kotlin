
/**
 *
 * Kotlin package     lv.yu.kot.help.help_13
 *
 * Kotlin program     KOT_help_13_10.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023       mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.help.help_13

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_help_10_13    = JTabbedPane()
    public var JInternalFrame_help_10_13 = JInternalFrame()

fun KOT_help_13_10() {

        JTabbedPane_help_10_13 = JTabbedPane()
        JTabbedPane_help_10_13.removeAll()

        KOT_help_13_about_10()
        KOT_help_13_help_10()

        JTabbedPane_help_10_13.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_10_13.setTabLayoutPolicy(1)

        JInternalFrame_help_10_13 = JInternalFrame("13 HELP", true, false, true, true)
        JInternalFrame_help_10_13.setLayout(BorderLayout())
        JInternalFrame_help_10_13.setBackground(Color.GRAY)
        JInternalFrame_help_10_13.isVisible = true

        JInternalFrame_help_10_13.add(JTabbedPane_help_10_13, BorderLayout.CENTER)

}  //  end KOT_help_13_10()

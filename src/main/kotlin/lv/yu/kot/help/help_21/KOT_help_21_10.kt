
/**
 *
 * Kotlin package     lv.yu.kot.help.help_21
 *
 * Kotlin program     KOT_help_21_10.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023       mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.help.help_21

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_help_10_21    = JTabbedPane()
    public var JInternalFrame_help_10_21 = JInternalFrame()

fun KOT_help_21_10() {

        JTabbedPane_help_10_21 = JTabbedPane()
        JTabbedPane_help_10_21.removeAll()

        KOT_help_21_about_10()
        KOT_help_21_help_10()

        JTabbedPane_help_10_21.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_10_21.setTabLayoutPolicy(1)

        JInternalFrame_help_10_21 = JInternalFrame("21 HELP", true, false, true, true)
        JInternalFrame_help_10_21.setLayout(BorderLayout())
        JInternalFrame_help_10_21.setBackground(Color.GRAY)
        JInternalFrame_help_10_21.isVisible = true

        JInternalFrame_help_10_21.add(JTabbedPane_help_10_21, BorderLayout.CENTER)

}  //  end KOT_help_21_10()

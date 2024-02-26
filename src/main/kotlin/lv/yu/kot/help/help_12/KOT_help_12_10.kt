
/**
 *
 * Kotlin package     lv.yu.kot.help.help_12
 *
 * Kotlin program     KOT_help_12_10.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023       mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.help.help_12

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_help_10_12    = JTabbedPane()
    public var JInternalFrame_help_10_12 = JInternalFrame()

fun KOT_help_12_10() {

        JTabbedPane_help_10_12 = JTabbedPane()
        JTabbedPane_help_10_12.removeAll()

        KOT_help_12_about_10()
        KOT_help_12_help_10()

        JTabbedPane_help_10_12.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_10_12.setTabLayoutPolicy(1)

        JInternalFrame_help_10_12 = JInternalFrame("12 HELP HELP HELP", true, false, true, true)
        JInternalFrame_help_10_12.setLayout(BorderLayout())
        JInternalFrame_help_10_12.setBackground(Color.GRAY)
        JInternalFrame_help_10_12.isVisible = true

        JInternalFrame_help_10_12.add(JTabbedPane_help_10_12, BorderLayout.CENTER)

}  //  end KOT_help_12_10()

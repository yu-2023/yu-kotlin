
/**
 *
 * Kotlin package     lv.yu.kot.xxxxx.xxxxx_22
 *
 * Kotlin program     KOT_xxxxx_22_10.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.xxxxx.xxxxx_22

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_xxxxx_10_22    = JTabbedPane()
    public var JInternalFrame_xxxxx_10_22 = JInternalFrame()

fun KOT_xxxxx_22_10() {

        JTabbedPane_xxxxx_10_22 = JTabbedPane()
        JTabbedPane_xxxxx_10_22.removeAll()

        KOT_xxxxx_22_about_10()
        KOT_xxxxx_22_help_10()

        JTabbedPane_xxxxx_10_22.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_10_22.setTabLayoutPolicy(1)

        JInternalFrame_xxxxx_10_22 = JInternalFrame("22 XXXXX XXXXX XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_10_22.setLayout(BorderLayout())
        JInternalFrame_xxxxx_10_22.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_10_22.isVisible = true

        JInternalFrame_xxxxx_10_22.add(JTabbedPane_xxxxx_10_22, BorderLayout.CENTER)

}  //  end KOT_xxxxx_22_10()

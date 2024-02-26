
/**
 *
 * Kotlin package     lv.yu.kot.xxxxx.xxxxx_13
 *
 * Kotlin program     KOT_xxxxx_13_09.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.xxxxx.xxxxx_13

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_xxxxx_09_13    = JTabbedPane()
    public var JInternalFrame_xxxxx_09_13 = JInternalFrame()

fun KOT_xxxxx_13_09() {

        JTabbedPane_xxxxx_09_13 = JTabbedPane()
        JTabbedPane_xxxxx_09_13.removeAll()

        JTabbedPane_xxxxx_09_13.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_09_13.setTabLayoutPolicy(1)

        JInternalFrame_xxxxx_09_13 = JInternalFrame("13 XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_09_13.setLayout(BorderLayout())
        JInternalFrame_xxxxx_09_13.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_09_13.isVisible = true

        JInternalFrame_xxxxx_09_13.add(JTabbedPane_xxxxx_09_13, BorderLayout.CENTER)

}  //  end KOT_xxxxx_13_09()

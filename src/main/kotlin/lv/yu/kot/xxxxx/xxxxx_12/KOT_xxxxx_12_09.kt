
/**
 *
 * Kotlin package     lv.yu.kot.xxxxx.xxxxx_12
 *
 * Kotlin program     KOT_xxxxx_12_09.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.xxxxx.xxxxx_12

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_xxxxx_09_12    = JTabbedPane()
    public var JInternalFrame_xxxxx_09_12 = JInternalFrame()

fun KOT_xxxxx_12_09() {

        JTabbedPane_xxxxx_09_12 = JTabbedPane()
        JTabbedPane_xxxxx_09_12.removeAll()

        JTabbedPane_xxxxx_09_12.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_09_12.setTabLayoutPolicy(1)

        JInternalFrame_xxxxx_09_12 = JInternalFrame("12 XXXXX XXXXX XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_09_12.setLayout(BorderLayout())
        JInternalFrame_xxxxx_09_12.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_09_12.isVisible = true

        JInternalFrame_xxxxx_09_12.add(JTabbedPane_xxxxx_09_12, BorderLayout.CENTER)

}  //  end KOT_xxxxx_12_09()

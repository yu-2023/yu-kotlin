
/**
 *
 * Kotlin package     lv.yu.kot.xxxxx.xxxxx_21
 *
 * Kotlin program     KOT_xxxxx_21_09.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.xxxxx.xxxxx_21

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_xxxxx_09_21    = JTabbedPane()
    public var JInternalFrame_xxxxx_09_21 = JInternalFrame()

fun KOT_xxxxx_21_09() {

        JTabbedPane_xxxxx_09_21 = JTabbedPane()
        JTabbedPane_xxxxx_09_21.removeAll()

        JTabbedPane_xxxxx_09_21.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_09_21.setTabLayoutPolicy(1)

        JInternalFrame_xxxxx_09_21 = JInternalFrame("21 XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_09_21.setLayout(BorderLayout())
        JInternalFrame_xxxxx_09_21.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_09_21.isVisible = true

        JInternalFrame_xxxxx_09_21.add(JTabbedPane_xxxxx_09_21, BorderLayout.CENTER)

}  //  end KOT_xxxxx_21_09()

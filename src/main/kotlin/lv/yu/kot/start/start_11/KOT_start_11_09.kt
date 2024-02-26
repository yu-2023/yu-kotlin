
/**
 *
 * Kotlin package     lv.yu.kot.start.start_11
 *
 * Kotlin program     KOT_start_11_09.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.start.start_11

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_start_09_11    = JTabbedPane()
    public var JInternalFrame_start_09_11 = JInternalFrame()

fun KOT_start_11_09() {

        JTabbedPane_start_09_11 = JTabbedPane()
        JTabbedPane_start_09_11.removeAll()

        JTabbedPane_start_09_11.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_09_11.setTabLayoutPolicy(1)

        JInternalFrame_start_09_11 = JInternalFrame("11 START", true, false, true, true)
        JInternalFrame_start_09_11.setLayout(BorderLayout())
        JInternalFrame_start_09_11.setBackground(Color.GRAY)
        JInternalFrame_start_09_11.isVisible = true

        JInternalFrame_start_09_11.add(JTabbedPane_start_09_11, BorderLayout.CENTER)

}  //  end KOT_start_11_09()


/**
 *
 * Kotlin package     lv.yu.kot.start.start_22
 *
 * Kotlin program     KOT_start_22_09.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.start.start_22

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_start_09_22    = JTabbedPane()
    public var JInternalFrame_start_09_22 = JInternalFrame()

fun KOT_start_22_09() {

        JTabbedPane_start_09_22 = JTabbedPane()
        JTabbedPane_start_09_22.removeAll()

        JTabbedPane_start_09_22.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_09_22.setTabLayoutPolicy(1)

        JInternalFrame_start_09_22 = JInternalFrame("22 START START START", true, false, true, true)
        JInternalFrame_start_09_22.setLayout(BorderLayout())
        JInternalFrame_start_09_22.setBackground(Color.GRAY)
        JInternalFrame_start_09_22.isVisible = true

        JInternalFrame_start_09_22.add(JTabbedPane_start_09_22, BorderLayout.CENTER)

}  //  end KOT_start_22_09()

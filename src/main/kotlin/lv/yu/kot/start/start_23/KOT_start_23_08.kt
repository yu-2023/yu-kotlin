
/**
 * 
 * Kotlin package     lv.yu.kot.start.start_23
 * 
 * Kotlin program     KOT_start_23_08.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start.start_23

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_start_08_23    = JTabbedPane()
    public var JInternalFrame_start_08_23 = JInternalFrame()
           
fun KOT_start_23_08() { 
                                
        JTabbedPane_start_08_23 = JTabbedPane()
        JTabbedPane_start_08_23.removeAll()

        JTabbedPane_start_08_23.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_08_23.setTabLayoutPolicy(1)
        
        JInternalFrame_start_08_23 = JInternalFrame("23 START", true, false, true, true)
        JInternalFrame_start_08_23.setLayout(BorderLayout())
        JInternalFrame_start_08_23.setBackground(Color.GRAY)
        JInternalFrame_start_08_23.isVisible = true

        JInternalFrame_start_08_23.add(JTabbedPane_start_08_23, BorderLayout.CENTER)
               
}  //  end KOT_start_23_08()

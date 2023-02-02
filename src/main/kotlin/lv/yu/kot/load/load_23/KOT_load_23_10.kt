
/**
 * 
 * Kotlin package     lv.yu.kot.load.load_23
 * 
 * Kotlin program     KOT_load_23_10.kt          Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.load.load_23

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_load_10_23    = JTabbedPane()
    public var JInternalFrame_load_10_23 = JInternalFrame()
           
fun KOT_load_23_10() { 
                     
        JTabbedPane_load_10_23 = JTabbedPane()
    	JTabbedPane_load_10_23.removeAll()
    	
        KOT_load_23_about_10()
        KOT_load_23_help_10()

        JTabbedPane_load_10_23.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_10_23.setTabLayoutPolicy(1)
        
        JInternalFrame_load_10_23 = JInternalFrame("23 LOAD", true, false, true, true)
        JInternalFrame_load_10_23.setLayout(BorderLayout())
        JInternalFrame_load_10_23.setBackground(Color.GRAY)
        JInternalFrame_load_10_23.isVisible = true

        JInternalFrame_load_10_23.add(JTabbedPane_load_10_23, BorderLayout.CENTER)
               
}  //  end KOT_load_23_10()

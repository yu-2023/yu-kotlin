
/**
 * 
 * Kotlin package     lv.yu.kot.load.load_12
 * 
 * Kotlin program     KOT_load_12_10.kt          Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.load.load_12

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_load_10_12    = JTabbedPane()
    public var JInternalFrame_load_10_12 = JInternalFrame()
           
fun KOT_load_12_10() { 
                            
        JTabbedPane_load_10_12 = JTabbedPane()
    	JTabbedPane_load_10_12.removeAll()
    	
        KOT_load_12_about_10()
        KOT_load_12_help_10()

        JTabbedPane_load_10_12.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_10_12.setTabLayoutPolicy(1)
        
        JInternalFrame_load_10_12 = JInternalFrame("12 LOAD LOAD LOAD", true, false, true, true)
        JInternalFrame_load_10_12.setLayout(BorderLayout())
        JInternalFrame_load_10_12.setBackground(Color.GRAY)
        JInternalFrame_load_10_12.isVisible = true
        
        JInternalFrame_load_10_12.add(JTabbedPane_load_10_12, BorderLayout.CENTER)
               
}  //  end KOT_load_12_10()


/**
 * 
 * Kotlin package     lv.yu.kot.help.help_11
 * 
 * Kotlin program     KOT_help_11_10.kt          Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.help.help_11

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_help_10_11    = JTabbedPane()
    public var JInternalFrame_help_10_11 = JInternalFrame()
           
fun KOT_help_11_10() { 
    	
        JTabbedPane_help_10_11 = JTabbedPane()
    	JTabbedPane_help_10_11.removeAll()
    	
        KOT_help_11_about_10()
        KOT_help_11_help_10()

        JTabbedPane_help_10_11.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_10_11.setTabLayoutPolicy(1)
        
    	JInternalFrame_help_10_11 = JInternalFrame("11 HELP", true, false, true, true)
    	JInternalFrame_help_10_11.setLayout(BorderLayout())
    	JInternalFrame_help_10_11.setBackground(Color.GRAY)
       	JInternalFrame_help_10_11.isVisible = true
        
        JInternalFrame_help_10_11.add(JTabbedPane_help_10_11, BorderLayout.CENTER)
        
}  //  end KOT_help_11_10()

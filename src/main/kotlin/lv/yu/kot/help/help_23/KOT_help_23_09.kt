
/**
 * 
 * Kotlin package     lv.yu.kot.help.help_23
 * 
 * Kotlin program     KOT_help_23_09.kt          Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.help.help_23

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_help_09_23    = JTabbedPane()
    public var JInternalFrame_help_09_23 = JInternalFrame()
           
fun KOT_help_23_09() { 
                                
        JTabbedPane_help_09_23 = JTabbedPane()
    	JTabbedPane_help_09_23.removeAll()
    	
        JTabbedPane_help_09_23.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_09_23.setTabLayoutPolicy(1)
        
    	JInternalFrame_help_09_23 = JInternalFrame("23 HELP", true, false, true, true)
    	JInternalFrame_help_09_23.setLayout(BorderLayout())
    	JInternalFrame_help_09_23.setBackground(Color.GRAY)
        JInternalFrame_help_09_23.isVisible = true

        JInternalFrame_help_09_23.add(JTabbedPane_help_09_23, BorderLayout.CENTER)
               
}  //  end KOT_help_23_09()

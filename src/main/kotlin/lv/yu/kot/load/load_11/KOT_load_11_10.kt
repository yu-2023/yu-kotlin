
/**
 * 
 * Kotlin package     lv.yu.kot.load.load_11
 * 
 * Kotlin program     KOT_load_11_10.kt          Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.load.load_11

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

    public var JTabbedPane_load_10_11    = JTabbedPane()
    public var JInternalFrame_load_10_11 = JInternalFrame()
           
fun KOT_load_11_10() { 

        JTabbedPane_load_10_11 = JTabbedPane()
    	JTabbedPane_load_10_11.removeAll()
    	
        KOT_load_11_about_10()
        KOT_load_11_help_10()

        JTabbedPane_load_10_11.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_10_11.setTabLayoutPolicy(1)
        
      	JInternalFrame_load_10_11 = JInternalFrame("11 LOAD", true, false, true, true)
       	JInternalFrame_load_10_11.setLayout(BorderLayout())
       	JInternalFrame_load_10_11.setBackground(Color.GRAY)
       	JInternalFrame_load_10_11.isVisible = true
    
        JInternalFrame_load_10_11.add(JTabbedPane_load_10_11, BorderLayout.CENTER)
        
}  //  end KOT_load_11_10()

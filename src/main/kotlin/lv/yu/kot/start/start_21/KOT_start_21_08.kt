
/**
 * 
 * Kotlin package     lv.yu.kot.start.start_21
 * 
 * Kotlin program     KOT_start_21_08.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start.start_21

import java.awt.*
import java.awt.event.KeyEvent

import javax.swing.*
	
    public var JTabbedPane_start_21       = JTabbedPane()
    public var JInternalFrame_start_08_21 = JInternalFrame()
           
fun KOT_start_21_08() { 
                         
	    JTabbedPane_start_21 = JTabbedPane()
    	JTabbedPane_start_21.removeAll()

        JTabbedPane_start_21.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_21.setTabLayoutPolicy(1)
        
    	JInternalFrame_start_08_21 = JInternalFrame("21 START", true, false, true, true)
    	JInternalFrame_start_08_21.setLayout(BorderLayout())
    	JInternalFrame_start_08_21.setBackground(Color.GRAY)
        JInternalFrame_start_08_21.isVisible = true

        JInternalFrame_start_08_21.add(JTabbedPane_start_21, BorderLayout.CENTER)
               
}  //  end KOT_start_21_08()


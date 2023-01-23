
/**
 * 
 * Kotlin package     lv.yu.kot.start.start_13
 * 
 * Kotlin program     KOT_start_13_08.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start.start_13

import java.awt.*
import java.awt.event.KeyEvent

import javax.swing.*
	
    public var JTabbedPane_start_13       = JTabbedPane()
    public var JInternalFrame_start_08_13 = JInternalFrame()
           
fun KOT_start_13_08() { 

	    JTabbedPane_start_13 = JTabbedPane()         
    	JTabbedPane_start_13.removeAll()

        JTabbedPane_start_13.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_13.setTabLayoutPolicy(1)
        
        JInternalFrame_start_08_13 = JInternalFrame("13 START", true, false, true, true)
    	JInternalFrame_start_08_13.setLayout(BorderLayout())
    	JInternalFrame_start_08_13.setBackground(Color.GRAY)
        JInternalFrame_start_08_13.isVisible = true

        JInternalFrame_start_08_13.add(JTabbedPane_start_13, BorderLayout.CENTER)
              
}  //  end JAV_start_13_08()



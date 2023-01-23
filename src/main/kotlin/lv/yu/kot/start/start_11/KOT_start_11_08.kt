
/**
 * 
 * Kotlin package     lv.yu.kot.start.start_11
 * 
 * Kotlin program     KOT_start_11_08.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023        mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start.start_11

import java.awt.*
import java.awt.event.KeyEvent

import javax.swing.*

    public var JTabbedPane_start_11       = JTabbedPane()
    public var JInternalFrame_start_08_11 = JInternalFrame()
           
fun KOT_start_11_08() { 
    	
	    JTabbedPane_start_11 = JTabbedPane()
    	JTabbedPane_start_11.removeAll()

        JTabbedPane_start_11.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_11.setTabLayoutPolicy(1)

        JInternalFrame_start_08_11 = JInternalFrame("11 START", true, false, true, true)
    	JInternalFrame_start_08_11.setLayout(BorderLayout())
    	JInternalFrame_start_08_11.setBackground(Color.GRAY)
       	JInternalFrame_start_08_11.isVisible = true
        
        JInternalFrame_start_08_11.add(JTabbedPane_start_11, BorderLayout.CENTER)  
   
}  //  end JAV_start_11_08()


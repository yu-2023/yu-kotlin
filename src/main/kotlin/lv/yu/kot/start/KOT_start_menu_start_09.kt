
/**
 * 
 * Kotlin package     lv.yu.kot.start
 * 
 * Kotlin program     KOT_start_menu_start_09.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start

import javax.swing.JMenuItem
import javax.swing.ImageIcon
import javax.swing.KeyStroke

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
	
fun KOT_start_menu_start_09() {

//------------------------------
    	
    val icon_Start = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/start.gif"))
    
//------------------------------
      
      val item_Start = JMenuItem("Start", icon_Start)
          item_Start.toolTipText = "Start application"
          item_Start.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK))  //  Alt S
 
//------------------------------
            
          item_Start.addActionListener { e: ActionEvent -> lv.yu.kot.start.KOT_start_visualize_09() }

//------------------------------
            
        lv.yu.kot.start.menu_Menu_09.add(item_Start)

        lv.yu.kot.menubar_09.add(lv.yu.kot.start.menu_Menu_09)
       
//------------------------------
            
}  //  end KOT_start_menu_start_09()

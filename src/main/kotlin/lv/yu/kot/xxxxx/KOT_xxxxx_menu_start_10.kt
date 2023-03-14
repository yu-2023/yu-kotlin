
/**
 * 
 * Kotlin package     lv.yu.kot.xxxxx
 * 
 * Kotlin program     KOT_xxxxx_menu_start_10.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.xxxxx

import javax.swing.JMenuItem
import javax.swing.ImageIcon
import javax.swing.KeyStroke

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
	
fun KOT_xxxxx_menu_start_10() {

//------------------------------
    	
    val icon_Xxxx = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/xxxx.png")) 
    
//------------------------------
      
      val item_Xxxx = JMenuItem("Xxxx", icon_Xxxx)
          item_Xxxx.toolTipText = "Xxxx application"
          item_Xxxx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK))   //  Alt X  
 
//------------------------------
            
          item_Xxxx.addActionListener { e: ActionEvent -> lv.yu.kot.xxxxx.KOT_xxxxx_visualize_10() }

//------------------------------
            
        lv.yu.kot.start.menu_Menu_10.add(item_Xxxx)

        lv.yu.kot.menubar_10.add(lv.yu.kot.start.menu_Menu_10)
       
//------------------------------
            
}  //  end KOT_xxxxx_menu_start_10()

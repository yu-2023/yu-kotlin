
/**
 * 
 * Kotlin package     lv.yu.kot.load
 * 
 * Kotlin program     KOT_load_menu_start_09.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023               mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.load  //  KOT_load_menu_start.kt

import javax.swing.JMenuItem
import javax.swing.ImageIcon
import javax.swing.KeyStroke

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

fun KOT_load_menu_start_09() {

//------------------------------
    	
    val icon_Load = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/load.gif")) 

//------------------------------
      
      val item_Load = JMenuItem("Load", icon_Load)
          item_Load.toolTipText = "Load application"
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK))   //  Alt L
 
//------------------------------
    
          item_Load.addActionListener { e: ActionEvent -> lv.yu.kot.load.KOT_load_visualize_09() } 

//------------------------------
            
        lv.yu.kot.start.menu_Menu_09.add(item_Load)

        lv.yu.kot.menubar_09.add(lv.yu.kot.start.menu_Menu_09)
            
//------------------------------
       
}  //  end KOT_load_menu_start_09()

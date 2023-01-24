
/**
 * 
 * Kotlin package     lv.yu.kot.start
 * 
 * Kotlin program     KOT_start_menu_08.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start

import javax.swing.JMenuBar
import javax.swing.JMenu

import java.awt.event.KeyEvent

    public var menu_Menu = JMenu()

fun KOT_start_menu_08() {

        lv.yu.kot.menubar_08 = JMenuBar()      
    	lv.yu.kot.menubar_08.setLayout( lv.yu.kot.JAV_LIB_wrap_layout (lv.yu.kot.JAV_LIB_wrap_layout.LEFT, 0, 0) )
    	
            menu_Menu = JMenu("Menu")
            menu_Menu.mnemonic = KeyEvent.VK_M  //  Alt M
            menu_Menu.toolTipText = "Menu commands"    

            lv.yu.kot.menubar_08.add(menu_Menu) 
                        
}  //  end KOT_start_menu_08()

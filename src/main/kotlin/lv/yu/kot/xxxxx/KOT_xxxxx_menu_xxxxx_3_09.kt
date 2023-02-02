
/**
 * 
 * Kotlin package     lv.yu.kot.xxxxx
 * 
 * Kotlin program     KOT_xxxxx_menu_xxxxx_3_09.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.xxxxx

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

fun KOT_xxxxx_menu_xxxxx_3_09() {

    	val menu_Xxxxx_3 = JMenu("Xxxxx3")
            menu_Xxxxx_3.mnemonic = KeyEvent.VK_3  //  Alt 3
            menu_Xxxxx_3.toolTipText = "Xxxxx3 commands"
            
        val item_Xx31 = JMenuItem("Xx31")
            item_Xx31.toolTipText = "Xx31 application"
			item_Xx31.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Xxxxx_3.add(item_Xx31)

        val item_Xx32 = JMenuItem("Xx32")
            item_Xx32.toolTipText = "Xx32 application"
			item_Xx32.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Xxxxx_3.add(item_Xx32)

            lv.yu.kot.menubar_09.add(menu_Xxxxx_3)

}  //  end KOT_xxxxx_menu_xxxxx_3_09()

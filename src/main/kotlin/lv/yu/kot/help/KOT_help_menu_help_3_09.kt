
/**
 * 
 * Kotlin package     lv.yu.kot.help
 * 
 * Kotlin program     KOT_help_menu_help_3_09.kt       Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.help

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

fun KOT_help_menu_help_3_09() {

        val menu_Help_3 = JMenu("Help3")
            menu_Help_3.mnemonic = KeyEvent.VK_3  //  Alt 3
            menu_Help_3.toolTipText = "Help3 commands"
            
        val item_He31 = JMenuItem("He31")
            item_He31.toolTipText = "He31 application"
			item_He31.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Help_3.add(item_He31)

        val item_He32 = JMenuItem("He32")
            item_He32.toolTipText = "He32 application"
			item_He32.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Help_3.add(item_He32)

            lv.yu.kot.menubar_09.add(menu_Help_3)       

}  //  end KOT_help_menu_help_3_09()

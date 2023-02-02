
/**
 * 
 * Kotlin package     lv.yu.kot.help
 * 
 * Kotlin program     KOT_help_menu_help_1_10.kt       Apache License 2.0
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

fun KOT_help_menu_help_1_10() {

        val menu_Help_1 = JMenu("Help1")
            menu_Help_1.mnemonic = KeyEvent.VK_1  //  Alt 1
            menu_Help_1.toolTipText = "Help1 commands"
            
        val item_He11 = JMenuItem("He11")
            item_He11.toolTipText = "He11 application"
            item_He11.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Help_1.add(item_He11)

        val item_He12 = JMenuItem("He12")
            item_He12.toolTipText = "He12 application"
            item_He12.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Help_1.add(item_He12)

            lv.yu.kot.menubar_10.add(menu_Help_1)       

}  //  end KOT_help_menu_help_1_10()

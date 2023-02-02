
/**
 * 
 * Kotlin package     lv.yu.kot.help
 * 
 * Kotlin program     KOT_help_menu_help_2_09.kt       Apache License 2.0
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

fun KOT_help_menu_help_2_09() {

        val menu_Help_2 = JMenu("Help2")
            menu_Help_2.mnemonic = KeyEvent.VK_2  //  Alt 2
            menu_Help_2.toolTipText = "Help2 commands"
            
        val item_He21 = JMenuItem("He21")
            item_He21.toolTipText = "He21 application"
            item_He21.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Help_2.add(item_He21)

        val item_He22 = JMenuItem("He22")
            item_He22.toolTipText = "He22 application"
            item_He22.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Help_2.add(item_He22)

            lv.yu.kot.menubar_09.add(menu_Help_2)      

}  //  end KOT_help_menu_help_2_09()

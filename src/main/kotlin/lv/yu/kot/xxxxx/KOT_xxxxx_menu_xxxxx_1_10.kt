
/**
 * 
 * Kotlin package     lv.yu.kot.xxxxx
 * 
 * Kotlin program     KOT_xxxxx_menu_xxxxx_1_10.kt     Apache License 2.0
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

fun KOT_xxxxx_menu_xxxxx_1_10() {

        val menu_Xxxxx_1 = JMenu("Xxxxx1")
            menu_Xxxxx_1.mnemonic = KeyEvent.VK_1  //  Alt 1
            menu_Xxxxx_1.toolTipText = "Xxxxx1 commands"
            
        val item_Xx11 = JMenuItem("Xx11")
            item_Xx11.toolTipText = "Xx11 application"
            item_Xx11.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Xxxxx_1.add(item_Xx11)

        val item_Xx12 = JMenuItem("Xx12")
            item_Xx12.toolTipText = "Xx12 application"
            item_Xx12.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Xxxxx_1.add(item_Xx12)

            lv.yu.kot.menubar_10.add(menu_Xxxxx_1)  

}  //  end KOT_xxxxx_menu_xxxxx_1_10()

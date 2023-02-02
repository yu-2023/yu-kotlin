
/**
 * 
 * Kotlin package     lv.yu.kot.xxxxx
 * 
 * Kotlin program     KOT_xxxxx_menu_xxxxx_2_09.kt     Apache License 2.0
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

fun KOT_xxxxx_menu_xxxxx_2_09() {

        val menu_Xxxxx_2 = JMenu("Xxxxx2")
            menu_Xxxxx_2.mnemonic = KeyEvent.VK_2  //  Alt 2
            menu_Xxxxx_2.toolTipText = "Xxxxx2 commands"
            
        val item_Xx21 = JMenuItem("Xx21")
            item_Xx21.toolTipText = "Xx21 application"
			item_Xx21.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Xxxxx_2.add(item_Xx21)

        val item_Xx22 = JMenuItem("Xx22")
            item_Xx22.toolTipText = "Xx22 application"
			item_Xx22.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Xxxxx_2.add(item_Xx22)

            lv.yu.kot.menubar_09.add(menu_Xxxxx_2)

}  //  end KOT_xxxxx_menu_xxxxx_2_09()


/**
 * 
 * Kotlin package     lv.yu.kot.load
 * 
 * Kotlin program     KOT_load_menu_load_2_09.kt       Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.load

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

fun KOT_load_menu_load_2_09() {

        val menu_Load_2 = JMenu("Load2")
            menu_Load_2.mnemonic = KeyEvent.VK_2  //  Alt 2
            menu_Load_2.toolTipText = "Load2 commands"
            
        val item_Lo21 = JMenuItem("Lo21")
            item_Lo21.toolTipText = "Lo21 application"
			item_Lo21.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Load_2.add(item_Lo21)

        val item_Lo22 = JMenuItem("Lo22")
            item_Lo22.toolTipText = "Lo22 application"
			item_Lo22.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Load_2.add(item_Lo22)

            lv.yu.kot.menubar_09.add(menu_Load_2)

}  //  end KOT_load_menu_load_2_09()

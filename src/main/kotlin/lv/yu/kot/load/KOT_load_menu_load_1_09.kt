
/**
 * 
 * Kotlin package     lv.yu.kot.load
 * 
 * Kotlin program     KOT_load_menu_load_1_09.kt     Apache License 2.0
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

fun KOT_load_menu_load_1_09() {

        val menu_Load_1 = JMenu("Load1")
            menu_Load_1.mnemonic = KeyEvent.VK_1  //  Alt 1
            menu_Load_1.toolTipText = "Load1 commands"
            
        val item_Lo11 = JMenuItem("Lo11")
            item_Lo11.toolTipText = "Lo11 application"
            item_Lo11.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Load_1.add(item_Lo11)

        val item_Lo12 = JMenuItem("Lo12")
            item_Lo12.toolTipText = "Lo12 application"
            item_Lo12.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Load_1.add(item_Lo12)

            lv.yu.kot.menubar_09.add(menu_Load_1)

}  //  end KOT_load_menu_load_1_09()


/**
 * 
 * Kotlin package     lv.yu.kot.load
 * 
 * Kotlin program     KOT_load_menu_load_3_10.kt       Apache License 2.0
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

fun KOT_load_menu_load_3_10() {

    	val menu_Load_3 = JMenu("Load3")
            menu_Load_3.mnemonic = KeyEvent.VK_3  //  Alt 3
            menu_Load_3.toolTipText = "Load3 commands"
            
        val item_Lo31 = JMenuItem("Lo31")
            item_Lo31.toolTipText = "Lo31 application"
            item_Lo31.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Load_3.add(item_Lo31)

        val item_Lo32 = JMenuItem("Lo32")
            item_Lo32.toolTipText = "Lo32 application"
            item_Lo32.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Load_3.add(item_Lo32)

            lv.yu.kot.menubar_10.add(menu_Load_3)

}  //  end KOT_load_menu_load_3_10()

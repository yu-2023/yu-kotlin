
/**
 * 
 * Kotlin package     lv.yu.kot.start
 * 
 * Kotlin program     KOT_start_menu_start_3_10.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

fun KOT_start_menu_start_3_10() {

        val menu_Start_3 = JMenu("Start3")
            menu_Start_3.mnemonic = KeyEvent.VK_3  //  Alt 3
            menu_Start_3.toolTipText = "Start3 commands"
            
        val item_St31 = JMenuItem("St31")
            item_St31.toolTipText = "St31 application"
			item_St31.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Start_3.add(item_St31)

        val item_St32 = JMenuItem("St32")
            item_St32.toolTipText = "St32 application"
			item_St32.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Start_3.add(item_St32)

            lv.yu.kot.menubar_10.add(menu_Start_3)    

}  //  end KOT_start_menu_start_3_10()

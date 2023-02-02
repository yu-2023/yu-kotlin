
/**
 * 
 * Kotlin package     lv.yu.kot.start
 * 
 * Kotlin program     KOT_start_menu_start_2_08.kt     Apache License 2.0
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

fun KOT_start_menu_start_2_09() {

        val menu_Start_2 = JMenu("Start2")
            menu_Start_2.mnemonic = KeyEvent.VK_2  //  Alt 2
            menu_Start_2.toolTipText = "Start2 commands"
            
        val item_St21 = JMenuItem("St21")
            item_St21.toolTipText = "St21 application"
			item_St21.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Start_2.add(item_St21)

        val item_St22 = JMenuItem("St22")
            item_St22.toolTipText = "St22 application"
			item_St22.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Start_2.add(item_St22)

            lv.yu.kot.menubar_09.add(menu_Start_2)       

}  //  end KOT_start_menu_start_2_09()

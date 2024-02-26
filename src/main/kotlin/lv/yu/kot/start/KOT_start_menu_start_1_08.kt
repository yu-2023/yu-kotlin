
/**
 *
 * Kotlin package     lv.yu.kot.start
 *
 * Kotlin program     KOT_start_menu_start_1_08.kt     Apache License 2.0
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

fun KOT_start_menu_start_1_08() {

        val menu_Start_1 = JMenu("Start1")
            menu_Start_1.mnemonic = KeyEvent.VK_1  //  Alt 1
            menu_Start_1.toolTipText = "Start1 commands"

        val item_St11 = JMenuItem("St11")
            item_St11.toolTipText = "St11 application"
            item_St11.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Start_1.add(item_St11)

        val item_St12 = JMenuItem("St12")
            item_St12.toolTipText = "St12 application"
            item_St12.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
            menu_Start_1.add(item_St12)

            lv.yu.kot.menubar_08.add(menu_Start_1)

}  //  end KOT_start_menu_start_1_08()

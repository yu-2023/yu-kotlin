
/**
 *
 * Kotlin package     lv.yu.kot.help
 *
 * Kotlin program     KOT_help_menu_help_10.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023              mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.help

import javax.swing.JMenu
import javax.swing.JMenuItem
import javax.swing.ImageIcon

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

fun KOT_help_menu_help_10() {

//------------------------------

    val icon_Information = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/information.gif"))
    val icon_Help        = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/help.png"))
    val icon_About       = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/about.gif"))

//------------------------------

    val menu_Help = JMenu("Help")
        menu_Help.mnemonic = KeyEvent.VK_H  //  Alt H
        menu_Help.toolTipText = "Help commands"
      val item_Information = JMenuItem("Information", icon_Information)
      val item_Help        = JMenuItem("Help", icon_Help)
      val item_About       = JMenuItem("About", icon_About)
          item_Information.toolTipText = "Information application"
          item_Help.toolTipText        = "Help application"
          item_About.toolTipText       = "About application"

//------------------------------

          item_Information.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_Help.addActionListener        { e: ActionEvent -> lv.yu.kot.help.KOT_help_visualize_10() }
          item_About.addActionListener       { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }

//------------------------------

          menu_Help.add(item_Information)
          menu_Help.add(item_Help)
          menu_Help.add(item_About)

          lv.yu.kot.menubar_10.add(menu_Help)

//------------------------------

}  //  end KOT_help_menu_help_10()


/**
 *
 * Kotlin package     lv.yu.kot.exit
 *
 * Kotlin program     KOT_exit_menu_exit_08.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023              mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.exit

import javax.swing.JMenu
import javax.swing.JMenuItem
import javax.swing.ImageIcon

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

fun KOT_exit_menu_exit_08() {

//------------------------------

    val icon_Exit = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/exit.png"))

//------------------------------

    val menu_Exit = JMenu("Exit")
        menu_Exit.mnemonic = KeyEvent.VK_E  //  Alt E
        menu_Exit.toolTipText = "Exit commands"
      val item_Exit = JMenuItem("Exit", icon_Exit)
          item_Exit.toolTipText = "Exit application"

//------------------------------

          item_Exit.addActionListener { _: ActionEvent -> System.exit(0) }

//------------------------------

        menu_Exit.add(item_Exit)

        lv.yu.kot.menubar_08.add(menu_Exit)

//------------------------------

}  //  end KOT_exit_menu_exit_08()

//------------------------------

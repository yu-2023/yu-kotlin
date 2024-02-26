
/**
 *
 * Kotlin package     lv.yu.kot.start
 *
 * Kotlin program     KOT_start_menu_10.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.start

import javax.swing.JMenuBar
import javax.swing.JMenu

import java.awt.event.KeyEvent

    public var menu_Menu_10 = JMenu()

fun KOT_start_menu_10() {

        lv.yu.kot.menubar_10 = JMenuBar()
        lv.yu.kot.menubar_10.setLayout( lv.yu.kot.JAV_LIB_wrap_layout(lv.yu.kot.JAV_LIB_wrap_layout.LEFT, 0, 0) )

            menu_Menu_10 = JMenu("Menu")
            menu_Menu_10.mnemonic = KeyEvent.VK_M  //  Alt M
            menu_Menu_10.toolTipText = "Menu commands"

            lv.yu.kot.menubar_10.add(menu_Menu_10)

}  //  end KOT_start_menu_10()

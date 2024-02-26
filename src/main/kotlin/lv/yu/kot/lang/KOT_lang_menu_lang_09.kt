
/**
 *
 * Kotlin package     lv.yu.kot.lang
 *
 * Kotlin program     KOT_lang_menu_lang_09.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023              mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot.lang

import javax.swing.JMenu
import javax.swing.JMenuItem
import javax.swing.ImageIcon
import javax.swing.JCheckBoxMenuItem

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

fun KOT_lang_menu_lang_09() {

//------------------------------

    val icon_Eng = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/prefs.gif"))
    val icon_Rus = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/prefs.gif"))
    val icon_Lat = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/prefs.gif"))

//------------------------------

    val menu_Lang = JMenu("Lang")
        menu_Lang.mnemonic = KeyEvent.VK_L  //  Alt L
        menu_Lang.toolTipText = "Lang commands"
      val item_Eng = JCheckBoxMenuItem("Eng", icon_Eng)
      val item_Rus = JCheckBoxMenuItem("Rus", icon_Rus)
      val item_Lat = JCheckBoxMenuItem("Lat", icon_Lat)
          item_Eng.toolTipText = "Eng application"
          item_Rus.toolTipText = "Rus application"
          item_Lat.toolTipText = "Lat application"
          item_Eng.setSelected(true)

//------------------------------

          item_Eng.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_Rus.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_Lat.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }

//------------------------------

        menu_Lang.add(item_Eng)
        menu_Lang.add(item_Rus)
        menu_Lang.add(item_Lat)

        lv.yu.kot.menubar_09.add(menu_Lang)

//------------------------------

}  //  end KOT_lang_menu_lang_09()

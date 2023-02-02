
/**
 * 
 * Kotlin package     lv.yu.kot.xxxxx.xxxxx_21
 * 
 * Kotlin program     KOT_xxxxx_21_about_10.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023             mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.xxxxx.xxxxx_21

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

fun KOT_xxxxx_21_about_10() {
	
    val imageicon = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/info.gif"))
                                
    val jtextarea = JTextArea()
        jtextarea.setText("KOT_xxxxx_21_about_10_JTextArea")

        lv.yu.kot.xxxxx.xxxxx_21.JTabbedPane_xxxxx_10_21.addTab("about", imageicon, jtextarea, "Load about JTextArea")
        lv.yu.kot.xxxxx.xxxxx_21.JTabbedPane_xxxxx_10_21.setMnemonicAt(0, KeyEvent.VK_A)  //  Alt A

}  //  end KOT_xxxxx_21_about_10()

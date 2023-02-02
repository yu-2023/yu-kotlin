
/**
 * 
 * Kotlin package     lv.yu.kot.load.load_22
 * 
 * Kotlin program     KOT_load_22_help_10.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023             mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.load.load_22

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

fun KOT_load_22_help_10() {
	
    val imageicon = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/info.gif"))
                                
    val jtextarea = JTextArea()
        jtextarea.setText("KOT_load_22_help_10_JTextArea")
                                            	
        lv.yu.kot.load.load_22.JTabbedPane_load_10_22.addTab("help", imageicon, jtextarea, "Load help JTextArea")
        lv.yu.kot.load.load_22.JTabbedPane_load_10_22.setMnemonicAt(1, KeyEvent.VK_H)  //  Alt H

}  //  end KOT_load_22_help_10()

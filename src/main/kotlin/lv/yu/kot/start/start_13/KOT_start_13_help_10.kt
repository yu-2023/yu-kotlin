
/**
 * 
 * Kotlin package     lv.yu.kot.start.start_13
 * 
 * Kotlin program     KOT_start_13_help_10.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023             mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start.start_13

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

fun KOT_start_13_help_10() {
	
    val imageicon = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/info.gif"))
                                
    val jtextarea = JTextArea()
        jtextarea.setText("KOT_start_13_help_10_JTextArea")
                                            	
        lv.yu.kot.start.start_13.JTabbedPane_start_10_13.addTab("help", imageicon, jtextarea, "Load help JTextArea")
        lv.yu.kot.start.start_13.JTabbedPane_start_10_13.setMnemonicAt(1, KeyEvent.VK_H)  //  Alt H
               
}  //  end KOT_start_13_help_10()

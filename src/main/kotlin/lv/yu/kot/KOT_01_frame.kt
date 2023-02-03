
/**
 * 
 * Kotlin package     lv.yu.kot
 * 
 * Kotlin program     KOT_01_frame.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot

import javax.swing.JFrame
import javax.swing.ImageIcon

import java.awt.BorderLayout
import java.awt.EventQueue

//------------------------------

    /** frame */
    public var frame_01 = JFrame()

//------------------------------

fun KOT_01_frame() {  //  KOT_01_frame demonstrates Kotlin Frame

    val imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")  
    val icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------

    val title = "KOTLIN -- KOT_01_frame -- v. 2023.01.01"
    
        frame_01.setTitle("     " + title)
	    
        frame_01.setBounds(10+0*40+150, 10+0*40, 1000, 600)
        
        frame_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        
        frame_01.setIconImage(icon_frame.getImage())
        
        frame_01.setLayout(BorderLayout())
	
        frame_01.isVisible = true
	    
//------------------------------

        lv.yu.kot.KOT_02_text()
        lv.yu.kot.KOT_03_menu()
        lv.yu.kot.KOT_04_menu_wrap()
        lv.yu.kot.KOT_05_action()
        lv.yu.kot.KOT_06_internal_frame_one()
        lv.yu.kot.KOT_07_internal_frame_six()
        lv.yu.kot.KOT_08_internal_frames()
        lv.yu.kot.KOT_09_internal_frames_change()
        lv.yu.kot.KOT_10_tabs()

//------------------------------
	    
}  //  end KOT_01_frame()

//------------------------------

fun main() {
                  EventQueue.invokeLater(::KOT_01_frame)
}  //  end main()

//------------------------------

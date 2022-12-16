
/**
 * 
 * Kotlin package     lv.yu.kot
 * 
 * Kotlin program     KOT_01_frame.kt     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot

import javax.swing.JFrame
import javax.swing.ImageIcon
import java.awt.EventQueue

//------------------------------

fun KOT_01_frame() {

    var imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")  
    var icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------

    var title = "JAGO kotlin -- KOT_01_frame -- v. 2023.01.01"

    val frame = JFrame()
    
	    frame.setTitle("     " + title)
	    
        frame.setBounds(10+0*40+150, 10+0*40, 1000, 600)
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        
        frame.setIconImage(icon_frame.getImage())
        
//------------------------------
	
	    frame.isVisible = true
	    
//------------------------------
	    
}  //  end KOT_01_frame()

//------------------------------

fun main() {
	             EventQueue.invokeLater(::KOT_01_frame)
}  //  end main()

//------------------------------


/**
 * 
 * Kotlin package     lv.yu.kot
 * 
 * Kotlin program     KOT_09_internal_frames_change.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                      mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JPanel
import javax.swing.JDesktopPane
import javax.swing.JLabel
import javax.swing.JMenuBar

import java.awt.Color
import java.awt.Dimension
import java.awt.BorderLayout
import java.awt.EventQueue

//------------------------------

    /** frame */
    public var frame_09 = JFrame()

    /** manubar */
    public var menubar_09 = JMenuBar()

    /** panel_1 */    
    public var panel_09_1 = JPanel()

    /** panel_2 */
    public var panel_09_2 = JPanel()

    /** panel_3 */
    public var panel_09_3 = JPanel()

    /** label_info */
    public var label_info_09 = JLabel()

    /** desktoppane_11 */
    public var desktoppane_09_11 = JDesktopPane()
 
    /** desktoppane_12 */
    public var desktoppane_09_12 = JDesktopPane()

    /** desktoppane_13 */
    public var desktoppane_09_13 = JDesktopPane()

    /** desktoppane_21 */
    public var desktoppane_09_21 = JDesktopPane()

    /** desktoppane_22 */
    public var desktoppane_09_22 = JDesktopPane()

    /** desktoppane_23 */
    public var desktoppane_09_23 = JDesktopPane()

//------------------------------
    
fun KOT_09_internal_frames_change() {

    var imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")  
    var icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------
    	
    var title = "KOTLIN -- KOT_09_internal_frames_change -- v. 2023.01.01"

        frame_09.setTitle("     " + title)
        
        frame_09.setBounds(10+8*40+150, 10+8*40, 1000, 600)
         
        frame_09.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
          
        frame_09.setIconImage(icon_frame.getImage())

        frame_09.setLayout(BorderLayout())
        
        frame_09.isVisible = true

//------------------------------        
   
        frame_09.jMenuBar = menubar_09
		  
//------------------------------ 

        panel_09_1.setLayout(BorderLayout())
        panel_09_1.setBackground(Color.CYAN)
            
        panel_09_2.setLayout(BorderLayout())
        panel_09_2.setBackground(Color.MAGENTA)

        panel_09_3.setLayout(BorderLayout())
        panel_09_3.setBackground(Color.lightGray)

        label_info_09.setText("     Copyright     (c)     Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv")
        label_info_09.setForeground(Color.BLACK)
            
        panel_09_3.add(label_info_09, BorderLayout.CENTER)

        frame_09.getContentPane().add(panel_09_1, BorderLayout.NORTH)
        frame_09.getContentPane().add(panel_09_2, BorderLayout.CENTER)
        frame_09.getContentPane().add(panel_09_3, BorderLayout.SOUTH)
                          
//------------------------------
        
        desktoppane_09_11.setLayout(BorderLayout())
        desktoppane_09_11.setBackground(Color.RED)
        desktoppane_09_11.setPreferredSize(Dimension(200, 350))

        desktoppane_09_12.setLayout(BorderLayout())
        desktoppane_09_12.setBackground(Color.PINK)
        desktoppane_09_12.setPreferredSize(Dimension(600, 350))

        desktoppane_09_13.setLayout(BorderLayout())
        desktoppane_09_13.setBackground(Color.YELLOW)
        desktoppane_09_13.setPreferredSize(Dimension(200, 350))   

        desktoppane_09_21.setLayout(BorderLayout())
        desktoppane_09_21.setBackground(Color.BLUE)
        desktoppane_09_21.setPreferredSize(Dimension(200, 150))    
        	
        desktoppane_09_22.setLayout(BorderLayout())
        desktoppane_09_22.setBackground(Color.CYAN)
        desktoppane_09_22.setPreferredSize(Dimension(600, 150))     

        desktoppane_09_23.setLayout(BorderLayout())
        desktoppane_09_23.setBackground(Color.GREEN)
        desktoppane_09_23.setPreferredSize(Dimension(200, 150))               	
            
//--------------------------------------------------
        	
        lv.yu.kot.start.KOT_start_visualize_09()
           
//------------------------------         

        frame_09.isVisible = true
        
//------------------------------ 

}  //  end KOT_09_internal_frames_change()
    
//------------------------------    

fun main() {
                  EventQueue.invokeLater(::KOT_09_internal_frames_change)
}  //  end main()

//------------------------------ 

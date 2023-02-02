
/**
 * 
 * Kotlin package     lv.yu.kot
 * 
 * Kotlin program     KOT_08_internal_frames.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023               mob.+371 12345678     https://www.jago.lv
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
    public var frame_08 = JFrame()
 
    /** manubar */
    public var menubar_08 = JMenuBar()
  
    /** panel_1 */    
    public var panel_08_1 = JPanel()
   
    /** panel_2 */
    public var panel_08_2 = JPanel()
   
    /** panel_3 */
    public var panel_08_3 = JPanel()

    /** label_info */
    public var label_info_08 = JLabel()
   
    /** desktoppane_11 */
    public var desktoppane_08_11 = JDesktopPane()
  
    /** desktoppane_12 */
    public var desktoppane_08_12 = JDesktopPane()
   
    /** desktoppane_13 */
    public var desktoppane_08_13 = JDesktopPane()
   
    /** desktoppane_21 */
    public var desktoppane_08_21 = JDesktopPane()
   
    /** desktoppane_22 */
    public var desktoppane_08_22 = JDesktopPane()
   
    /** desktoppane_23 */
    public var desktoppane_08_23 = JDesktopPane()

//------------------------------
    
fun KOT_08_internal_frames() {

    val imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")  
    val icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------
    	
    val title = "KOTLIN -- KOT_08_internal_frames -- v. 2023.01.01"
            
        frame_08.setTitle("     " + title)
        
        frame_08.setBounds(10+7*40, 10+7*40, 1000, 600)
         
        frame_08.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
          
        frame_08.setIconImage(icon_frame.getImage())
        
        frame_08.setLayout(BorderLayout())
        
        frame_08.isVisible = true

//------------------------------
    
        frame_08.jMenuBar = menubar_08

//------------------------------ 

        panel_08_1.setLayout(BorderLayout())
        panel_08_1.setBackground(Color.CYAN)
            
        panel_08_2.setLayout(BorderLayout())
        panel_08_2.setBackground(Color.MAGENTA)

        panel_08_3.setLayout(BorderLayout())
        panel_08_3.setBackground(Color.lightGray)
            
        label_info_08.setText("     Copyright     (c)     Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv")
        label_info_08.setForeground(Color.BLACK)
            
        panel_08_3.add(label_info_08, BorderLayout.CENTER)

        frame_08.getContentPane().add(panel_08_1, BorderLayout.NORTH)
        frame_08.getContentPane().add(panel_08_2, BorderLayout.CENTER)
        frame_08.getContentPane().add(panel_08_3, BorderLayout.SOUTH)

//------------------------------
        
        desktoppane_08_11.setLayout(BorderLayout())
        desktoppane_08_11.setBackground(Color.RED)
        desktoppane_08_11.setPreferredSize(Dimension(200, 350))

        desktoppane_08_12.setLayout(BorderLayout())
        desktoppane_08_12.setBackground(Color.PINK)
        desktoppane_08_12.setPreferredSize(Dimension(600, 350))

        desktoppane_08_13.setLayout(BorderLayout())
        desktoppane_08_13.setBackground(Color.YELLOW)
        desktoppane_08_13.setPreferredSize(Dimension(200, 350))     

        desktoppane_08_21.setLayout(BorderLayout())
        desktoppane_08_21.setBackground(Color.BLUE)
        desktoppane_08_21.setPreferredSize(Dimension(200, 150))    

        desktoppane_08_22.setLayout(BorderLayout())
        desktoppane_08_22.setBackground(Color.CYAN)
        desktoppane_08_22.setPreferredSize(Dimension(600, 150))       

        desktoppane_08_23.setLayout(BorderLayout())
        desktoppane_08_23.setBackground(Color.GREEN)
        desktoppane_08_23.setPreferredSize(Dimension(200, 150))                	
            
//--------------------------------------------------
        	
        lv.yu.kot.start.KOT_start_visualize_08()
           
//------------------------------         

        frame_08.isVisible = true
        
//------------------------------ 

}  //  end KOT_08_internal_frames()

//------------------------------    
    
fun main() {
                  EventQueue.invokeLater(::KOT_08_internal_frames)
}  //  end main()

//------------------------------ 

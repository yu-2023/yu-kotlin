
/**
 * 
 * Kotlin package     lv.yu.kot
 * 
 * Kotlin program     KOT_10_tabs.kt      Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv
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
    public var frame_10 = JFrame()

    /** manubar */
    public var menubar_10 = JMenuBar()

    /** panel_1 */    
    public var panel_10_1 = JPanel()

    /** panel_2 */
    public var panel_10_2 = JPanel()

    /** panel_3 */
    public var panel_10_3 = JPanel()

    /** label_info */
    public var label_info_10 = JLabel()

    /** desktoppane_11 */
    public var desktoppane_10_11 = JDesktopPane()

    /** desktoppane_12 */
    public var desktoppane_10_12 = JDesktopPane()

    /** desktoppane_13 */
    public var desktoppane_10_13 = JDesktopPane()

    /** desktoppane_21 */
    public var desktoppane_10_21 = JDesktopPane()

    /** desktoppane_22 */
    public var desktoppane_10_22 = JDesktopPane()

    /** desktoppane_23 */
    public var desktoppane_10_23 = JDesktopPane()

//------------------------------

fun KOT_10_tabs() {

    var imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")  
    var icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------            
    	
    var title = "KOTLIN -- KOT_10_tabs -- v. 2023.01.01"
            
        frame_10.setTitle("     " + title)
        
        frame_10.setBounds(10+9*40, 10+9*40, 1000, 600)
         
        frame_10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
          
        frame_10.setIconImage(icon_frame.getImage())

        frame_10.setLayout(BorderLayout())
        
        frame_10.isVisible = true

//------------------------------        
        
        frame_10.jMenuBar = menubar_10
		   
//------------------------------ 

        panel_10_1.setLayout(BorderLayout())
        panel_10_1.setBackground(Color.CYAN)
            
        panel_10_2.setLayout(BorderLayout())
        panel_10_2.setBackground(Color.MAGENTA)

        panel_10_3.setLayout(BorderLayout())
        panel_10_3.setBackground(Color.lightGray)

        label_info_10.setText("     Copyright     (c)     Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv")
        label_info_10.setForeground(Color.BLACK)
            
        panel_10_3.add(label_info_10, BorderLayout.CENTER)

        frame_10.getContentPane().add(panel_10_1, BorderLayout.NORTH)
        frame_10.getContentPane().add(panel_10_2, BorderLayout.CENTER)
        frame_10.getContentPane().add(panel_10_3, BorderLayout.SOUTH)
                          
//------------------------------
        
        desktoppane_10_11.setLayout(BorderLayout())
        desktoppane_10_11.setBackground(Color.RED)
        desktoppane_10_11.setPreferredSize(Dimension(200, 350))

        desktoppane_10_12.setLayout(BorderLayout())
        desktoppane_10_12.setBackground(Color.PINK)
        desktoppane_10_12.setPreferredSize(Dimension(600, 350))

        desktoppane_10_13.setLayout(BorderLayout())
        desktoppane_10_13.setBackground(Color.YELLOW)
        desktoppane_10_13.setPreferredSize(Dimension(200, 350))   

        desktoppane_10_21.setLayout(BorderLayout())
        desktoppane_10_21.setBackground(Color.BLUE)
        desktoppane_10_21.setPreferredSize(Dimension(200, 150))  
        	
        desktoppane_10_22.setLayout(BorderLayout())
        desktoppane_10_22.setBackground(Color.CYAN)
        desktoppane_10_22.setPreferredSize(Dimension(600, 150))    

        desktoppane_10_23.setLayout(BorderLayout())
        desktoppane_10_23.setBackground(Color.GREEN)
        desktoppane_10_23.setPreferredSize(Dimension(200, 150))                	
            
//--------------------------------------------------
        	
        lv.yu.kot.start.KOT_start_visualize_10()
           
//------------------------------         

        frame_10.isVisible = true
        
//------------------------------ 

}  //  end KOT_10_tabs()
    
//------------------------------    

fun main() {
                  EventQueue.invokeLater(::KOT_10_tabs)
}  //  end main()

//------------------------------ 

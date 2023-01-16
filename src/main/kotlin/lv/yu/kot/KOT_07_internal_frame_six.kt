
/**
 * 
 * Kotlin package     lv.yu.kot
 * 
 * Kotlin program     KOT_07_internal_frame_six.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JInternalFrame
import javax.swing.JPanel
import javax.swing.JDesktopPane
import javax.swing.JLabel
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem
import javax.swing.JCheckBoxMenuItem
import javax.swing.KeyStroke

import java.awt.Toolkit
import java.awt.Color
import java.awt.Dimension
import java.awt.BorderLayout
import java.awt.EventQueue

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
	
//------------------------------

fun KOT_07_internal_frame_six() { 

    var imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")  
    var icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------

    var title = "KOTLIN -- KOT_07_internal_frame_six -- v. 2023.01.01"
    
    val frame = JFrame()

        frame.setTitle("     " + title)
        
        frame.setBounds(10+6*40+150, 10+6*40, 1000, 600)
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        
        frame.setIconImage(icon_frame.getImage())
        
        frame.setLayout(BorderLayout())
        
        frame.isVisible = true
        
//------------------------------        
        
    val icon_Start       = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/start.gif"))
    val icon_Load        = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/load.gif"))    
    val icon_Xxxx        = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/xxxx.png"))    
    val icon_Information = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/information.gif"))    
    val icon_Help        = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/help.png"))    
    val icon_About       = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/about.gif"))    
    val icon_Eng         = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/prefs.gif"))    
    val icon_Rus         = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/prefs.gif"))    
    val icon_Lat         = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/prefs.gif"))    
    val icon_Exit        = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/exit.png"))
        
//------------------------------
    
    val menubar = JMenuBar()
        
    val menu_Menu = JMenu("Menu")
      val item_Start = JMenuItem("Start", icon_Start)
      val item_Load  = JMenuItem("Load", icon_Load)
      val item_Xxxx  = JMenuItem("Xxxx", icon_Xxxx)

    val menu_Start1 = JMenu("Start1") 	      
      val item_St11 = JMenuItem("St11")
      val item_St12 = JMenuItem("St12")
     
    val menu_Start2 = JMenu("Start2")   
      val item_St21 = JMenuItem("St21")
      val item_St22 = JMenuItem("St22")

    val menu_Start3 = JMenu("Start3")         
      val item_St31 = JMenuItem("St31")
      val item_St32 = JMenuItem("St32")

    val menu_Help = JMenu("Help")       
      val item_Information = JMenuItem("Information", icon_Information)
      val item_Help        = JMenuItem("Help", icon_Help)
      val item_About       = JMenuItem("About", icon_About)
      
    val menu_Lang = JMenu("Lang")   
      val item_Eng = JCheckBoxMenuItem("Eng", icon_Eng)
      val item_Rus = JCheckBoxMenuItem("Rus", icon_Rus)
      val item_Lat = JCheckBoxMenuItem("Lat", icon_Lat)

    val menu_Exit = JMenu("Exit")
      val item_Exit = JMenuItem("Exit", icon_Exit)
    	      
//------------------------------
      
        menu_Menu.mnemonic = KeyEvent.VK_M  //  Alt M
        menu_Menu.toolTipText = "Menu commands"    
          item_Start.toolTipText = "Start application"
          item_Load.toolTipText  = "Load application"
          item_Xxxx.toolTipText = "Xxxx application"          
          item_Start.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK))  //  Alt S
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK))   //  Alt L
          item_Xxxx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK))   //  Alt X  
       
        menu_Start1.mnemonic = KeyEvent.VK_1  //  Alt 1
        menu_Start1.toolTipText = "Start1 commands" 
          item_St11.toolTipText = "St11 application"
          item_St12.toolTipText = "St12 application"

        menu_Start2.mnemonic = KeyEvent.VK_2  //  Alt 2
        menu_Start2.toolTipText = "Start2 commands"   
          item_St21.toolTipText = "St21 application"
          item_St22.toolTipText = "St22 application"
            
        menu_Start3.mnemonic = KeyEvent.VK_3  //  Alt 3
        menu_Start3.toolTipText = "Start3 commands" 
          item_St31.toolTipText = "St31 application"
          item_St32.toolTipText = "St32 application"
            
        menu_Help.mnemonic = KeyEvent.VK_H  //  Alt H
        menu_Help.toolTipText = "Help commands"    
          item_Information.toolTipText = "Information application"
          item_Help.toolTipText        = "Help application"
          item_About.toolTipText       = "About application"
     
        menu_Lang.mnemonic = KeyEvent.VK_L  //  Alt L
        menu_Lang.toolTipText = "Lang commands"                        
          item_Eng.toolTipText = "Eng application"
          item_Rus.toolTipText = "Rus application"
          item_Lat.toolTipText = "Lat application"   
          item_Eng.setSelected(true)

        menu_Exit.mnemonic = KeyEvent.VK_E  //  Alt E
        menu_Exit.toolTipText = "Exit commands"               
          item_Exit.toolTipText = "Exit application"
    
//------------------------------          
          
          item_Start.addActionListener       { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_Load.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_Xxxx.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_St11.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_St12.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_St21.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_St22.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_St31.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_St32.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_Eng.addActionListener         { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_Rus.addActionListener         { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_Lat.addActionListener         { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_Information.addActionListener { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_Help.addActionListener        { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
          item_About.addActionListener       { e: ActionEvent -> System.out.println("Selected menu: " + e.getActionCommand()) }
      	  item_Exit.addActionListener        { _: ActionEvent -> System.exit(0) }
        
//------------------------------         
        
        menu_Menu.add(item_Start)
        menu_Menu.add(item_Load)
        menu_Menu.add(item_Xxxx)

        menu_Start1.add(item_St11)
        menu_Start1.add(item_St12)

        menu_Start2.add(item_St21)
        menu_Start2.add(item_St22)
            
        menu_Start3.add(item_St31)
        menu_Start3.add(item_St32)
            
        menu_Help.add(item_Information)
        menu_Help.add(item_Help)
        menu_Help.add(item_About)

        menu_Lang.add(item_Eng)
        menu_Lang.add(item_Rus)
        menu_Lang.add(item_Lat)
        
        menu_Exit.add(item_Exit)
            
        menubar.add(menu_Menu)
        menubar.add(menu_Start1)
        menubar.add(menu_Start2)
        menubar.add(menu_Start3)
        menubar.add(menu_Help)
        menubar.add(menu_Lang)
        menubar.add(menu_Exit)
        
    	menubar.setLayout( JAV_LIB_wrap_layout (JAV_LIB_wrap_layout.LEFT, 0, 0) )

        frame.jMenuBar = menubar

//------------------------------

    val panel_1 = JPanel()
        panel_1.setLayout(BorderLayout())
        panel_1.setBackground(Color.CYAN)
        
    val panel_2 = JPanel()        
        panel_2.setLayout(BorderLayout())
        panel_2.setBackground(Color.MAGENTA)

    val panel_3 = JPanel()
        panel_3.setLayout(BorderLayout())
        panel_3.setBackground(Color.lightGray)
        
    val label_info = JLabel()
        label_info.setText("     Copyright     (c)     Yuri Utkin 2022     mob.+371 12345678     https://www.jago.lv")
        label_info.setForeground(Color.BLACK)
        
        panel_3.add(label_info, BorderLayout.CENTER)

        frame.getContentPane().add(panel_1, BorderLayout.NORTH)
        frame.getContentPane().add(panel_2, BorderLayout.CENTER)
        frame.getContentPane().add(panel_3, BorderLayout.SOUTH)
        
    val desktoppane_11 = JDesktopPane()
        desktoppane_11.setLayout(BorderLayout())
        desktoppane_11.setBackground(Color.RED)
        desktoppane_11.setPreferredSize(Dimension(200, 350))

    val desktoppane_12 = JDesktopPane()
        desktoppane_12.setLayout(BorderLayout())
        desktoppane_12.setBackground(Color.PINK)
        desktoppane_12.setPreferredSize(Dimension(600, 350))

    val desktoppane_13 = JDesktopPane()
        desktoppane_13.setLayout(BorderLayout())
        desktoppane_13.setBackground(Color.YELLOW)
        desktoppane_13.setPreferredSize(Dimension(200, 350))    

    val desktoppane_21 = JDesktopPane()
        desktoppane_21.setLayout(BorderLayout())
        desktoppane_21.setBackground(Color.BLUE)
        desktoppane_21.setPreferredSize(Dimension(200, 150))    
    	
    val desktoppane_22 = JDesktopPane()
        desktoppane_22.setLayout(BorderLayout())
        desktoppane_22.setBackground(Color.CYAN)
        desktoppane_22.setPreferredSize(Dimension(600, 150))      

    val desktoppane_23 = JDesktopPane()
        desktoppane_23.setLayout(BorderLayout())
        desktoppane_23.setBackground(Color.GREEN)
        desktoppane_23.setPreferredSize(Dimension(200, 150))                	

//------------------------------

    val internalframe_start_11 = JInternalFrame("11 START", true, false, true, true)
        internalframe_start_11.setLayout(BorderLayout())
        internalframe_start_11.setBackground(Color.GRAY)
        internalframe_start_11.isVisible = true
        
    val internalframe_start_12 = JInternalFrame("12 START START START", true, false, true, true)
        internalframe_start_12.setLayout(BorderLayout())
        internalframe_start_12.setBackground(Color.GRAY)
        internalframe_start_12.isVisible = true
  
    val internalframe_start_13 = JInternalFrame("13 START", true, false, true, true)
        internalframe_start_13.setLayout(BorderLayout())
        internalframe_start_13.setBackground(Color.GRAY)
        internalframe_start_13.isVisible = true

    val internalframe_start_21 = JInternalFrame("21 START", true, false, true, true)
        internalframe_start_21.setLayout(BorderLayout())
        internalframe_start_21.setBackground(Color.GRAY)
        internalframe_start_21.isVisible = true

    val internalframe_start_22 = JInternalFrame("22 START START START", true, false, true, true)
        internalframe_start_22.setLayout(BorderLayout())
        internalframe_start_22.setBackground(Color.GRAY)
        internalframe_start_22.isVisible = true

    val internalframe_start_23 = JInternalFrame("23 START", true, false, true, true)
        internalframe_start_23.setLayout(BorderLayout())
        internalframe_start_23.setBackground(Color.GRAY)
        internalframe_start_23.isVisible = true

//------------------------------

        desktoppane_11.add(internalframe_start_11, BorderLayout.CENTER)
        desktoppane_12.add(internalframe_start_12, BorderLayout.CENTER)
        desktoppane_13.add(internalframe_start_13, BorderLayout.CENTER)
        desktoppane_21.add(internalframe_start_21, BorderLayout.CENTER)
        desktoppane_22.add(internalframe_start_22, BorderLayout.CENTER)
        desktoppane_23.add(internalframe_start_23, BorderLayout.CENTER)
           
        panel_1.add(desktoppane_11, BorderLayout.WEST)
        panel_1.add(desktoppane_12, BorderLayout.CENTER)
        panel_1.add(desktoppane_13, BorderLayout.EAST)
        panel_2.add(desktoppane_21, BorderLayout.WEST)
        panel_2.add(desktoppane_22, BorderLayout.CENTER)
        panel_2.add(desktoppane_23, BorderLayout.EAST)

//------------------------------
        
        frame.isVisible = true
        
//------------------------------ 
        
}  //  end KOT_07_internal_frame_six()

//------------------------------    

fun main() {
                  EventQueue.invokeLater(::KOT_07_internal_frame_six)
}  //  end main()

//------------------------------ 

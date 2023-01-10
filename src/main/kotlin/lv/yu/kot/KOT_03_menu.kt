
/**
 * 
 * Kotlin package     lv.yu.kot
 * 
 * Kotlin program     KOT_03_menu.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023    mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JScrollPane
import javax.swing.JTextArea
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem
import javax.swing.JCheckBoxMenuItem
import javax.swing.KeyStroke

import java.awt.BorderLayout
import java.awt.EventQueue

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent

//------------------------------

fun KOT_03_menu() {
	
    var imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")  
    var icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------	

    var title = "KOTLIN -- KOT_03_menu -- v. 2023.01.01"

    val frame = JFrame()
    
        frame.setTitle("     " + title)
    
        frame.setBounds(10+2*40+150, 10+2*40, 1000, 600)
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        
        frame.setIconImage(icon_frame.getImage())
        
        frame.isVisible = true

//------------------------------

    val icon_Start       = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/start.gif"))
    val icon_Load        = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/load.gif"))
    val icon_Xxxxx       = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/xxxx.png"))
    val icon_Information = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/information.gif"))
    val icon_Help        = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/help.png"))
    val icon_About       = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/about.gif"))
    val icon_Eng         = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/prefs.gif"))
    val icon_Rus         = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/prefs.gif"))
    val icon_Lat         = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/prefs.gif"))
    val icon_Exit        = ImageIcon(Thread.currentThread().contextClassLoader.getResource("lv/yu/kot/KOT_resources/exit.png"))
        
//------------------------------
        
    val menubar = JMenuBar()

    val menu_Menu = JMenu("Menu")
      val item_Start = JMenuItem("Start", icon_Start)
      val item_Load  = JMenuItem("Loads", icon_Load)        
      val item_Xxxxx = JMenuItem("Xxxxx", icon_Xxxxx)
	  
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
          item_Xxxxx.toolTipText = "Xxxxx application"
          item_Start.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK))  //  Alt S
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK))   //  Alt L
          item_Xxxxx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK))  //  Alt X

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

        menu_Menu.add(item_Start)
        menu_Menu.add(item_Load)
        menu_Menu.add(item_Xxxxx)
	
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
        
        frame.jMenuBar = menubar

//------------------------------

    val textarea = JTextArea()
    val scrollpane = JScrollPane(textarea)
    	    
        textarea.setText("" +
"        \r\n" +
"        💞️💞️ EN\r\n" +
"        \r\n" +
"        Comparative analysis of programming in Java, Kotlin and Clojure.\r\n" +
"        \r\n" +
"        How to Program Java, Kotlin, and Clojure Simultaneously.\r\n" +
"        \r\n" +
"        Integration of Java, Kotlin and Clojure in one software product.\r\n" +
"        \r\n" +
"        \r\n" +      
"        \r\n" +      
"        👋👋 RU\r\n" +
"        \r\n" +
"        Сравнительный анализ программирование на Java, Kotlin и Clojure.\r\n" +
"        \r\n" +
"        Как программировать одновременно на Java, Kotlin и Clojure.\r\n" +
"        \r\n" +
"        Интеграция Java, Kotlin и Clojure в одном программном продукте.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +      
"        🌱🌱 LV\r\n" +
"        \r\n" +
"        Java, Kotlin un Clojure programmēšanas salīdzinošā analīze.\r\n" +
"        \r\n" +
"        Kā programmēt Java, Kotlin un Clojure vienlaicīgi.\r\n" +
"        \r\n" +
"        Java, Kotlin un Clojure integrācija vienā programmatūras produktā.\r\n" +
"        \r\n" +
        		         "")

	    frame.getContentPane().add(scrollpane, BorderLayout.CENTER)

	    frame.isVisible = true

//------------------------------
	    
}  //  end KOT_03_menu()

//------------------------------

fun main() {
	         EventQueue.invokeLater(::KOT_03_menu)
}

//------------------------------

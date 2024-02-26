
/**
 *
 * Kotlin package     lv.yu.kot
 *
 * Kotlin program     KOT_02_text.kt     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023    mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.kot

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JScrollPane
import javax.swing.JTextArea

import java.awt.BorderLayout

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

    /** frame */
    public var frame_02 = JFrame()

//------------------------------

/** KOT_02_text demonstrates Kotlin Text in Kotlin Frame */
fun KOT_02_text() {

    val imgURL     =           Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg")
    val icon_frame = ImageIcon(Thread.currentThread().getContextClassLoader().getResource("lv/yu/kot/KOT_resources/KOT.jpg"))

//------------------------------

    val title = "KOTLIN -- KOT_02_text -- v. 2023.12.12"

        frame_02.setTitle("     " + title)

        frame_02.setBounds(10+1*40+150, 10+1*40, 1000, 600)

        frame_02.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

        frame_02.setIconImage(icon_frame.getImage())

        frame_02.setLayout(BorderLayout())

        frame_02.isVisible = true

//------------------------------

    val textarea   = JTextArea()
    val scrollpane = JScrollPane(textarea)

        textarea.setText("" +
"        \r\n" +
"        💞️💞️ EN\r\n" +
"        \r\n" +
"        Comparative analysis of programming in Java, Kotlin, Clojure, Groovy, Scala and Jython.\r\n" +
"        \r\n" +
"        How to Program Java, Kotlin, Clojure, Groovy, Scala and Jython Simultaneously.\r\n" +
"        \r\n" +
"        Integration of Java, Kotlin, Clojure, Groovy, Scala and Jython in one software product.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        👋👋 RU\r\n" +
"        \r\n" +
"        Сравнительный анализ программирование на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Как программировать одновременно на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Интеграция Java, Kotlin, Clojure, Groovy, Scala и Jython в одном программном продукте.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        🌱🌱 LV\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython programmēšanas salīdzinošā analīze.\r\n" +
"        \r\n" +
"        Kā programmēt Java, Kotlin, Clojure, Groovy, Scala un Jython vienlaicīgi.\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython integrācija vienā programmatūras produktā.\r\n" +
"        \r\n" +
                         "")

        frame_02.getContentPane().add(scrollpane, BorderLayout.CENTER)

        frame_02.isVisible = true

//------------------------------

}  //  end KOT_02_text()

//------------------------------

fun main() {
             SwingUtilities.invokeLater(::KOT_02_text)
}  //  end main()

//------------------------------

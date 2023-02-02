
/**
 * 
 * Kotlin package     lv.yu.kot.start
 * 
 * Kotlin program     KOT_start_visualize_09.kt     Apache License 2.0
 *      
 * Copyright (c)      Yuri Utkin 2023               mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.kot.start

import java.awt.BorderLayout

fun KOT_start_visualize_09() {

//--------------------------------------------------    	
    	
        lv.yu.kot.start.KOT_start_09()
		     		
//--------------------------------------------------        
    
        lv.yu.kot.desktoppane_09_11.removeAll()
    
        lv.yu.kot.start.start_11.KOT_start_11_09()
    		                
        lv.yu.kot.desktoppane_09_11.add(lv.yu.kot.start.start_11.JInternalFrame_start_09_11, BorderLayout.CENTER)
                   
        lv.yu.kot.panel_09_1.add(lv.yu.kot.desktoppane_09_11, BorderLayout.WEST)

//--------------------------------------------------          
    
        lv.yu.kot.desktoppane_09_12.removeAll()
        
        lv.yu.kot.start.start_12.KOT_start_12_09()
    	                	
        lv.yu.kot.desktoppane_09_12.add(lv.yu.kot.start.start_12.JInternalFrame_start_09_12, BorderLayout.CENTER)

        lv.yu.kot.panel_09_1.add(lv.yu.kot.desktoppane_09_12, BorderLayout.CENTER)

//--------------------------------------------------        
        
        lv.yu.kot.desktoppane_09_13.removeAll()
        
        lv.yu.kot.start.start_13.KOT_start_13_09()
       		                    
        lv.yu.kot.desktoppane_09_13.add(lv.yu.kot.start.start_13.JInternalFrame_start_09_13, BorderLayout.CENTER)
        
        lv.yu.kot.panel_09_1.add(lv.yu.kot.desktoppane_09_13, BorderLayout.EAST)

//--------------------------------------------------
        
        lv.yu.kot.desktoppane_09_21.removeAll()
    
        lv.yu.kot.start.start_21.KOT_start_21_09()
    		                
        lv.yu.kot.desktoppane_09_21.add(lv.yu.kot.start.start_21.JInternalFrame_start_09_21, BorderLayout.CENTER)
         
        lv.yu.kot.panel_09_2.add(lv.yu.kot.desktoppane_09_21, BorderLayout.WEST)

//--------------------------------------------------         

        lv.yu.kot.desktoppane_09_22.removeAll()
    
        lv.yu.kot.start.start_22.KOT_start_22_09()
    		                
        lv.yu.kot.desktoppane_09_22.add(lv.yu.kot.start.start_22.JInternalFrame_start_09_22, BorderLayout.CENTER)
          
        lv.yu.kot.panel_09_2.add(lv.yu.kot.desktoppane_09_22, BorderLayout.CENTER)

//--------------------------------------------------   

        lv.yu.kot.desktoppane_09_23.removeAll()
    
        lv.yu.kot.start.start_23.KOT_start_23_09()
    		                
        lv.yu.kot.desktoppane_09_23.add(lv.yu.kot.start.start_23.JInternalFrame_start_09_23, BorderLayout.CENTER)
        
        lv.yu.kot.panel_09_2.add(lv.yu.kot.desktoppane_09_23, BorderLayout.EAST)

//--------------------------------------------------          
			            		
        lv.yu.kot.frame_09.isVisible = true

}  //  end KOT_start_visualize_09()

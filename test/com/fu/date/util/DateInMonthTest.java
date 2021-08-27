/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.date.util;

import com.fu.date.DateInMonth;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 *
 * @author DELL
 */
public class DateInMonthTest {
    
    
  
    @Test
    public void UTCID01(){
      
        assertEquals(31, DateInMonth.checkDateInMonth("1", "2020"));
       
    }
     @Test
    public void UTCID02(){
      
        assertEquals(28, DateInMonth.checkDateInMonth("2", "2021"));
       
    }
     @Test
      public void UTCID03(){
      
        assertEquals(29, DateInMonth.checkDateInMonth("2", "2024"));
       
    }
       @Test
      public void UTCID04(){
      
        assertEquals(31, DateInMonth.checkDateInMonth("3", "2019"));
       
    }
       @Test
      public void UTCID05(){
      
         assertEquals(30,DateInMonth.checkDateInMonth("4", "2020"));
       
    }
       @Test(expected = IllegalArgumentException.class)
      public void UTCID06(){
      
        DateInMonth.checkDateInMonth("5", "10");
       
    }
     @Test(expected = NullPointerException.class)
     public void UTCID07(){
      
       DateInMonth.checkDateInMonth("6", "");
       
    }
      @Test
     public void UTCID08(){
      
       assertEquals(31, DateInMonth.checkDateInMonth("7", "2022"));
       
    }
     @Test
     public void UTCID09(){
      
        assertEquals(31,DateInMonth.checkDateInMonth("8", "2021"));
       
    }
     @Test
        (expected = IllegalArgumentException.class)
     public void UTCID10(){
      
       DateInMonth.checkDateInMonth("9", "3500");
       
    }
      @Test(expected = NullPointerException.class)
     public void UTCID11(){
      
        DateInMonth.checkDateInMonth("10", "");
       
    }
      @Test
     public void UTCID12(){
      
        assertEquals(30,DateInMonth.checkDateInMonth("11", "2019"));
       
    }
      @Test
     public void UTCID13(){
      
        assertEquals(31,DateInMonth.checkDateInMonth("12", "2021"));
       
    }
      @Test(expected = IllegalArgumentException.class)
     public void UTCID14(){
      
        DateInMonth.checkDateInMonth("13", "10");
       
    }
      @Test(expected =NullPointerException.class)
     public void UTCID15(){
      
        DateInMonth.checkDateInMonth("", "2022");
       
    }
     // THÊM CODE SAU KHI MATCH CODE ĐẦU LÊN SERVER - 5:12pm
      @Test
     public void UTCID16(){
      
        assertEquals(30,DateInMonth.checkDateInMonth("11", "2021"));
       
    }
}

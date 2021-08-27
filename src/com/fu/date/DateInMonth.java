
package com.fu.date;

public class DateInMonth {
    
    public static int checkDateInMonth(String month, String year)
    {  
        
       
          if(month.isEmpty() || year.isEmpty())
            throw new NullPointerException("Day or Month or Year is not empty");
           
      
          int m = Integer.parseInt(month);
          int y = Integer.parseInt(year);
          
           if(m != Integer.parseInt(month) || y != Integer.parseInt(year)) 
                        throw new NumberFormatException("month and year must be a number");
        
        if(m < 1 || m> 12 || y >3000 || y < 1000)
            throw new IllegalArgumentException("Invalid Agurment "+
                    "month have to between 1  and 12  And year have to between 1000 and 3000");
        
        else  if(m == 1 || m== 3 || m == 5 || m ==7 || m == 8 || m == 10 || m == 12)
            return 31;
        else if(m == 4 || m == 6 || m == 9  || m == 11 )
            return 30;
        else if(m == 2 &&  y % 4 == 0)
            return 29;
        else
            return 28;
     
         
       
    }
    
}

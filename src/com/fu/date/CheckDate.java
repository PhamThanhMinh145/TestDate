
package com.fu.date;


public class CheckDate {
    
    public static boolean CheckDate(String day, String month, String year)
    {
        if(day.isEmpty() || month.isEmpty() || year.isEmpty())
            throw new NullPointerException("Day or Month or Year is not empty");
          int d = Integer.parseInt(day);
          int m = Integer.parseInt(month);
          int y = Integer.parseInt(year);
        
        if( d > 31 || d < 1  || m >12 || m< 1 || y <1000 || y > 3000)
        
            return false;
        
        else if( (m == 4 || m == 6 || m == 9 || m == 11)  &&  (d <= 30))
            return true;
        
       else if( (m == 1 || m == 3 || m == 5|| m==7 || m == 8 || m == 10 || m == 12) && (d <= 31))
            return true;
       
       else if (m == 2 && y % 4 == 0  && d <= 29  )
            return true;
       else if (m == 2 && y % 4 != 0  && d <= 28  )
            return true;
                
        return false;
    }
}

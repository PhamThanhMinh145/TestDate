
package com.fu.date.util;

import com.fu.date.CheckDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckDateTest {

    @Test
    public void UTCID01() {
        assertEquals(true, CheckDate.CheckDate("31", "1", "2000")); // t

    }
     @Test
    public void UTCID02() {
        assertEquals(true, CheckDate.CheckDate("29", "2", "2020")); // t

    }
    @Test
    public void UTCID03() {
        assertEquals(true, CheckDate.CheckDate("28", "3", "2022"));  // t

    }
    @Test
    public void UTCID04() {
        assertEquals(true, CheckDate.CheckDate("30", "4", "2009"));  // t

    }
    @Test
    public void UTCID05() {
        assertEquals(true, CheckDate.CheckDate("1", "5", "2028")); // t

    }
    @Test
    public void UTCID06() {
           assertEquals(false, CheckDate.CheckDate("0", "6", "2022")); // t

    }
    @Test
    public void UTCID07() {
        assertEquals(false, CheckDate.CheckDate("32", "7", "2021")); // t

    }
    @Test(expected = NullPointerException.class)
    public void UTCID08() {
        CheckDate.CheckDate("", "8", ""); // f

    }
    @Test
    public void UTCID09() {
        assertEquals(false, CheckDate.CheckDate("31", "9", "2000")); // t

    }
    @Test
    public void UTCID10() {
        assertEquals(true, CheckDate.CheckDate("30", "10", "2009"));// t

    }
    @Test
    public void UTCID11() {
        assertEquals(true, CheckDate.CheckDate("1", "11", "2020")); // t

    }
    @Test(expected = NullPointerException.class)
    public void UTCID12() {
         CheckDate.CheckDate("", "12", "2028"); 

    }
    @Test
    public void UTCID13() {
        assertEquals(false, CheckDate.CheckDate("30", "13", "2100"));
        }
    @Test(expected = NullPointerException.class)
    public void UTCID14() {
      CheckDate.CheckDate("29", "", "");

    }
    @Test
    public void UTCID15() {
        assertEquals(false, CheckDate.CheckDate("28", "0", "2020"));

    }
}

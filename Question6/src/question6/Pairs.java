
package question6;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.time.*;

/**
 *
 * @author vandana yadav
 */

public class Pairs 
{
    //Attributes of Pairs
     
     Girl g;
     Boy b;
     
     int happiness=0;
     int compatibility=0;
     
    //constructor of Pairs
     
     
    public Pairs(Girl girl, Boy boy[])
    {
        this.g = girl;
        if(g.status == 1)
        {
            this.b = boy[g.id] ;
           
        }
    }
     
    public Pairs()
    {
         
    }
     
}


package question5;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.*;


/**
 *
 * @author vandana yadav
 */

public class Question5
{
    public static void main(String args[]) throws IOException
    {   
        Utility u = new Utility();
        
        Girl[] g = new Girl[30];
        Boy[] b = new Boy[100];
    
        u.InputGirls(g);
        u.SortGirlsIncOdr(g);//maintenanceBudget
        u.FileGirls(g);
    
        u.InputBoys(b);
        u.SortBoysIncOdr(b);//attractiveness
        u.FileBoys(b);
        
        Pairs[] p = new Pairs[g.length];
        u.NewPairingFormat(b,g);//first girl select boy then boy select girl and so on....
      
        u.MakePairs(g, b, p);
        
        Gift[] gt = new Gift[100];
        u.InputGifts(gt);
        u.FileGifts(gt);
        u.GiftingProcess(p);
        
        Random rand = new Random();
        
        int k = rand.nextInt(10) + 5;
        
        u.kHappiestPair(p,k);
    }
    
}

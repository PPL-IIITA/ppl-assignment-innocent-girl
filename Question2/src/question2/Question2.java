
package question2;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.time.*;

/**
 *
 * @author vandana yadav
 */

public class Question2 
{
    
    public static void main(String[] args)  throws IOException
    {
      
        Utility u = new Utility();
        
        Girl[] g = new Girl[30];
        Boy[] b = new Boy[100];
    
        u.InputGirls(g);
        u.FileGirls(g);
    
        u.InputBoys(b);
        u.FileBoys(b);
        
        Gift[] gt = new Gift[100];
        u.InputGifts(gt);
        u.FileGifts(gt);
        
        Pairs[] p = new Pairs[g.length];
        u.FilePairs(b,g);
      
        u.MakePairs(g, b, p);

        u.GiftingProcess(p);
      
        Random rand = new Random();
        
        int k = rand.nextInt(10) + 5;
        
        u.kHappiestPair(p,k);
        u.kCompatiblePair(p,k);
       
    }
    
}

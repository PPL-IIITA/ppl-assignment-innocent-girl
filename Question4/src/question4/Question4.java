
package question4;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.*;

/**
 *
 * @author vandana yadav
 */

public class Question4 
{
    public static void main(String args[]) throws IOException
    {
        Utility u = new Utility();
        
        Girl[] g = new Girl[30];
        Boy[] b = new Boy[100];
    
        u.InputGirls(g);
        u.FileGirls(g);
    
        u.InputBoys(b);
        u.FileBoys(b);
        
        Pairs[] p = new Pairs[g.length];
        u.FilePairs(b,g);
      
        u.MakePairs(g, b, p);
        
        Gift[] gt = new Gift[100];
        u.InputGifts(gt);
        u.FileGifts(gt);
        u.GiftingProcess(p);
        
        Random rand = new Random();
        
        int k = rand.nextInt(10) + 5;
        
        u.SortHappyPairIncOdr(p);
    
        
        u.BreakUp(p,k);
      
       
        u.AssignNewBF(p,k,b);
        
    }
    
}

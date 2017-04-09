
package question6;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.*;

/**
 *
 * @author vandana yadav
 */

public class Question6
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
        
        int t = rand.nextInt(450) + 50;

        System.out.println("t = " + t + " days");

        u.BreakUp(p,t);
       
        u.AssignNewBF(p,b);
        
    }
    
}


package RIT2015060;

import java.util.*;
import java.io.*;

/**
 *
 * @author vandana yadav
 */

public class Question1
{

    public static void main(String[] args) 
    {
        
         Girl[] g = new Girl[20];
         Boy[] b = new Boy[70];
        
         int i,j;
         
         //GIRL
         try
         {
            PrintWriter w = new PrintWriter("girl.txt", "UTF-8");
     
            for( i=0 ; i<g.length ; i++) 
            {
                 g[i] = new Girl();
                 w.println(g[i].name + "   " +g[i].attractiveness + "   " +  g[i].intelligenceLevel + "    " + g[i].maintenanceBudget + "    " + g[i].status + "    " + g[i].type );
                    
            }
            w.close();
         }
         catch(Exception e){
             
         }  
         
         //BOY
         try
         {
            PrintWriter z = new PrintWriter("boy.txt", "UTF-8");
            
            for( i=0 ; i<b.length ; i++) 
            {
                 b[i] = new Boy();
                 z.println(b[i].name + "   " + b[i].attractiveness + "   " + b[i].intelligenceLevel + "   " + b[i].budget + "    " + b[i].minAttractivenessRequired + "    " + b[i].status + "    " + b[i].type);
                    
            }
            z.close();
         }
         catch(Exception e){
             
         }  
         
         //PAIRING OF GIRL & BOY
         try
         {
            PrintWriter q = new PrintWriter("pair.txt", "UTF-8");
            int p=0;
            for(i=0 ; i<g.length ; i++)
            {
                for(j=0 ; j<b.length ; j++)
                {
                    if(  b[j].status==0 && g[i].status==0 && b[j].EGBL(g[i].attractiveness, g[i].maintenanceBudget) && g[i].EGBL(b[j].budget))
                    {
                        g[i].status=1;
                        b[j].status=1;
                        g[i].boyfriend = b[j].name;
                        b[j].girlfriend = g[i].name;
                        
                        System.out.println("Pair(G,B)_"+ p + "  " + g[i].name + "  " + b[j].name); 
                        q.println("Pair(G,B)_"+ p + "  " + g[i].name + "  " + b[j].name);
                        p++;
                         
                    }
                }
            }
            
            q.close();
         }
         catch(Exception e){
                      
         } 
         
        
    }
    
}

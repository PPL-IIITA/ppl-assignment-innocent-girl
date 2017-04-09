
package question2;


import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.*;

/**
 *
 * @author vandana yadav
 */

public class Utility 
{
    int i,j;
  
    /**
     * 
     * @param g
     * generate girls
     */
    void InputGirls(Girl g[])
    {   
        for(i=0;i<g.length;i++)
                g[i]=new Girl();
    }
    
    /**
     * 
     * @param b
     * generate boys
     */
    void InputBoys(Boy b[])
    {
        for(i=0;i<b.length;i++)
                b[i]=new Boy();
    }
    
    /**
     * 
     * @param g
     * store girls in a file
     */
    void FileGirls(Girl g[])
    {
   
         //GIRL
         try
         {
            PrintWriter w = new PrintWriter("girl.txt", "UTF-8");
            w.println("   name" + "        " +"attractiveness" + "   " +"intelligenceLevel "+ "    " +"maintenanceBudget" + "    " +"status" + "    " +"type" );
                  
            for( i=0 ; i<g.length ; i++) 
            {
                 w.println(g[i].name + "       " +g[i].attractiveness + "                 " +  g[i].intelligenceLevel + "                  " + g[i].maintenanceBudget + "                  " + g[i].status + "         " + g[i].type );
                    
            }
            w.close();
         }
         catch(Exception e){
             
         }  
    }
    
    /**
     * 
     * @param b
     * store boys in a file
     */
    void FileBoys(Boy b[])
    {
        //BOYS
        try
         {
            PrintWriter z = new PrintWriter("boy.txt", "UTF-8");
          
            z.println("  name" + "       " +"attractiveness" + "   " +"intelligenceLevel" + "   " + "budget" + "    " + "minAttractivenessRequired "+ "    " +"status" + "    " +"type");
                    
            for( i=0 ; i<b.length ; i++) 
            {
                 z.println(b[i].name + "        " + b[i].attractiveness + "           " + b[i].intelligenceLevel + "                  " + b[i].budget + "                   " + b[i].minAttractivenessRequired + "                   " + b[i].status + "           " + b[i].type);
                    
            }
            z.close();
         }
         catch(Exception e){
             
         }  
    }
    
    /**
     * 
     * @param b
     * @param g
     * pairing of girl and boy
     */
    void Pairing(Boy b[],Girl g[])
    {
        //PAIR
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
                        g[i].id = j;
                        b[j].id = i;
                        
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
    
    /**
     * 
     * @param b
     * @param g
     * store pairs in a file
     */
   void FilePairs(Boy b[],Girl g[])
    {
        //PAIR
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
                        g[i].id = j;
                        b[j].id = i;
                       
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
   
   Random rand = new Random();
   
   /**
    * 
    * @param gt 
    * generate gifts
    */
   void InputGifts(Gift gt[])
    {   
        
        for(i=0;i<gt.length;i++)
        {
              j = rand.nextInt(3);
              gt[i]=new Gift(j);
        }
              
    }
    
   /**
    * 
    * @param gt
    * store gifts in a file
    */
    void FileGifts(Gift gt[])
    {
        //GIFTS
        try
         {
            PrintWriter z = new PrintWriter("gift.txt", "UTF-8");
            
            for( i=0 ; i<gt.length ; i++) 
            {  
                if(gt[i].type==0)
                        z.println(gt[i].type + "   " + gt[i].price + "   " + gt[i].value );
                
                else if(gt[i].type==1)
                     z.println(gt[i].type + "   " + gt[i].price + "   " + gt[i].value + "   " + gt[i].difficultyToObtain + "   " + gt[i].luxuryRating);
                else
                     z.println(gt[i].type + "   " + gt[i].price + "   " + gt[i].value + "   " + gt[i].utilityValue + "   " + gt[i].utilityClass);
                    
            }
            z.close();
         }
         catch(Exception e){
             
         }  
    }
    
    /**
     * 
     * @param g
     * @param b
     * @param p
     * store pairs in an array
     */
    void MakePairs(Girl g[], Boy b[], Pairs p[])
    {
        j=0;
        
        for(i=0; i<g.length; i++)
        {
                p[j] = new Pairs(g[i], b);
                j++;
            
        }
    }
    
    /**
     * 
     * @param gt
     * sort gifts in inc order of price
     */
    void sortGifts(Gift gt[])
    {
        Gift tmp = new Gift();
        
        for( i=0; i<gt.length-1; i++)
        {
            for( j=0; j<gt.length-i-1 ; j++ ) 
            {
                if(gt[j].price > gt[j+1].price)
                {
                    tmp = gt[j];
                    gt[j] = gt[j+1];
                    gt[j+1] =tmp;
                }
            }
        }
    }
    
    /**
     * 
     * @param p
     * gifting process on Valentine's day
     */
    void GiftingProcess(Pairs p[])
    {
        
        try
        {
            PrintWriter w = new PrintWriter("giftingProcess.txt","UTF-8");
            
            for(i=0; i<p.length ; i++)
            {
                if(p[i].g.status == 1)
                {
                    w.println("Boy( " +  p[i].b.name + ") gifted girlfriend("+ p[i].b.girlfriend + ") gift costing Rs." + p[i].b.MoneySpent);
                    System.out.println("Boy(" +  p[i].b.name + ") gifted girlfriend("+ p[i].b.girlfriend + ")  gift costing Rs." + p[i].b.MoneySpent);
                }
            
            }
            
            w.close();
        }
        
        catch(Exception e){
             
        }  
       
    }
    
    /**
     * 
     * @param p
     * computes happiness of pairs
     */
    void CalculateHappiness(Pairs p[])
    {
        int gh=0, bh=0;
             
        for( i=0; i<p.length; i++)
        { 
            if(p[i].g.status == 0)
                continue;
            
            if (p[i].g.type == 0)
                gh = (int)Math.log( Math.abs(p[i].g.maintenanceBudget-p[i].b.MoneySpent));
            
            else if (p[i].g.type == 1)    
                gh = Math.abs(p[i].g.maintenanceBudget-p[i].b.MoneySpent);
            
            else if (p[i].g.type == 2)
                gh = (int)Math.getExponent( Math.abs(p[i].g.maintenanceBudget-p[i].b.MoneySpent)) ;
            
            p[i].g.happiness = gh;
           
        }
        
        for(i=0; i<p.length; i++)
        {
            if(p[i].g.status == 0)
                continue;
             
            if (p[i].b.type == 0)
            {
                bh = Math.abs(p[i].b.budget - p[i].b.MoneySpent);
            }
            else if (p[i].b.type == 1)
                
                bh = (p[i].g.intelligenceLevel) ;
            
            else 
                bh = (p[i].g.happiness) ;
          
            p[i].b.happiness = bh;
        }
        
        for( i=0; i < p.length ; i++)
        {
             if(p[i].g.status == 1)
                 p[i].happiness = p[i].b.happiness + p[i].g.happiness;
           
        }
        
        
    }
    
    /**
     * 
     * @param p
     * @param k 
     * computes k most happiest pair
     */
    void kHappiestPair(Pairs p[], int k)
    {
        if(k < 0 || k > p.length)
        {
            System.out.println("k not in range");
            return;
        }
    
        CalculateHappiness(p);
        
        Pairs[] temp = new Pairs[p.length];
        
        for(i = 0; i < p.length; i++)
            temp[i] = p[i];
          
        Pairs tmp = new Pairs();
       
        System.out.println("Happy pair(G,B)_index"+ "    " +"GIRLFRIEND"+ "    " +"BOYFRIEND"+ "   "+ "HAPPINESS");
        
        try
        {
            PrintWriter w = new PrintWriter("kHappiestPair.txt", "UTF-8");
            w.println("Happy pair(G,B)_index"+ "    " +"GIRLFRIEND"+ "    " +"BOYFRIEND"+ "   "+ "HAPPINESS");
            
            for(i = 0; i < k; i++)
            {  
               for( j = i+1; j < temp.length; j++)
               {               
                  if(temp[i].happiness < temp[j].happiness)
                  {
                     tmp = temp[i];
                     temp[i] = temp[j];
                     temp[j] = tmp;
                  }
                } 
               
                w.println("happy pair(G,B)_" + i + "        " +  temp[i].g.name + "    " + temp[i].b.name + "  " + temp[i].happiness );
                System.out.println("happy pair(G,B)_" + i + "        " +  temp[i].g.name + "    " + temp[i].b.name+ "  " + temp[i].happiness );
          
            }
            
            w.close();
        }
         
        catch(Exception e){
             
        }  
        
    }
    
    /**
     * 
     * @param p 
     * computes compatibility of pairs
     */
    void CalculateCompatibility(Pairs p[])
    {
        int AttractivenessDifference =0 ,IntelligenceDifference =0 ;
        
        for(i=0; i<p.length; i++) 
        {
            if(p[i].g.status == 0)
                continue;
            
            AttractivenessDifference = p[i].g.attractiveness - p[i].b.attractiveness;
            
            IntelligenceDifference = p[i].g.intelligenceLevel - p[i].b.intelligenceLevel;
            
            p[i].compatibility = Math.abs( p[i].b.budget - p[i].g.maintenanceBudget);
            p[i].compatibility += Math.abs( AttractivenessDifference);
            p[i].compatibility += Math.abs(IntelligenceDifference );
        
        }
    }
    
    /**
     * 
     * @param p
     * @param k 
     * computes k most compatible pairs
     */
    void kCompatiblePair(Pairs p[], int k) 
    {
        if(k < 0 || k > p.length)
        {
            System.out.println("k not in range");
            return;
        }
        
        CalculateCompatibility(p);
        
        Pairs[] temp = new Pairs[p.length];
        
        for(i = 0; i < p.length; i++)
            temp[i] = p[i];
          
        Pairs tmp = new Pairs();
        
        System.out.println("Compatible pair(G,B)_index"+ "    " +"GIRLFRIEND"+ "    " +"BOYFRIEND"+ "   "+ "COMPATIBILITY");
       
        try
        {
            PrintWriter w = new PrintWriter("kCompatiblePair.txt", "UTF-8");
            w.println("Compatible pair(G,B)_index"+ "    " +"GIRLFRIEND"+ "    " +"BOYFRIEND"+ "   "+ "COMPATIBILITY");
             
            for(i = 0; i < k; i++)
            {  
                for(j = i+1; j < temp.length; j++)
                {               
                    if(temp[i].compatibility < temp[j].compatibility)
                    {
                        tmp = temp[i];
                        temp[i] = temp[j];
                        temp[j] = tmp;
                    }
                } 
            
               
                w.println("Compatible pair(G,B)_" + i + "       " +  temp[i].g.name + "    " + temp[i].b.name + "    " + temp[i].compatibility);
                System.out.println("Compatible pair(G,B)_" + i + "        " +  temp[i].g.name + "    " + temp[i].b.name + "    " + temp[i].compatibility);
            }
            
            w.close();
        }
         
        catch(Exception e){
             
        }  
        
    }
   
    
}

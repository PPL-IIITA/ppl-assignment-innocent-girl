
package RIT2015060;

import java.util.Random;

/**
 *
 * @author vandana yadav
 */

public class Gift 
{
    //Attributes of gift.
    int price;
    int value;
    int type ;//0-Essential,1-Luxury,2-Utility
    
    int difficultyToObtain;
    int luxuryRating;
    
    int utilityValue;
    int utilityClass;
   
   //Random generation of different Attributes. 
   Random rand = new Random();
   
   public int Price()
   {
       int  n = rand.nextInt(501) + 50;
       return n;
   }
     
    public int Value()
   {
       int  n = rand.nextInt(3) + 1;
       return n;
   }
    
    public int DifficultyToObtain()
   {
       int  n = rand.nextInt(10) + 1;
       return n;
   }
     
   public int LuxuryRating()
   {
       int  n = rand.nextInt(3) + 1;
       return n;
   }
   
   public int UtilityValue()
   {
       int  n = rand.nextInt(10) + 1;
       return n;
   }
   
   public int UtilityClass()
   {
       int  n = rand.nextInt(3) + 1;
       return n;
   }

   public int Type()
   {
       int  n = rand.nextInt(3);
       return n;
   }

    
}

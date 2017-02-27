
package RIT2015060;

import java.util.Random;

/**
 *
 * @author vandana yadav
 */

public class Boy
{
  //Attributes of Boy
    
  String name; 
  int attractiveness; 
  int intelligenceLevel;
  int budget; 
  int minAttractivenessRequired;
    
  int type;//0-Miser,1-Generous,2-Geeks

  int status;// 0-SINGLE,1-COMMITED
  int happiness;
  
  String girlfriend;
  
  //constructor of Boy
  public Boy()
   {
        name = Name() ;
        attractiveness = Attractiveness();
        budget = Budget();
        intelligenceLevel = IntelligenceLevel(); 
        minAttractivenessRequired =  MinAttractivenessRequired();
        status = 0;
        type = Type();
    }
   
  //Random generation of different Attributes. 
   Random rand = new Random();
   
   public String Name()
   {
      int  n,i ;
      
      char[] charArray = new char[11];
     
      for(i=0;i<10;i++)
      {
           n = rand.nextInt(26) + 97;
           charArray[i]=(char)n;
      }

       String str = new String(charArray);
       return str;
  
   }
   
   public int Attractiveness()
   {
       int  n = rand.nextInt(10) + 1;
       return n;
   }
  
   public int IntelligenceLevel()
   {
       int  n = rand.nextInt(10) + 1;
       return n;
   }
  
   public int Budget()
   {
       int  n = rand.nextInt(401) + 200;
       return n;     
   }


   public int MinAttractivenessRequired()
   {
       int  n = rand.nextInt(10) + 1;
       return n;
   }
   
   public int Type()
   {
       int  n = rand.nextInt(3);
       return n;
   }
   
   //Check Eligibility criteria of girl.
   public boolean EGBL(int att,int maint)
   {
        if( maint < budget && att > minAttractivenessRequired)
            return true;
        
        return false;
   }   
    
}

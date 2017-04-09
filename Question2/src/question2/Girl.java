
package question2;

import java.util.Random;

/**
 *
 * @author vandana yadav
 */

public class Girl 
{
  //Attributes of Girl.
    
  String name;
  int attractiveness; 
  int intelligenceLevel; 
  int maintenanceBudget; 
  
  int type;//0-choosy,1-normal,2-desperate
  int status;// 0-SINGLE,1-COMMITTED
  int happiness=0;
  
  String boyfriend;
  int id = -1;
  
   //Construtor of girl.
   public Girl()
   {
        name = Name() ;
        attractiveness =  Attractiveness();
        intelligenceLevel = IntelligenceLevel();
        maintenanceBudget = MaintenenceBudget();
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
  
   public int MaintenenceBudget()
   {
       int  n = rand.nextInt(101) + 400;
       return n;     
   }
   
   public int Type()
   {
       int  n = rand.nextInt(3);
       return n;
   }
   
   //Check Eligibility criteria of boy.
   public boolean EGBL(int bugt)
   {
        if( bugt > maintenanceBudget )
            return true;
        
        return false;
    }     
    
}


/**
 * Write a description of class Town here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Town
{
   String name;
   String accessPoints;
   
   public Town(){
       String name;
       String accessPoints;
    }
    
   public Town(String name, String accessPoints){
       this.name=name;
       this.accessPoints=accessPoints;
    }
    
   public String getName(){
       return name;
    }
    
   public String getAccessPoints(){
       return accessPoints;
    }
}

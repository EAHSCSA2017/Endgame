/**
 * Write a description of class Arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena
{
    public static void arena(){
        //change this to character creation method in Ryan's class
        ArenaFighter enemy=new ArenaFighter();
        Character player=new Character();
        int ehealth=enemy.getHealth();
        int phealth=player.getphealth();
        //add stops
        while (ehealth*phealth!=0){
            System.out.println("You have "+phealth+" health and the enemy has "+ehealth+" health.");
            System.out.println("You hit the enemy dealing"+player.getDamage()+" damage.");
            ehealth-=player.getDamage();
            System.out.println("The enemy hits you dealing"+enemy.getDamage()+" damage.");
            phealth=enemy.getDamage();
        }
    }
}
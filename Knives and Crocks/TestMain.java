
/**
 * Write a description of class TestMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestMain
{
    // instance variables - replace the example below with your own
    public static void Main(){
        Items.setBalance(200);
        Armor boi = new Armor("chestplate", 100, "super gey chestplate", 100, true,false, false);
        Items.buy(boi);
        System.out.println(boi.getPrice());
        System.out.println(Items.getBalance());
    }
}

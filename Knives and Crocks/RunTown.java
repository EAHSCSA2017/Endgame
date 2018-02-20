import java.util.*;
import java.util.Random;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RunTown
{
    public static void runTown(){
        System.out.println("You are now in the town");
        System.out.println("Select a direction to go (right-R,left-L,down-D,up-U)");
        int placeNumber=12;
        boolean town=true;

        ArrayList <Town> townArrayList = new ArrayList();
        Town place0= new Town("Sidewalk 1", "DR");
        Town place1= new Town("Sidewalk 2", "LR");
        Town place2= new Town("Arena", "D");
        Town place3= new Town("Sidewalk 3", "R");
        Town place4= new Town("Sidewalk 4", "DL"); 
        Town place5= new Town("Sidewalk 5", "UD");
        Town place6= new Town("Shop 1", "D");
        Town place7= new Town("Sidewalk 6", "UD");
        Town place8= new Town("Shop 2", "D");
        Town place9= new Town("Sidewalk 7", "UD");
        Town place10= new Town("Sidewalk 8", "UDR");
        Town place11= new Town("Sidewalk 9", "ULR");
        Town place12= new Town("Sidewalk 10", "UDLR");
        Town place13= new Town("Sidewalk 11", "ULR");
        Town place14= new Town("Sidewalk 12", "UDL");
        Town place15= new Town("Sidewalk 13", "UD");
        Town place16= new Town("Shop 3", "D");
        Town place17= new Town("Sidewalk 14", "UD");
        Town place18= new Town("Closed Shop", "D");
        Town place19= new Town("Sidewalk 15", "UD");
        Town place20= new Town("Sketchy sidewalk 16", "UR");
        Town place21= new Town("Sidewalk 17", "ULR");
        Town place22= new Town("Sidewalk 18", "ULR");
        Town place23= new Town("Sidewalk 19", "ULR");
        Town place24= new Town("Sidewalk 20", "UL");

        townArrayList.add(place0);
        townArrayList.add(place1);
        townArrayList.add(place2);
        townArrayList.add(place3);
        townArrayList.add(place4);
        townArrayList.add(place5);
        townArrayList.add(place6);
        townArrayList.add(place7);
        townArrayList.add(place8);
        townArrayList.add(place9);
        townArrayList.add(place10);
        townArrayList.add(place11);
        townArrayList.add(place12);
        townArrayList.add(place13);
        townArrayList.add(place14);
        townArrayList.add(place15);
        townArrayList.add(place16);
        townArrayList.add(place17);
        townArrayList.add(place18);
        townArrayList.add(place19);
        townArrayList.add(place20);
        townArrayList.add(place21);
        townArrayList.add(place22);
        townArrayList.add(place23);
        townArrayList.add(place24);

        while(!!town){            
            String choice = UserInput.getString();
            choice=choice.toUpperCase();
            //Check user's decision to determine next move
            placeNumber = movement(townArrayList, placeNumber, choice);
            //options when you move to another room
            System.out.println("Placement: " + townArrayList.get(placeNumber).getName());
            //this should probably be in main but lets get it working first
            switch (townArrayList.get(placeNumber).getName()){
                case "Arena":
                Arena.arena();
                break;

                case "Shop 1":
                Shop.weapons();
                break;

                case "Shop 2":
                Shop.armor();
                break;

                case "Shop 3":
                Shop.consumables();
                break;
                
                default:
                System.out.println("nothing");
                break;
            }
            
        }
    }

    public static int movement(ArrayList <Town> townArrayList, int placeNumber, String choice){
        boolean encounter=true;

        String access=townArrayList.get(placeNumber).getAccessPoints();
        for(int x=0; x<townArrayList.get(placeNumber).getAccessPoints().length();x++){
            if(townArrayList.get(placeNumber).getAccessPoints().substring(x,x+1).equals(choice))
                encounter=false;            
        }       

        // moves to another room if there is no encounter
        if(!(encounter)){
            switch (choice){
                //CONTROLS
                case "U":
                placeNumber-=5;
                break;

                case "D":
                placeNumber+=5;
                break;

                case "L":
                placeNumber-=1;
                break;

                case "R":
                placeNumber+=1;
                break;
            }            
        }
        return placeNumber;
    }

}


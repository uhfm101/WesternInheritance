
/**
 * Write a description of class Steak here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Steak extends Food
{
    public Steak(){
        super("Steak", 30, false, false);
    }
    
    
    public void replenish(){
        super.replenish();
    }
    
    public void spoil(){
        super.spoil();
    }
    
    public void attract(){
        if(isSpoiled == true){
            System.out.println("The steak is attracting flies, a pestilence is here");
        } else{
            System.out.print("The steak sits there");
        }
    }
}

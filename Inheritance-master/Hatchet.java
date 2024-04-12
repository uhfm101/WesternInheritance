
/**
 * Write a description of class Hatchet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hatchet extends Melee
{
    public Hatchet(){
        super("Hatchet", 1, 100, false);
    }
    
    public int chop(){
        System.out.println("The enemy was struck,leaving a deep gash");
        cleanliness -= 15;
        
        return 60;
    }
    
    public boolean blocked(){
        super.blocked();
        
        return true;
    }
}

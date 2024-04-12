
/**
 * Write a description of class Beans here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beans extends Food
{
    public Beans(){
        super("Beans", 15, true, false);
    }
    
    public void spoil(){
        super.spoil();
    }
    
    public void replenish(){
        super.replenish();
        
        System.out.println("The beans were a hearty meal");
        
        isCanned = false;
    }
}

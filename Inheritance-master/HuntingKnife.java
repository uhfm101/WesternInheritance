
/**
 * Write a description of class HuntingKnife here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HuntingKnife extends Melee
{
    public HuntingKnife(){
        super("Hunting Knife", 1, 100, false);
    }
    
    public int stab(){
        System.out.println("The weapon stabbed the enemy");
        cleanliness -= 10;
        
        return 50;
    }
    
    public boolean blocked(){
        super.blocked();
        
        System.out.println("Cannot block with a knife");
        cleanliness -= 15;
        
        return false;
    }
}

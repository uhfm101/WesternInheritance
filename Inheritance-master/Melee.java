
/**
 * Write a description of class Melee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Melee extends Weapon implements DefenseCommands
{
    
    
    public Melee(String name, int weight, int cleanliness, boolean isRusty){
        super(name, weight, cleanliness, isRusty);
        
    }
    
    public int attack(){
        super.attack();
        System.out.println("The weapon was swung");
        cleanliness -= 5;
        
        return 15;
    }
    
    public boolean blocked(){
        System.out.println("The attack was successfully blocked");
        cleanliness -= 5;
        
        return true;
    }
}


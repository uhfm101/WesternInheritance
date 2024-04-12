
/**
 * Write a description of class Gun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Gun extends Weapon
{
    int ammo;
    
    public Gun(String name, int weight, int cleanliness, boolean isRusty, int ammo){
        super(name, weight, cleanliness, isRusty);
        
        this.ammo = ammo;
    }
    
    public int attack(){
        super.attack();
        System.out.println("The weapon was fired");
        ammo -= 1;
        
        return 30;
    }
}


/**
 * Write a description of class World here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    int weight;
    boolean isRusty = false;
    int cleanliness;
    
    public Weapon(String name, int weight, int cleanliness, boolean isRusty){
        super(name);
        this.weight = weight;
        this.cleanliness = cleanliness;
        this.isRusty = isRusty;
    }
    
    public int attack(){
        System.out.println("The weapon was pulled out");
        return 30;
    }
    
    public boolean parry(){
        System.out.println("The attack was parried");
        return true;
    }
    
    public void check(){
        if(cleanliness > 50){
            System.out.println("The weapon is clean");
            isRusty = false;
        } else if(cleanliness < 50){
            System.out.println("The weapon is dirty");
            isRusty = true;
        }
    }
    
    public void clean(){
        System.out.println("The weapon is now clean");
        cleanliness = 100;
    }
}

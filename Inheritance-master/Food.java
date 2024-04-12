
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Food extends Item implements FoodInterface
{
    int satiation;
    boolean isCanned = false;
    boolean isSpoiled = false;
    
    public Food(String name, int satiation, boolean isCanned, boolean isSpoiled){
        super(name);
        this.satiation = satiation;
        this.isCanned = isCanned;
        this.isSpoiled = isSpoiled;
    }
    
    public void spoil(){
        System.out.println("The food is spoiled, it's not very edible");
        
        isSpoiled = true;
    }
    
    public void replenish(){
        while(satiation > 0){
            if(isSpoiled == true){
                System.out.println("The food was spoiled, you throw it up");
                
                satiation += satiation;
            }
            else if(isSpoiled == false){
                System.out.println("The food was eaten");
                
                satiation -= satiation;
            }
        }
        System.out.println("You finished eating");
    }
}

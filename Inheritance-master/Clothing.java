
/**
 * Write a description of class Clothing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Clothing extends Item implements ClothingInterface
{
    int durability;
    int warmth;
    boolean isTorn = false;
    
    public Clothing(String name, int durability, int warmth, boolean isTorn){
        super(name);
        this.durability = durability;
        this.warmth = warmth;
        this.isTorn = isTorn;
    }
    
    public void protect(){
        System.out.println("Your clothes shield you from the elements");
        durability -= 5;
    }
    
    public void tear(){
        if(durability <= 0){
            System.out.println("Your clothes are torn");
            isTorn = true;
        } else if(durability > 0){
            System.out.println("Your clothes aren't weak enough to tear");
        }
    }
}

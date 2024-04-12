
/**
 * Write a description of class HealthTonic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HealthTonic extends Tonic
{
    public HealthTonic(){
        super("Dr. Cole's Miracle Tonic", 50, false, false);
    }
    
    public void open(){
        super.open();
        System.out.println("A nice aroma emerged");
    }
    
    public void drink(){
        super.drink();
        System.out.println("The tonic tasted odd, but you feel a bit better");
    }
    
    public void poison(){
        super.poison();
    }
    
    public void glisten(){
        System.out.println("The tonic has a small radiance, it entrances you");
    }
}

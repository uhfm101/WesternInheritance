
/**
 * Write a description of class StaminaTonic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaminaTonic extends Tonic
{
    public StaminaTonic(){
        super("Dr. Cole's Speedy Tonic", 50, false, false);
    }
    
    public void open(){
        super.open();
        System.out.println("A strong aroma hit your nose");
    }
    
    public void drink(){
        super.drink();
        System.out.println("The tonic tasted bitter, but you feel very powered");
    }
    
    public void poison(){
        super.poison();
    }
    
    public void drip(){
        System.out.println("The tonic seems to be melting the glass, acidic drops are leaking");
    }
}


/**
 * Write a description of class Coat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coat extends Clothing
{
    public Coat(){
        super("Leather Jacket", 100, 35, false);
    }
    
    public void protect(){
        super.protect();
        
        System.out.println("Not even nature's winds can pierce you");
    }
    
    public void tear(){
        super.tear();
        
        if(isTorn == true){
            System.out.println("You feel cold");
        }
    }
    
    public void button(){
        System.out.println("The coat is now buttoned up, fashionable");
    }
}

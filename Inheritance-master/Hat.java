
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat extends Clothing
{
    public Hat(){
        super("Bowler Hat", 20, 5, false);
    }
    
    public void protect(){
        super.protect();
        System.out.println("Not much is covered, but the top of your head is warm");
    }
    
    public void tear(){
        super.tear();
        
        if(isTorn == true){
            System.out.println("It's not a big deal, but the hat's not as nice looking");
        }
    }
    
    public void fly(){
        System.out.println("A gust of wind blew your hat off");
        
        System.out.print("You better catch it");
    }
}

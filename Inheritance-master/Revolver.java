
/**
 * Write a description of class Revolver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Revolver extends Gun
{
    public Revolver(){
        super("Cattleman's", 2, 100, false, 30);
    }
    
    public int quickDraw(){
        System.out.println("The hammer was fanned");
        ammo -= 6;
        cleanliness -= 10;
        return 100;
    }
}

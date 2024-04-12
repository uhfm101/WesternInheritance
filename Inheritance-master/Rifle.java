
/**
 * Write a description of class Rifle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rifle extends Gun 
{
    public Rifle(){
        super("Bolt action", 5, 100, false, 30);
    }
    
    public int attack(){
        super.attack();
        System.out.println("It was an accurate shot");
        ammo -= 1;
        cleanliness -= 5;
        if(isRusty = true){
        System.out.println("The gun is too dirty");
        return 20;
    } else if(isRusty = false){
        return 50;
    }
    return 0;
}
}


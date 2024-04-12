
/**
 * Write a description of class Tonic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Tonic extends Item implements TonicInterface
{
    int capacity;
    boolean isOpen = false;
    boolean isExpired = false;
    
    public Tonic(String name, int capacity, boolean isOpen, boolean isExpired){
        super(name);
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.isExpired = isExpired;
    }
    
    public void open(){
        if(isOpen == false){
        System.out.println("The bottle was opened");
        isOpen = true;
    } else{
        System.out.println("The bottle is already open");
    }
    }
    
    public void drink(){
        if(isOpen == true){
            System.out.print("The tonic was consumed");
            capacity -= capacity;
        } else{
            System.out.println("You can't drink the tonic, it isn't open");
        }
    }
    
    public void poison(){
        if(isExpired == true){
            System.out.println("The tonic is no longer consumable");
        } else{
            System.out.println("The tonic isn't poison");
        }
    }
}

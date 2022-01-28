
/**
 * Write a description of class Item here.
 *
 * @author (Nicole)
 * @version (a version number or a date)
 */
public class Item
{
    String name;
    String description;
    int id;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description, int id)
    {
       this.name = name;
       this.description = name;
       this.id = id;
    }
    
    public String getName()
    {
       return name;
    }
    
    public void getShortDescription()
    {
       System.out.println(name);
    }

    public void getlongDescription()
    {
       System.out.println(name + " " + description);
    }
}

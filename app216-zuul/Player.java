
/**
 * Write a description of class Player here.
 *
 * @author (nicole)
 * @version (a version number or a date)
 */
public class Player
{
    private final String name;
    private int score;
    private int count;
    private int health;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        this.name = name;
        score = 0;
    }
    
    /**
     * 
     */
    public int getScore()
    {
        return score;
    }
    
    public void increaseScore(int amount)
    {
        if(amount > 0)
        score += amount;
    }
    
    /**
     * 
     */
    public void setCount()
    {
        this.count = count;
    }
    
    public void setHealth(int health)
    {
         this.health = health;
    }
    
    public int getHealth()
    {
          return health;
    }
    

    /** 
     *
     */
    public void print()
    {
        System.out.println("Player ; " + name);
        System.out.println();
    }
    
    public void printStatus()
    {
        System.out.println("player status ; ");
        System.out.println("score = " + score);
    }
}

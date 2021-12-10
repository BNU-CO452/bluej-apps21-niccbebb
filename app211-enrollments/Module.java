
/**
 * This class models a BNU module which forms part of a course.
 *
 * @author Nicole Bebb
 * @version 1.0
 */
public class Module
{
    // Variables
    private String code;
    private String title;
    private int credit;


    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 15;
    }

     /**
      * This method returns
      * 
      * @param
      * @return code
      */
    public String getCode()
    {
       return this.code;
    }
    
      /**
      * This method returns
      * 
      * @param
      * @return code
      */
    public String getTitle()
    {
       return this.title;
    }
    
      /**
      * This method returns
      * 
      * @param
      * @return code
      */
    public int getCredit()
    {
       return this.credit;
    }
    
    public void setCredit(int credit)
    { 
       this.credit = credit;
    }        
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": "
                            + title + " Credit " + credit);
        System.out.println();
    }
}
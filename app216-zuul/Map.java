
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location sportsbar, outside, vets, office, gucci, tesco, doctors, isolationzone;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createSportsBar();
        createOutside();
        createVets();
        createOffice();
        createGucci();
        createTesco();
        createDoctors();
        createIsolationZone();

        currentLocation = sportsbar;  // start game in sportsbar
    }
    
    /**
     * Create the sportsbar and link it to the outside
     */
    private void createSportsBar()
    {
        sportsbar = new Location("inisde a bar having a drink while watching the football match. Suddenly. BREAKING NEWS comes on the tv. There has been an outbreak of the Corona Virus!! YOUR MISSION IS TO GET TO SAFE ISOLATION ZONE!! Pick up essentials on the way, and at all costs AVOID CONTRACTING COVID");
        
        sportsbar.setExit("east", outside);
    }
    
    /**
     * Create the outside and link it to the sportsbar and vets
     */
    private void createOutside()
    {
        outside = new Location("sprinting through the park. A box of fask masks are on a bench. Grab the face masks!");
        
        outside.setExit("east", vets);
        
        outside.setExit("west", sportsbar);
        sportsbar.setExit("east", outside);
        
        outside.setItem(new Item("FaceMask", "the face mask will help protect you against the virus", 101));
        
    }
    
    /**
     * Create the vets linked to the outside and office and primark
     */
    private void createVets()
    {
        vets = new Location("in the vets to pick up your huskey called Alex. He's your sidekick.");
        
        vets.setExit("east", gucci);
        
        vets.setExit("west", outside);
        outside.setExit("east", vets);
        
        vets.setExit("south", office);
        
        vets.setItem(new Item("Alex", "This is your doggo, hold him tight overwise he'll escape", 102));
    }
    
    /**
     * Create the office linked to the vets
     */
    private void createOffice()
    {
        office = new Location("in your office. The office is a ghost town. Look around for essentials");
        
        office.setExit("north", vets);
        vets.setExit("south", office);
        
        office.setItem(new Item("HandGel", "PERFECT! Hand Gel will help keep the virus away", 103)); 
    }
    
    /**
     * Create the gucci and link it to the vets and tesco
     */
    private void createGucci()
    {
        gucci = new Location("in gucci as you need PPE equipment. Look around for some designer protection");
        
        gucci.setExit("south", tesco);
        
        gucci.setExit("west", vets);
        vets.setExit("east", gucci);
        
        gucci.setItem(new Item("GucciPPE", "You've stolen a pair of gucci overalls. You'll be protected from covid while looking drippyyyyy", 104));
    }
    
    /**
     * Create the tesco linked to the gucci and doctors
     */
    private void createTesco()
    {
        tesco = new Location("in Tesco. Everyone is panic buying! QUICK! Grab anything you can!");
        
        tesco.setExit("south", doctors);
        
        tesco.setExit("north", gucci);
        gucci.setExit("south", tesco);
        
        tesco.setItem(new Item("VODKA", "You have brought 10 bottles of vodka, well done, gotta keep hydrated out here", 105));
    }
    
    /**
     * Create the doctors linked to the isolationzone and tesco
     */
    private void createDoctors()
    {
        doctors = new Location("at the Doctors. Decide what do take next");
        
        doctors.setExit("west", isolationzone);
        
        doctors.setExit("north", tesco);
        tesco.setExit("south", doctors);
        
        doctors.setItem(new Item("Vaccine", "You suffered a major side effect from taking the vaccine. Your head has morphed into a octopus", 106));
    }
    
    /**
     * Create the isolationzone linked to the doctors
     */
    private void createIsolationZone()
    {
        isolationzone = new Location("safe and secure");
        
        isolationzone.setExit("east", doctors);
        doctors.setExit("west", isolationzone);
        
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}

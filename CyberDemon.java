
/**
 * CyberDemon class. CyberDemons are of type Demon. They have no unique abilities other than
 * the Demon bonus damage chance. (The only thing they fear is you).
 *
 * @author Matt Witham
 * @version 11.4.25
 */
public class CyberDemon extends Demon
{
    private final static int MAX_STR = 40;
    private final static int MIN_STR = 20;
    private final static int MAX_HP = 100;
    private final static int MIN_HP = 25;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super(
        Randomizer.nextInt(MAX_STR-MIN_STR) + MIN_STR,
        Randomizer.nextInt(MAX_HP-MIN_HP) + MIN_HP
        );
    }

}
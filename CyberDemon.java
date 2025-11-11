
/**
 * Write a description of class CyberDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
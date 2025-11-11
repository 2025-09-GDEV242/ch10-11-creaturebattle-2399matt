
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    private static final int MAX_STR = 100;
    private static final int MIN_STR = 50;
    private static final int MAX_HP = 200;
    private static final int MIN_HP = 100;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
        Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR,
        Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP
        );
    }
    
    @Override
    public int attack() {
        int firstHit = super.attack();
        int secondHit = super.attack();
        return firstHit+secondHit;
    }

}
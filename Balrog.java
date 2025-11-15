
/**
 * Balrog class. The Balrog is an ancient Demon who inherits from Creature. Balrog's have the 
 * ability to attack twice in each round.
 *
 * @author Matt Witham
 * @version 11.4.25
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
    
    /**
     * attack method for the Balrog. Balrog's attack TWICE per round.
     */
    @Override
    public int attack() {
        int firstHit = super.attack();
        int secondHit = super.attack();
        return firstHit+secondHit;
    }

}
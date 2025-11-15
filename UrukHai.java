
/**
 * Uruk-Hai class. Uruk-Hai is of type Demon. They are essentially stronger variants of
 * humans, with no extra special abilities.
 *
 * @author Matt Witham
 * @version 11.4.25
 */
public class UrukHai extends Demon
{
    private final static int MAX_STR = 30;
    private final static int MIN_STR = 15;
    private final static int MAX_HP = 50;
    private final static int MIN_HP = 20;

    /**
     * Constructor for objects of class UrukHai
     */
    public UrukHai()
    {
        super(
        Randomizer.nextInt(MAX_STR-MIN_STR) + MIN_STR,
        Randomizer.nextInt(MAX_HP-MIN_HP) + MIN_HP
        );
    }
}

/**
 * Write a description of class Ent here.
 *
 * @author Matt Witham
 * @version 11.4.25
 */
public class Ent extends Creature
{
    private static final int MAX_HP = 70;
    private static final int MIN_HP = 40;
    private static final int MAX_STR = 50;
    private static final int MIN_STR = 20;

    /**
     * Constructor for objects of class Ent
     */
    public Ent()
    {
        super(
        Randomizer.nextInt(MAX_STR-MIN_STR) + MIN_STR,
        Randomizer.nextInt(MAX_HP-MIN_HP) + MIN_HP
        );
    }

}
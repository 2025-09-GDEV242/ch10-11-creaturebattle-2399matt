
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private static final int MAGIC_DMG_BONUS = 50;

    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }
    
    @Override
    public int attack() {
        int dmg = super.attack();
        if(Randomizer.nextInt(20) == 3) {
            dmg += MAGIC_DMG_BONUS;
        }
        return dmg;
    }
}
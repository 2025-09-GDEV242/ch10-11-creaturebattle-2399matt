
/**
 * Demon class. Demons are a special type of Creature in which all Demons
 * have a chance to do +50 magic damage on attack.
 *
 * @author Matt Witham
 * @version 11.4.25
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
    
    /**
     * attack method for the Demons. Dice is rolled for the chance to do bonus magic dmg.
     * @return the attack value from the Demon.
     */
    @Override
    public int attack() {
        int dmg = super.attack();
        if(Randomizer.nextInt(20) == 3) {
            dmg += MAGIC_DMG_BONUS;
        }
        return dmg;
    }
}
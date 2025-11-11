
/**
 * Elf class used to represent a Creature of type Elf.
 * Elves are similar to Humans, but differ in stats and bonus dmg opportunities.
 *
 * @author Matt Witham
 * @version 11.10.25
 */
public class Elf extends Creature
{
    private static int MAX_HP = 25;
    private static int MIN_HP = 8;
    private static int MAX_DMG = 18;
    private static int MIN_DMG = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
        Randomizer.nextInt(MAX_DMG-MIN_DMG) + MIN_DMG,
        Randomizer.nextInt(MAX_HP-MIN_HP) + MIN_HP
        );
    }
    
    @Override
    public int attack() {
        int attackDmg = super.attack();
        if(Randomizer.nextInt(10) == 3) {
            attackDmg *= 2;
        }
        return attackDmg;
    }
}

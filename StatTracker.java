
/**
 * StatTracker class is used to keep track of the stats for a current battle.
 *
 * @author Matt Witham
 * @version 11.4.25
 */
public class StatTracker
{
    private static final int EVIL_DMG_INDEX = 0;
    private static final int GOOD_DMG_INDEX = 1;
    private static final int GOOD_HUMAN_COUNT_INDEX = 2;
    private static final int ELF_COUNT_INDEX = 3;
    private static final int ENT_COUNT_INDEX = 4;
    private static final int EVIL_HUMAN_COUNT_INDEX = 5;
    private static final int CYBERDEMON_COUNT_INDEX = 6;
    private static final int BALROG_COUNT_INDEX = 7;
    private static final int EVIL_BLOWS_INDEX = 8;
    private static final int GOOD_BLOWS_INDEX = 9;
    private static final int URUKHAI_COUNT_INDEX = 10;
    private int[] stats;

    /**
     * Constructor for objects of class StatTracker
     */
    public StatTracker()
    {
        stats = new int[11];
    }
    
    /**
     * Adds to the damage count for the evil army.
     */
    public void addDamageToEvil(int dmg) {
        stats[EVIL_DMG_INDEX] += dmg;
    }
    
    /**
     * adds to the damage count for the good army.
     */
    public void addDamageToGood(int dmg) {
        stats[GOOD_DMG_INDEX] += dmg;
    }
    
    /**
     * increments the number of kills the evil army has.
     */
    public void incEvilKills() {
        stats[EVIL_BLOWS_INDEX]++;
    }
    
    /**
     * increments the number of kills the good army has.
     */
    public void incGoodKills() {
        stats[GOOD_BLOWS_INDEX]++;
    }
    
    /**
     * increments the count of good humans in the army.
     */
    public void incGoodHuman() {
        stats[GOOD_HUMAN_COUNT_INDEX]++;
    }
    
    /**
     * increments the count of Elves in the army.
     */
    public void incElf() {
        stats[ELF_COUNT_INDEX]++;
    }
    
    /**
     * increments the count of Ents in the army.
     */
    public void incEnt() {
        stats[ENT_COUNT_INDEX]++;
    }
    
    /**
     * increments the count of evil humans in the army.
     */
    public void incEvilHuman() {
        stats[EVIL_HUMAN_COUNT_INDEX]++;
    }
    
    /**
     * increments the count of cyber demons in the army.
     */
    public void incCyberDemon() {
        stats[CYBERDEMON_COUNT_INDEX]++;
    }
    
    /**
     * increments the count of balrogs in the army.
     */
    public void incBalrog() {
        stats[BALROG_COUNT_INDEX]++;
    }
    
    /**
     * increments the count of uruk-hai in the army.
     */
    public void incUrukHai() {
        stats[URUKHAI_COUNT_INDEX]++;        
    }

    /**
     * Displays the damage stats for a battle. Damage stats include total dmg done, and killing blows.
     */
    public void displayDamageStats() {
        System.out.println("Damage done by evil army: " + stats[EVIL_DMG_INDEX]);
        System.out.println("Killing blows by evil army: " + stats[EVIL_BLOWS_INDEX]);
        System.out.println("Damage done by good army: " + stats[GOOD_DMG_INDEX]);
        System.out.println("Killing blows by good army: " + stats[GOOD_BLOWS_INDEX]);
    }
    
    /**
     * Displays army stats for a battle. Army stats include the number of each soldier type.
     */
    public void displayArmyStats() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nGOOD ARMY:\n");
        sb.append("Humans:").append(stats[GOOD_HUMAN_COUNT_INDEX]).append("\n");
        sb.append("Elves:").append(stats[ELF_COUNT_INDEX]).append("\n");
        sb.append("Ents:").append(stats[ENT_COUNT_INDEX]).append("\n\n");
        sb.append("EVIL ARMY:\n");
        sb.append("Humans:").append(stats[EVIL_HUMAN_COUNT_INDEX]).append("\n");
        sb.append("CyberDemons:").append(stats[CYBERDEMON_COUNT_INDEX]).append("\n");
        sb.append("Balrogs:").append(stats[BALROG_COUNT_INDEX]).append("\n");
        sb.append("Uruk-Hai:").append(stats[URUKHAI_COUNT_INDEX]).append("\n");
        System.out.println(sb.toString());
    }
}
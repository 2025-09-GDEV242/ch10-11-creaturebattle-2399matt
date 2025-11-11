import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
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
    
    private final List<Creature> evilArmy;
    private final List<Creature> goodArmy;
    private int[] statTracker;

    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        evilArmy = new ArrayList<>();
        goodArmy = new ArrayList<>();
        statTracker = new int[10];
        initArmies();
    }
    
    public void war() {
        while(!evilArmy.isEmpty() && !goodArmy.isEmpty()) {
            // we can avoid shifting after every death.
            int goodIndex = goodArmy.size() - 1;
            int evilIndex = evilArmy.size() - 1;
            Creature good = goodArmy.get(goodIndex);
            Creature evil = evilArmy.get(evilIndex);
            while(good.isAlive() && evil.isAlive()) {
                int goodAttack = good.attack();
                int evilAttack = evil.attack();
                evil.takeDamage(goodAttack);
                good.takeDamage(evilAttack);
                statTracker[EVIL_DMG_INDEX] += evilAttack;
                statTracker[GOOD_DMG_INDEX] += goodAttack;
            }
            if(good.isKnockedOut()) {
                goodArmy.remove(goodIndex);
                statTracker[EVIL_BLOWS_INDEX]++;
            } else {
                evilArmy.remove(evilIndex);
                statTracker[GOOD_BLOWS_INDEX]++;
            }
        }
        if(goodArmy.isEmpty()) {
            System.out.println("SAURON WINS!\n\n");
        } else {
            System.out.println("MIDDLE-EARTH WINS!\n\n");
        }
        displayDamageStats();
        displayArmyStats();
    }
    
    private void initArmies() {
        for(int i = 0; i < 100; i++) {
            int n = Randomizer.nextInt(10);
            if(n < 7) {
                goodArmy.add(new Human());
                statTracker[GOOD_HUMAN_COUNT_INDEX]++;
            } else if (n < 9) {
                goodArmy.add(new Elf());
                statTracker[ELF_COUNT_INDEX]++;
            } else {
                goodArmy.add(new Ent());
                statTracker[ENT_COUNT_INDEX]++;
            }
        }
        for(int i = 0; i < 40; i++) {
            int n = Randomizer.nextInt(25);
            if(n <= 18) {
                evilArmy.add(new Human());
                statTracker[EVIL_HUMAN_COUNT_INDEX]++;
            } else if (n <= 24) {
                evilArmy.add(new CyberDemon());
                statTracker[CYBERDEMON_COUNT_INDEX]++;
            } else {
                evilArmy.add(new Balrog());
                statTracker[BALROG_COUNT_INDEX]++;
            }
        }
    }
    
    private void displayDamageStats() {
        System.out.println("Damage done by evil army: " + statTracker[EVIL_DMG_INDEX]);
        System.out.println("Killing blows by evil army: " + statTracker[EVIL_BLOWS_INDEX]);
        System.out.println("Damage done by good army: " + statTracker[GOOD_DMG_INDEX]);
        System.out.println("Killing blows by good army: " + statTracker[GOOD_BLOWS_INDEX]);
    }
    
    private void displayArmyStats() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nGOOD ARMY:\n");
        sb.append("Humans:").append(statTracker[GOOD_HUMAN_COUNT_INDEX]).append("\n");
        sb.append("Elves:").append(statTracker[ELF_COUNT_INDEX]).append("\n");
        sb.append("Ents:").append(statTracker[ENT_COUNT_INDEX]).append("\n\n");
        sb.append("EVIL ARMY:\n");
        sb.append("Humans:").append(statTracker[EVIL_HUMAN_COUNT_INDEX]).append("\n");
        sb.append("CyberDemons:").append(statTracker[CYBERDEMON_COUNT_INDEX]).append("\n");
        sb.append("Balrogs:").append(statTracker[BALROG_COUNT_INDEX]).append("\n");
        System.out.println(sb.toString());
    }

}
import java.util.List;
import java.util.ArrayList;
/**
 * Battle class used to simulate the GREAT battle between good and evil.
 * This class holds two lists for the armies, as well as a StatTracker object for the battle stats.
 *
 * @author Matt Witham
 * @version 11.4.25
 */
public class Battle
{   
    private final List<Creature> evilArmy;
    private final List<Creature> goodArmy;
    private StatTracker statTracker;

    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        evilArmy = new ArrayList<>();
        goodArmy = new ArrayList<>();
        statTracker = new StatTracker();
        initArmies();
    }
    
    /**
     * War method. Runs a main loop for the battle in which two oponents fight 1v1
     * until one of them dies. Once one dies, the army sends out the next soldier to fight.
     * When the battle is over, stats are displayed.
     */
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
                statTracker.addDamageToEvil(evilAttack);
                statTracker.addDamageToGood(goodAttack);
            }
            if(good.isKnockedOut()) {
                goodArmy.remove(goodIndex);
                statTracker.incEvilKills();
            } else {
                evilArmy.remove(evilIndex);
                statTracker.incGoodKills();
            }
        }
        if(goodArmy.isEmpty()) {
            System.out.println("SAURON WINS!\n\n");
        } else if (evilArmy.isEmpty()){
            System.out.println("MIDDLE-EARTH WINS!\n\n");
        } else {
            System.out.println("NOBODY WINS!\n\n");
        }
        statTracker.displayDamageStats();
        statTracker.displayArmyStats();
    }
    
    /**
     * initArmies method is used to initialize the lists holding the armies.
     */
    private void initArmies() {
        for(int i = 0; i < 100; i++) {
            int n = Randomizer.nextInt(10);
            if(n < 7) {
                goodArmy.add(new Human());
                statTracker.incGoodHuman();
            } else if (n < 9) {
                goodArmy.add(new Elf());
                statTracker.incElf();
            } else {
                goodArmy.add(new Ent());
                statTracker.incEnt();
            }
        }
        for(int i = 0; i < 40; i++) {
            int n = Randomizer.nextInt(25);
            if(n <= 12) {
                evilArmy.add(new Human());
                statTracker.incEvilHuman();
            } else if (n <= 18) {
                evilArmy.add(new UrukHai());
                statTracker.incUrukHai();
            } else if (n <= 24) {
                evilArmy.add(new CyberDemon());
                statTracker.incCyberDemon();
            } else {
                evilArmy.add(new Balrog());
                statTracker.incBalrog();
            }
        }
    }

}
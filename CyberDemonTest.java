

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CyberDemonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CyberDemonTest
{
    private CyberDemon cyberDemon;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        cyberDemon = new CyberDemon();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        cyberDemon = null;
    }
    
    @Test
    public void testDeath() {
        cyberDemon.takeDamage(cyberDemon.getHealth());
        assertEquals(true, cyberDemon.isKnockedOut());
    }
    
    @Test
    public void testAlive() {
        cyberDemon.takeDamage(cyberDemon.getHealth() / 2);
        assertEquals(true, cyberDemon.isAlive());
    }
}
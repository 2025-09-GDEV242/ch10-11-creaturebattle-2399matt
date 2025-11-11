

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BalrogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BalrogTest
{
    private Balrog balrog;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        balrog = new Balrog();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        balrog = null;
    }
    
    @Test
    public void testDeath() {
        balrog.takeDamage(balrog.getHealth());
        assertEquals(false, balrog.isAlive());
    }
    
    @Test
    public void testAlive() {
        balrog.takeDamage(balrog.getHealth() / 2);
        assertEquals(true, balrog.isAlive());
    }
}
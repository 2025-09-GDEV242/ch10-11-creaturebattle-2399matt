

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EntTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EntTest
{
    private Ent ent;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        ent = new Ent();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        ent = null;
    }
    
    @Test
    public void testDeath() {
        ent.takeDamage(ent.getHealth());
        assertEquals(true, ent.isKnockedOut());
    }
    
    @Test
    public void testAlive() {
        ent.takeDamage(ent.getHealth() / 2);
        assertEquals(true, ent.isAlive());
    }
}
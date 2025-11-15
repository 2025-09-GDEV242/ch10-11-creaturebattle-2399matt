

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class UrukHaiTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UrukHaiTest
{
    private UrukHai urukHai;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        urukHai = new UrukHai();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        urukHai = null;
    }
    
    @Test
    public void testDeath() {
        urukHai.takeDamage(urukHai.getHealth());
        assertEquals(true, urukHai.isKnockedOut());
    }
    
    @Test
    public void testAlive() {
        urukHai.takeDamage(urukHai.getHealth() / 2);
        assertEquals(true, urukHai.isAlive());
    }
}
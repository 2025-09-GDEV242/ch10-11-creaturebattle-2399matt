

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElfTest.
 *
 * @author  Matt Witham
 * @version 11.10.25
 */
public class ElfTest
{
    private Elf elf;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        elf = new Elf();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        elf = null;
    }
    
    @Test
    public void testIsDead() {
        elf.takeDamage(elf.getHealth());
        assertEquals(true, elf.isKnockedOut());
    }
    
    @Test
    public void testIsAlive() {
        elf.takeDamage(elf.getHealth() / 2);
        assertEquals(true, elf.isAlive());
    }
}

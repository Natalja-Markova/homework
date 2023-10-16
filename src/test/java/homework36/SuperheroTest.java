package homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {
    private Superhero superhero;

    @BeforeEach
    void setUp() {
        superhero=new Superhero("Halk", 5, 45);
    }

    @Test
    void testConstructor() {
        assertEquals("Halk", superhero.getName());
        assertEquals(5, superhero.getPower());
        assertEquals(45, superhero.getAge());
    }

    @Test
    void testGetName() {
        assertEquals("Halk", superhero.getName());

    }

    @Test
    void testGetPower() {
        assertEquals(5, superhero.getPower());
    }

    @Test
    void testGetAge() {
        assertEquals(45, superhero.getAge());
    }
}
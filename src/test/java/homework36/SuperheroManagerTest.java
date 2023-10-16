package homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroManagerTest {
    private SuperheroManager superheroManager;

    @BeforeEach
    void setUp() {
        superheroManager=new SuperheroManager();
        superheroManager.addSuperhero(new Superhero("Halk",5,45));
    }

    @Test
    void testAddSuperhero() {
        Superhero superman = new Superhero("Superman", 7, 35);
        Superhero batman = new Superhero("Batman", 8, 40);
        superheroManager.addSuperhero(superman);
        superheroManager.addSuperhero(batman);
        assertEquals(3,superheroManager.getAllSuperheroes().size());
        assertEquals(superman,superheroManager.getSuperhero("Superman"));

    }

    @Test
    void testRemoveSuperhero() {
        Superhero superman = new Superhero("Superman", 7, 35);
        Superhero batman = new Superhero("Batman",8, 40);
        Superhero spiderman = new Superhero("Spiderman", 10, 25);

        superheroManager.addSuperhero(superman);
        superheroManager.addSuperhero(batman);
        superheroManager.addSuperhero(spiderman);

        superheroManager.removeSuperhero("Batman");

        assertFalse(superheroManager.getAllSuperheroes().contains(batman));
        assertEquals(3, superheroManager.getAllSuperheroes().size());

    }

    @Test
    void getSuperhero() {
        Superhero superman = new Superhero("Superman", 7, 35);
        Superhero batman = new Superhero("Batman", 8, 40);
        superheroManager.addSuperhero(superman);
        superheroManager.addSuperhero(batman);

        Superhero foundSuperman = superheroManager.getSuperhero("Superman");
        Superhero foundBatman = superheroManager.getSuperhero("Batman");
        Superhero notFound = superheroManager.getSuperhero("Spiderman");

        assertEquals(superman, foundSuperman);
        assertEquals(batman, foundBatman);
        assertNull( notFound);
    }

    @Test
    void getAllSuperheroes() {
        Superhero superman = new Superhero("Superman", 7, 35);
        Superhero batman = new Superhero("Batman", 8, 40);
        superheroManager.addSuperhero(superman);
        superheroManager.addSuperhero(batman);
        assertEquals(3,superheroManager.getAllSuperheroes().size());


    }
    @Test
    void testUpdateSuperhero() {
        Superhero superman = new Superhero("Superman", 7, 35);
        Superhero batman = new Superhero("Batman", 8, 40);

        superheroManager.addSuperhero(superman);
        superheroManager.addSuperhero(batman);

        Superhero updatedBatman = new Superhero("Updated Batman", 10, 25);
        superheroManager.updateSuperhero("Batman", updatedBatman);

        Superhero foundBatman = superheroManager.getSuperhero("Updated Batman");
        assertNull(superheroManager.getSuperhero("Batman"));
        assertEquals(updatedBatman, foundBatman);
    }
}
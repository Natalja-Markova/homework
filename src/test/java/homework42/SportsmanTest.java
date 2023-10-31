package homework42;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SportsmanTest {
    private Sportsmen sportsman;

    @Before
    public void setUp() {
        sportsman = new Sportsmen("Alex", 25, "Swimming", 100);
    }

    @Test
    public void testCreateSportsman() {
        assertEquals("Alex", sportsman.getName());
        assertEquals(25, sportsman.getAge());
        assertEquals("Swimming", sportsman.getSport());
        assertEquals(100, sportsman.getRecords());
    }



    public void testUpdateRecordGreater() {
        sportsman.updateRecord(95);
        assertEquals(100, sportsman.getRecords());}

    @Test
    public void testUpdateRecordLessOrEqual() {
        sportsman.updateRecord(90);
        assertEquals(100, sportsman.getRecords());
    }

    @Test
    public void testGettersAndSetters() {
        sportsman.setName("Natalja");
        sportsman.setAge(30);
        sportsman.setSport("Running");
        sportsman.setRecords(200);

        assertEquals("Natalja", sportsman.getName());
        assertEquals(30, sportsman.getAge());
        assertEquals("Running", sportsman.getSport());
        assertEquals(200, sportsman.getRecords());
    }

    @Test
    public void testToString() {
        String expected = "Sportsmen{name='Alex', age=25, sport='Swimming', records=100}";
        assertEquals( expected, sportsman.toString());
    }

    @Test
    public void testIsEligibleForCompetition() {
        assertTrue(sportsman.isEligibleForCompetition(20, 30)); // Age is within the range.
        assertFalse(sportsman.isEligibleForCompetition(30, 40)); // Age is not within the range.
    }
}












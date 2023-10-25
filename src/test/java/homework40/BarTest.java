package homework40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BarTest {
    private Bar myBar;
    @BeforeEach
    void setUp() {
        myBar=new Bar();
       Drink mohito= new Drink("Mohitto","Alcohol",350);
       myBar.addDrink("100",mohito);
    }

    @Test
    void addDrink() {
        assertEquals(1,myBar.bar.size());
        myBar.addDrink("1",new Drink("Shipment","Alcohol",150));
        assertEquals(2,myBar.bar.size());
        assertFalse(myBar.addDrink("1",new Drink("Shipment","Alcohol",150)));
        assertTrue(myBar.addDrink("2",new Drink("BEER","Alcohol",550)));
    }

    @Test
    void getDrink() {
        assertNull(myBar.getDrink("520"));
        assertThat(myBar.getDrink("100"),instanceOf(Drink.class));
    }
}
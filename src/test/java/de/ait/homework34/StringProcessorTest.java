package de.ait.homework34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {
    private StringProcessor stringProcessor;

    @BeforeEach
    public void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void testConcatenate() {
       assertEquals ("Hi Nata",
              stringProcessor.concatenate("Hi"," Nata") );

    }

    @Test
    public void  testgetLenght() {
        assertEquals(7, stringProcessor.getLength("Hi Nata"));
    }

    @Test
    public void  testrevers() {
        assertEquals("asor",
                stringProcessor.reverse("rosa"));
    }

    @Test
    public void testisPalindrome() {
        assertEquals(
                true, stringProcessor.isPalindrome("madam"));
    }
}

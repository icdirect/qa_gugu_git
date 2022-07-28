package guru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    public void assertTrueTest() {
        assertTrue(3 > 1);
    }

    @Test
    public void assertFalseTest() {
        assertTrue(3 < 2);
    }
}

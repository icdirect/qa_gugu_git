package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleTest {

    @Test
    public void assertTrueTest() {
        assertTrue(3 > 1);

    }

    @Test
    public void assertFalseTest() {
        assertTrue(3 < 2);
    }

    @Test
    public void assertAnotherFailTest() {
        fail("another fail");
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testTest() {
        assertEquals(4,4);
    }

    @Test
    public void testFail() {
        assertEquals(0,1);
    }
}

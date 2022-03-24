package biz.seal.inlupp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class URLHandlerTest {

    /*@Test
    public void invalidURL() {
        assertThrows(Throwable.class, () -> {
            URLHandler uh = new URLHandler("http://ddfgfghfghfgf");
        });
    }*/

    @Test
    public void validURL() {
        assertDoesNotThrow(() -> {
            URLHandler uh = new URLHandler("http://google.com");
        });
    }
}

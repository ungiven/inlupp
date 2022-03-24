package biz.seal.inlupp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JSONHandlerTest {

    @Test
    public void invalidJSONString() {
        assertThrows(Throwable.class, () -> {
            JSONHandler jh = new JSONHandler("asdf");
        });
    }

    @Test
    public void emptyJSONArray() {
        assertDoesNotThrow(() -> {
            JSONHandler jh = new JSONHandler("[]");
        });
    }


    @Test
    public void nonEmptyJSONArray() {
        assertDoesNotThrow( () -> {
            JSONHandler jh = new JSONHandler("[{\"A\": \"1\"}]");
        });

        assertDoesNotThrow( () -> {
            JSONHandler jh = new JSONHandler("[{\"A\": \"1\"}, {\"B\": \"2\"}]");
        });
    }
}

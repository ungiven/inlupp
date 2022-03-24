package biz.seal.inlupp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GSApiTest {

    private final String sheetId = "15VgWlDG02w56AyuvNn8pij0fTk1pSbnuZ144XhHyJyg";
    private final String sheetName = "live";
    private final GSApi api = new GSApi(this.sheetId, this.sheetName);

    @Test
    public void getRowSuccess() {
        assertDoesNotThrow(() -> {
            String row = api.getRow(0);
        });

        assertEquals(api.getRow(0), "{\"Value\":\"hej\",\"Id\":\"0\"}");
    }

    @Test
    public void getRowFail() {
        assertThrows(Throwable.class, () -> {
            api.getRow(-1);
        });
    }
}

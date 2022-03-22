import java.util.Arrays;
import java.util.Scanner;

public class IOHandler {

    private GSApi api;
    private String[] keywords = {"help", "exit", "get <N>"};
    private Scanner console;

    public IOHandler(GSApi api) {
        this.api = api;
        this.console = new Scanner(System.in);
    }

    public String read() {
        String userInput = console.nextLine();
        return this.handle(userInput);
    }

    public String handle(String userInput) {
        String[] splitInput = userInput.split(" ");

        try {
            if (splitInput[0].equals("exit")) {
                System.exit(0);
            }

            if (splitInput[0].equals("get")) {
                return this.api.getRow(Integer.parseInt(splitInput[1]));
            }

        } catch (Exception e) {
            return "ERROR: " + e;
        }

        return "Available commands: " + this.getKeywords();
    }

    public String getKeywords() {
        return Arrays.toString(this.keywords);
    }
}

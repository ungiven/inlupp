import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputHandler {

    private GSApi api;
    private ArrayList<String> history;
    private String[] keywords = {"help", "exit", "get <N>", "put <N>"};
    private Scanner console;

    public InputHandler(GSApi api) {
        this.history = new ArrayList<String>();
        this.api = api;
        this.console = new Scanner(System.in);

    }

    public String read() {
        String userInput = console.nextLine();
        //System.out.println(userInput);

        return this.handle(userInput);

    }

    public String handle(String userInput) {
        String[] splitInput = userInput.split(" ");

        try {
            if (splitInput[0].equals("exit")) {
                System.exit(0);
            }

            if (splitInput[0].equals("get")) {
                //System.out.println("get gotten: " + splitInput[1]);

                //System.out.println(this.api.getRow(Integer.parseInt(splitInput[1])));
                return this.api.getRow(Integer.parseInt(splitInput[1]));
            }

            if (splitInput[0].equals("put")) {
                //System.out.println("put" + splitInput[1]);
                return "put" + splitInput[1];
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

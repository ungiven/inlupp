package biz.seal.inlupp;

import java.util.Arrays;
import java.util.Scanner;

public class IOHandler {

    private GSApi api;
    private String[] keywords = {"help", "exit", "get <N>", "all"};
    private Scanner console;

    public IOHandler(GSApi api) {
        this.api = api;
        this.console = new Scanner(System.in);
    }

    public void read() {
        String userInput = this.console.nextLine();
        System.out.println(this.handle(userInput));
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

            if (splitInput[0].equals("all")) {
                return this.api.getData();
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

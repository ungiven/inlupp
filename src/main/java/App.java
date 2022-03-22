public class App {

    public static void main(String[] args) {

        GSApi api = new GSApi("15VgWlDG02w56AyuvNn8pij0fTk1pSbnuZ144XhHyJyg", "live");
        IOHandler io = new IOHandler(api);

        while(true) {
            System.out.println(io.read());
        }
    }
}

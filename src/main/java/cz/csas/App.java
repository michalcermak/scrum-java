package cz.csas;

/**
 * Hell or world!
 */
public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.setup();
        game.play();
    }

    public static String getHelloMessage() {
        return "Hello, world!";
    }
}


package game;

public class MainApp {
    public MainApp() {
    }

    public static void main(String[] args) {
        Game game = new Game();
        Fighter fighterPlayer = new Fighter();
        Fighter fighterBot = new Fighter("BOT");
        game.greetings(fighterPlayer);
        game.gameLoop(fighterPlayer, fighterBot);
    }
}


package game;

import java.util.Arrays;

public class MainApp {
    public MainApp() {
    }

    public static void main(String[] args) {
        Game game = new Game();
        Fighter fighterPlayer = new Fighter();
        Fighter fighterBot = new Fighter("BOT");
        System.out.print("Downloading the game ");
        for (int i = 0; i <= 3; i ++) {
            System.out.print(".");
            game.wait(1000);
        }
        game.greetings(fighterPlayer);
        game.gameLoop(fighterPlayer, fighterBot);


    }
}




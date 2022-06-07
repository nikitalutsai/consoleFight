package game;

import java.util.Scanner;

public class Game {
    byte rounds;

    public Game() {
    }


    public void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void greetings(Fighter player) {
        System.out.println("");
        System.out.println("Bienvenido al juego de java!");
        System.out.println("Cuál es tu nombre guerrero?: ");
        Scanner nameOfPlayer = new Scanner(System.in);
        player.name = nameOfPlayer.nextLine();
        System.out.println("Cuantas partidas estás dispuesto a jugar?");
        Scanner roundsToPlay = new Scanner(System.in);
        this.rounds = roundsToPlay.nextByte();
        System.out.println("-------------------------------");
        System.out.println("Tu nombre es: " + player.name);
        System.out.println("Has elegido jugar : " + this.rounds + " partidas.");
    }

    public void gameLoop(Fighter player, Fighter bot) {
        for(int i = this.rounds; i > 0; --i) {
            while(player.hp > 0 && bot.hp > 0) {
                System.out.println("La partida a comenzado! Prepara la espada!");
                int playerAttack = player.playerAttack();
                int playerDefense = player.playerDefense();
                int botAttack = bot.botAttack();
                int botDefense = bot.botDefense();
                System.out.println("Tu ataque es: %s,\nTu defensa es: %s,\nAtaque de bot es: %s,\nDefensa de bot es: %s,\n".formatted(new Object[]{player.attackOfPlayer, player.defenceOfPlayer, bot.attackOfBot, bot.defenceOfBot}));
                if (playerAttack == botDefense) {
                    System.out.println("No has podido hacerle daño, el bot ha defendido.");
                } else {
                    System.out.println("Tu has atacado con éxito");
                    bot.hp -= 2;
                }

                if (botAttack == playerDefense) {
                    System.out.println("Tu has defendido el ataque!");
                } else {
                    System.out.println("No has podido defenderte! El bot ha atacado con éxito");
                    player.hp -= 2;
                }

                System.out.println("Después de esa ronda te queda " + player.hp + " hp.");
                System.out.println("Después de esa ronda al bot le queda " + bot.hp + " hp.");
            }

            if (player.hp > bot.hp) {
                System.out.println(player.name + " Ganado");
                System.out.println("*************************");
                player.resetHp();
                bot.resetHp();
            } else if (bot.hp > player.hp) {
                System.out.println(bot.name + " Ganado");
                System.out.println("*************************");
                player.resetHp();
                bot.resetHp();
            } else {
                System.out.println("Tie!");
                System.out.println("*************************");
                player.resetHp();
                bot.resetHp();
            }
        }

    }
}

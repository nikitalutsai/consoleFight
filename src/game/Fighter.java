package game;

import java.util.Random;
import java.util.Scanner;

public class Fighter {
    String name;
    int hp = 6;
    String attackOfPlayer;
    String defenceOfPlayer;
    String attackOfBot;
    String defenceOfBot;

    public Fighter() {
    }

    public Fighter(String name) {
        this.name = name;
    }

    public int playerAttack() {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------\n");
        System.out.println("Ataca! (Elige entre: cabeza, cuerpo, piernas.)");
        System.out.println("1 - Cabeza");
        System.out.println("2 - Cuerpo");
        System.out.println("3 - Piernas");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                this.attackOfPlayer = "[ 1 ] - Ataca! Cabeza";
                break;
            case 2:
                this.attackOfPlayer = "[ 2 ] - Ataca! Cuerpo";
                break;
            default:
                this.attackOfPlayer = "[ 3 ] - Ataca! Piernas";
        }

        return selection;
    }

    public int playerDefense() {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------\n");
        System.out.println("Defiendete! (Elige entre: cabeza, cuerpo, piernas.)");
        System.out.println("1 - Defiende Cabeza");
        System.out.println("2 - Defiende Cuerpo");
        System.out.println("3 - Defiende Piernas");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                this.defenceOfPlayer = "[ 1 ] - Defiende Cabeza";
                break;
            case 2:
                this.defenceOfPlayer = "[ 2 ] - Defiende Cuerpo";
                break;
            default:
                this.defenceOfPlayer = "[ 3 ] - Defiende Piernas";
        }

        return selection;
    }

    public int botAttack() {
        Random randomBot = new Random();
        int selection = randomBot.nextInt(3) + 1;
        switch (selection) {
            case 1:
                this.attackOfBot = "[ 1 ] - Cabeza";
                break;
            case 2:
                this.attackOfBot = "[ 2 ] - Cuerpo";
                break;
            default:
                this.attackOfBot = "[ 3 ] - Piernas";
        }

        return selection;
    }

    public int botDefense() {
        Random randomBot = new Random();
        int selection = randomBot.nextInt(3) + 1;
        switch (selection) {
            case 1:
                this.defenceOfBot = "[ 1 ] - Defiende Cabeza";
                break;
            case 2:
                this.defenceOfBot = "[ 2 ] - Defiende Cuerpo";
                break;
            default:
                this.defenceOfBot = "[ 3 ] - Defiende Piernas";
        }

        return selection;
    }

    public void resetHp() {
        this.hp = 6;
    }
}

package deepslater.dishonoredmutator;

import deepslater.dishonoredmutator.game.Game;
import deepslater.dishonoredmutator.game.GameList;

import java.util.Random;
import java.util.Scanner;

public class DishonoredMutator {
    public static final Random RANDOM = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Deepslater's Dishonored mutator.");
        System.out.println("This program will help you choose a build for your next playthrough.");
        while (true) {
            System.out.println("Please select a game.");
            // System.out.println("Enter 'D1', 'KoD', 'TBW', 'D2', or 'DoTO'.");
            System.out.println("Enter 'D2' for Dishonored 2.");

            String input = scanner.next();
            scanner.nextLine();
            Game selectedGame;
            try {
                selectedGame = GameList.getGame(input.trim().toLowerCase());
                if (selectedGame == null) {throw new Exception();}
            } catch (Exception e) {
                System.out.println("Game not recognized.");
                continue;
            }

            System.out.println("You have selected " + input);
            selectedGame.generate();

            System.out.println("Generate again? Enter 'y'. Any other input exits program.");
            String input1 = scanner.next();
            if (!input1.equalsIgnoreCase("y")) {
                scanner.close();
                break;
            }
        }
        System.exit(0);
    }

    public static int getRandomNumber(int bound) {
        return RANDOM.nextInt(bound);
    }
}

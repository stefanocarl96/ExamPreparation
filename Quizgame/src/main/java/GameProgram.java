package tech.bts.Quizgame;

import java.util.Scanner;

public class GameProgram {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        System.out.println("What's your name?");
        game.setUserName(scanner.nextLine());

        while (true) {
            System.out.println("Hi" + game.getUserName() + "Do you want to start? [Yes/No]");
            if (scanner.nextLine().toUpperCase().equals("YES")) {
                game.getQuizzes();
                game.checkPoints();
                break;
            } else {
                break;
            }
        }
    }
}


import java.util.Random;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        GameBrain java = new GameBrain();
        Player jav2 = new Player();
        String[] think = {"abruptly","absurd","abyss","affix","askew","azure","bikini","bookworm","buzzing","buffoon","duplex","equip","dizzying","faking","crypt" ,
                "embezzle","flapjack","flyby","fixable","galaxy","gossip","hyphen","injury","ivory","ivy","jaywallk","gameofthrones","ovary","puppy","quips","staff","strength","subway","unknown"};
        int attempts = 0;
        boolean ready = true;
        while (ready) {
            java.welcome();
            java.confirmation();
            int confirm = 0;
            while (confirm==0) {
                try {
                    confirm = sc.nextInt();
                } catch (Exception e) {
                    System.err.println("Invalid option. Select 1 or 2");
                    sc.nextLine();
                }
            }

            if (confirm==2) {
                break;
                //  }else if (confirm>2){
                //    System.err.print("Invalid input\n");
                //  continue;

            }
            java.mode();
            jav2.helpMe();
            jav2.exit();
            int modes = 0;
            while (modes==0) {
                try {
                    modes = sc.nextInt();
                } catch (Exception e) {
                    System.err.println("Invalid option. Select 1, 2, 3 or 4");
                    sc.nextLine();
                }
            }
            sc.nextLine();
            if (modes == 1) {
                attempts = 8;
            } else if (modes==2) {
                attempts = 6;
            } else if (modes==4){
                break;
            }
            else if (modes==3){
                System.err.println("The procedure of this game is that you need to guess some missing letters to win the game. You can play the game in two different modes"
                        +"\"Hard\" (you will get 6 chances for winning the game )"+"\"Moderate\"(You will you will get 6 chances for winning the game )"+"\n Hope I could Have help you");
                continue;
            }

            char[] byLuck = think[rnd.nextInt(think.length)].toCharArray();
            char[] guessesFromUser = new char[byLuck.length];
            for (int i = 0; i < guessesFromUser.length; i++) {
                guessesFromUser[i] = '_';
            }

            boolean numberOfGuess = false;
            int attempts2 = 0;
            while (!numberOfGuess && attempts2 != attempts) {
                showUp(guessesFromUser);
                System.out.printf("You have %d tries left. \n", attempts - attempts2);
                System.out.println("Enter a single character");
                String input = sc.nextLine();
                if(input.length()>0) {
                    char entry = Character.toLowerCase(input.charAt(0));
                    if (entry == '-') {
                        ready = false;
                        numberOfGuess = true;
                    } else {
                        boolean bingo = false;
                        for (int i = 0; i < byLuck.length; i++) {
                            if (byLuck[i] == entry) {
                                guessesFromUser[i] = entry;
                                bingo = true;
                            }
                        }
                        if (bingo == false) {
                            attempts2++;
                        }
                    }
                } else {
                    System.out.println("!!! Letter not valid !!!");
                }
                if (didYouGetIt(guessesFromUser)) {
                    numberOfGuess = true;
                    showUp(guessesFromUser);
                    System.out.println("Congratulations you won the game ");
                    java.Data();
                    java.setOpinion();
                    java.getData();
                    java.getOpinion();


                }
            }
            if (!numberOfGuess)
                System.out.println("Out of attempts");
            java.restart();
            int oneMoreTime = sc.nextInt();
            if (oneMoreTime==2){
                break;

            }
        }
        System.out.printf("ByeBye");
    }
    public static void showUp(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean didYouGetIt(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') return false;
        }
        return true;
    }
}

package Assingment1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String [] boxOfWords = {"Awkward","Bagpipes","Croquet","Game of thrones","Netflix"};

        System.out.println("Welcome to the Hangman Game");
        System.out.println("Are you ready to begin this fun adventure? (yes/no)");
        boolean user = true;
        while (user){
            String userInput = sc.nextLine();
            char [] words = boxOfWords[rnd.nextInt(boxOfWords.length)].toCharArray();
            int numberOfGuess = words.length;
            char[] userIdea = new char[numberOfGuess];

            if (userInput.equalsIgnoreCase("No"))
                System.out.println("Good bye hope to have you back soon");
            break;


        }



    }
    public static void display(String [] ali){
        for (int i =0; i<ali.length;i++){
            System.out.print(ali[i]+" ");
        }
    }
}

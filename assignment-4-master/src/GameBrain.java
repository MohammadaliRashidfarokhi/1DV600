

import java.util.Scanner;

public class GameBrain extends Player {
    Scanner sc = new Scanner(System.in);

    public void welcome() {
        System.out.printf("Welcome to the hangMan Game\n");
    }

    public void confirmation() {
        System.out.printf("Are you ready to begin?\n (1.continue /2. Exit) ");
    }

    public void mode() {
        System.out.println("Choose one the followings modes:" + "\n 1. Moderate\t 2. Hard ");
    }

    public void restart() {
        System.out.println("Do you want to play again? 1. Yes/ 2.No");
    }

    public void Data() {
        System.out.println("PLease enter your name ");
        String name = sc.nextLine();
        setName(name);

        System.out.println("PLease enter your Age ");
        int age = sc.nextInt();
        setAge(age);

        boolean dateIsInvalid = true;
        while (dateIsInvalid) {
            System.out.println("PLease enter the date: ");
            System.out.println("Year");
            int year = sc.nextInt();
            System.out.println("Month");
            int month = sc.nextInt();
            System.out.println("Day");
            int day = sc.nextInt();
            try {
                setDate(year, month, day);
                dateIsInvalid = false;
            } catch (Exception e) {
                System.out.println("Please enter the date correctly");
            }
        }
    }

    public void getData() {
        System.out.println("Your name is: " + getName());
        System.out.println("your are " + getAge() + " " + "years old");
        System.out.println("The date is: " + getDate());
        System.out.println("Dear " + " " + getName() + " "+"\"Congratulations\" You won" +"\nThank you for playing the game");
    }

    public void setOpinion() {
        System.out.println("What was your opinion about the game?");
        String feedBack = sc.nextLine();
        System.out.println("Your opinion about the game is:");
        sc.nextLine();

        setSurvey(feedBack);
    }
    public void getOpinion(){
        getSurvey();
    }

}
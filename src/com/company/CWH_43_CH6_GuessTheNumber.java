package com.company;
import java.util.Scanner;
import java.util.Random;
//        Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!
class Game{
    public enum GameResult {
        CORRECT, VERY_CLOSE, NEAR, FAR, VERY_FAR, OUTSIDE_RANGE;
    }
    private final int  randomNumber;
    private int userInput;
    Game(){
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100);
        System.out.println(this.randomNumber);
    }

    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        this.userInput = sc.nextInt();
        return this.userInput;
    }

    public GameResult isCorrectNumber(int userInput){
        //1. Correct Guess
        //2. you are very far away from number, range above 80
        //3. you are far away from the number, range between 40-80
        //4. you are near to the number, range between 10-40
        //5. you are very close to the number, range between 1-10
        if(userInput < 0 || userInput > 100) {
            return GameResult.OUTSIDE_RANGE;
        }
        int difference = Math.abs(userInput - this.randomNumber);
        //System.out.println("diff: "+ difference);
        if(difference == 0){
            return GameResult.CORRECT;
        } else if(difference >=80 ){
            return GameResult.VERY_FAR;
        } else if(difference >=40){
            return GameResult.FAR;
        } else if(difference >=10){
            return GameResult.NEAR;
        } else {
            return GameResult.VERY_CLOSE;
        }
    }
}

public class CWH_43_CH6_GuessTheNumber {
    public static void main(String[] args) {
        Game g1;
        int userInput;
        Game.GameResult isCorrectNumber;
        int noOfChances;
        char choice = 'y';
        Scanner scanner = new Scanner(System.in);
        do {
            noOfChances = 0;
            g1 = new Game();
            do {
                userInput = g1.takeUserInput();
                isCorrectNumber = g1.isCorrectNumber(userInput);
                switch(isCorrectNumber){
                    case OUTSIDE_RANGE :
                        System.out.println("Please enter the number in b/w 1-100");
                        break;
                    case CORRECT :
                        System.out.println("Your guess is correct!!!");
                        break;
                    case VERY_FAR :
                        System.out.println("you are very far away from number. Please try another chance");
                        break;
                    case FAR :
                        System.out.println("you are far away from number. Please try another chance");
                        break;
                    case NEAR :
                        System.out.println("you are near to number. Please try another chance");
                        break;
                    case VERY_CLOSE :
                        System.out.println("you are very close to number. Please try another chance");
                        break;
                    default:
                        System.out.println("Undefined error:" + isCorrectNumber);
                        break;
                }
                noOfChances++;
            } while (isCorrectNumber != Game.GameResult.CORRECT);
            System.out.println("No of chances: " + noOfChances);
            System.out.println("Do you want to continue (y/n)");
            choice = scanner.next().charAt(0);

        } while (choice == 'y');

    }
}

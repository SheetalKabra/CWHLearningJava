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
        CORRECT, VERY_CLOSE_EVEN, VERY_CLOSE_ODD, NEAR_UPWARDS, NEAR_DOWNWARDS, FAR, VERY_FAR, OUTSIDE_RANGE;
    }
    private final int  randomNumber;
    Game(){
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100);
        //System.out.println(this.randomNumber);
    }

    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        return sc.nextInt();
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
            return this.randomNumber - userInput > 0 ?  GameResult.NEAR_UPWARDS : GameResult.NEAR_DOWNWARDS;
        } else {
            return this.randomNumber % 2 == 0 ? GameResult.VERY_CLOSE_EVEN : GameResult.VERY_CLOSE_ODD;
        }
    }

    public int playGame(){
        Game.GameResult isCorrectNumber;
        int noOfChances = 0;
        do {
            int userInput = takeUserInput();
            isCorrectNumber = isCorrectNumber(userInput);
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
                case NEAR_UPWARDS :
                    System.out.println("Go upwards, you are near to number. Please try another chance");
                    break;
                case NEAR_DOWNWARDS :
                    System.out.println("Go downwards, you are near to number. Please try another chance");
                    break;
                case VERY_CLOSE_EVEN :
                    System.out.println("No is even, you are very close to number. Please try another chance");
                    break;
                case VERY_CLOSE_ODD :
                    System.out.println("No is odd, you are very close to number. Please try another chance");
                    break;
                default:
                    System.out.println("Undefined error:" + isCorrectNumber);
                    break;
            }
            noOfChances++;
        } while (isCorrectNumber != Game.GameResult.CORRECT);
        return noOfChances;
    }
}

public class CWH_43_CH6_GuessTheNumber {
    public static void main(String[] args) {
        Game g1;
        char choice = 'y';
        Scanner scanner = new Scanner(System.in);
        do {
            g1 = new Game();
            int gameOp = g1.playGame();
            System.out.println("No of chances: " + gameOp);
            System.out.println("Do you want to continue (y/n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y');

    }
}

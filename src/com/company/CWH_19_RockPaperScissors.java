package com.company;
import java.util.Random;
import java.util.Scanner;

public class CWH_19_RockPaperScissors {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Scissor Paper Game:");
        System.out.println("This game will be in between computer and you. First you will enter the number in between 0 to 2, then computer will enter. On the basis of output we will decide the result.");
        System.out.println("Below are the following meaning of the number:");
        System.out.println("Rock - 0");
        System.out.println("Paper - 1");
        System.out.println("Scissor - 2");
        //System.out.println("Game description: It has three possible outcomes: a draw, a win or a loss. \nA player who decides to play rock will beat another player who has choosen scissor but will lose to one who has choosen paper.\nA play of paper will lose to a play of scissors.");
        int playerSuccessCount = 0;
        int computerSuccessCount = 0;
        for(int i=1; i<=5; i++) {
            System.out.println("Chance " + i);
            System.out.print("Please enter the number: ");
            int playerNum = sc.nextInt();
            int computerNum = rand.nextInt(3);
            System.out.println("Computer number: " + computerNum);
            int result = getResult(playerNum, computerNum);
            switch (result) {
                case 0:
                    System.out.println("Draw");
                    break;
                case 1:
                    System.out.println("You wins!!!");
                    playerSuccessCount += 1;
                    break;
                case 2:
                    System.out.println("You lose!!!");
                    computerSuccessCount += 1;
                    break;
                default:
                    System.out.println("Something went wrong!!!");
                    break;
            }
        }
        if(playerSuccessCount > computerSuccessCount){
            System.out.println("You win this game with "+playerSuccessCount+" chances.");
        }else if(playerSuccessCount < computerSuccessCount){
            System.out.println("You lose this game with "+computerSuccessCount+" chances.");
        }else if(playerSuccessCount == computerSuccessCount){
            System.out.println("This game has been draw.");
        }

    }

    public static int getResult(int playerNum, int computerNum){
        // 0 - Draw, 1 - player wins, 2 - player lose
        if(playerNum == 0){
            if(computerNum == 0){
                //System.out.println("Draw");
                return 0;
            }else if(computerNum == 1){
                //System.out.println("You lose!!!");
                return 2;
            }else{
                //System.out.println("You Wins!!!");
                return 1;
            }
        }else if(playerNum == 1){
            if(computerNum == 0){
                //System.out.println("You Wins!!!");
                return 1;
            }else if(computerNum == 1){
                //System.out.println("Draw");
                return 0;
            }else{
                //System.out.println("You lose!!!");
                return 2;
            }
        }else{
            if(computerNum == 0){
                //System.out.println("You lose!!!");
                return 2;
            }else if(computerNum == 1){
                //System.out.println("You wins!!!");
                return 1;
            }else{
                //System.out.println("Draw");
                return 0;
            }
        }
    }
}

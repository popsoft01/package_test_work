package com.charpterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGame {
    public static class CrapsWithWager {

        private static final SecureRandom randomNumbers = new SecureRandom();

        private enum Status {CONTINUE, WON, LOST}


        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;


        public static void main(String[] args) {
            int myPoint = 0;
            Status gameStatus;
            int playFlag;
            int bankBalance = 1000;
            int wager = 0;

            Scanner input = new Scanner(System.in);

            do {
                System.out.print("Draw a double game, please press 1 to start the game (input -1 to exit the game):");
                playFlag = input.nextInt();
                if (playFlag == -1) {
                    System.out.print("Exited Program");
                    break;
                }
                chat();
                System.out.printf("Your current balance is %d, please enter the bet amount (integer, enter -1 to exit the game):", bankBalance);
                wager = input.nextInt();
                while (wager < 0 || wager > bankBalance) {
                    System.out.print("Please enter a valid bet amount:");
                    wager = input.nextInt();
                }

                int sumOfDice = rollDice();


                switch (sumOfDice) {
                    case SEVEN, YO_LEVEN -> {
                        gameStatus = Status.WON;
                        bankBalance += wager;
                    }
                    case SNAKE_EYES, TREY, BOX_CARS -> {
                        gameStatus = Status.LOST;
                        if (bankBalance - wager >= 0)
                            bankBalance -= wager;
                        else
                            bankBalance = 0;
                    }
                    default -> {
                        gameStatus = Status.CONTINUE;
                        myPoint = sumOfDice;
                        System.out.printf("Oh, tie! Points: %d%n", myPoint);
                    }
                }


                while (gameStatus == Status.CONTINUE) {
                    sumOfDice = rollDice();


                    if (sumOfDice == myPoint) {
                        gameStatus = Status.WON;
                        bankBalance += wager;
                    } else {
                        if (sumOfDice == SEVEN) {
                            gameStatus = Status.LOST;
                            if (bankBalance - wager >= 0)
                                bankBalance -= wager;
                            else
                                bankBalance = 0;
                        }
                    }
                }


                if (gameStatus == Status.WON)
                    System.out.printf("Congratulations, you won! Your current account balance is: %d%n", bankBalance);

                else
                    System.out.printf("Oh, you lost! Your current account balance is: %d%n", bankBalance);

                if (bankBalance == 0)
                    System.out.printf("%n is sorry, you have lost! Work hard, come back after making money!");

                System.out.println();
            } while (playFlag != -1 && bankBalance > 0);

            input.close();
        }


        public static int rollDice() {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);


            int sum = die1 + die2;


            System.out.printf("The number of points you throw is: %d + %d = %d%n",
                    die1, die2, sum);

            return sum;
        }


        public static void chat() {
            int msgNum = 1 + randomNumbers.nextInt(4);


            final String MSG1 = "Don't look down on the doubles, there is a university to ask!";
            final String MSG2 = "Today's idea is a bit back? Jade and good deeds will be transshipped!";
            final String MSG3 = "Small gambling, big bet!";
            final String MSG4 = "What is luck, double the account balance is luck!";


            switch (msgNum) {
                case 1:
                    System.out.println(MSG1);
                    break;
                case 2:
                    System.out.println(MSG2);
                    break;
                case 3:
                    System.out.println(MSG3);
                    break;
                case 4:
                    System.out.println(MSG4);
                    break;


            }
        }
    }
}
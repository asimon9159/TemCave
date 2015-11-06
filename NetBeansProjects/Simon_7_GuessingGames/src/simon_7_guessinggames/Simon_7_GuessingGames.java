/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_7_guessinggames;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author asimon9159
 */
public class Simon_7_GuessingGames {
    static String username;
    static int theirguess;
    static int magicnumber;
    static Random random = new Random();
    static boolean stopplay = false;
    static boolean playAgain;
    static String userReplay;
    static boolean exitWhile;
    static int theirguess2;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner name = new Scanner(System.in);
        System.out.println("Hello user, what is your name?");
        username = name.nextLine();
        
        magicnumber = random.nextInt(10);
        while (!stopplay) {
            playthegame();
            //playthegame2();
            exitWhile = false;
        }
    }
    
    private static void playthegame(){
        //magicnumber = (random.nextInt(9)+1);
        System.out.println("Hello " + username + "!" + " Please pick a number between 1 and 10.");
        Scanner guess = new Scanner(System.in);
        theirguess = guess.nextInt();
        if (magicnumber == theirguess){
            System.out.println("Correct! You Win!");
            System.out.println("Do you want to play again? (Y/N)");
             Scanner plays = new Scanner(System.in);
            userReplay = plays.nextLine();
            if (userReplay.contains("y")||userReplay.contains("Y")) {
                userReplay = guess.nextLine();
                playthegame();
                stopplay = false;
            }
            if (userReplay.contains("n")||userReplay.contains("N")) {
                userReplay = guess.nextLine();
                System.out.println("Thank you for playing 'The Guessing Game', " + username + "!");
                stopplay = true;
            }
        
            } else if (magicnumber > theirguess){
                System.out.println("Too low! Try again.");
        
            } else if (magicnumber < theirguess){
                System.out.println("Too high! Try again.");
        
        }
    }
    
    private static void playthegame2(){
        //magicnumber = (random.nextInt(9)+1);
        Scanner guess = new Scanner(System.in);
        theirguess2 = guess.nextInt();
        if (magicnumber == theirguess2){
            System.out.println("Correct! You Win!");
            System.out.println("Thank you for playing The Guessing Game, " + username + "!");
            userReplay = guess.nextLine();
                stopplay = true;
                exitWhile = true;
        
            } else if (magicnumber > theirguess2){
                System.out.println("Too low! Try again.");
        
            } else if (magicnumber < theirguess2){
                System.out.println("Too high! Try again.");
        
        }
    }
    
}


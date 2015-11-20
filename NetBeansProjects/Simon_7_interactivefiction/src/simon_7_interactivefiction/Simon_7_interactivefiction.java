/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_7_interactivefiction;

import java.util.Scanner;

/**
 *
 * @author asimon9159
 */
public class Simon_7_interactivefiction {

    static String username;
    static String drunkorsober;
    static String fightorflight;
    static String gettipsy;
    static String leavetavern;
    static String pushpull;
    static String tryagain;
    static String homeorwalk;
    static boolean exitWhile;
    static boolean stopplay = false;
    static String leaveTavern;
    static boolean narrator = false;
    //static boolean door = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //#method1()
        Scanner name = new Scanner(System.in);
        System.out.println("Ahhh....a poor soul has woken up in the tavern. But what is this human's name?");
        username = name.nextLine();
        System.out.println("Aahhhh.....well... " + username + " .... that's.....interesting. \nCould have been better, but we'll just continue along....");
        playthegame();
    }

    public static void playthegame() {
        //#method2()
        System.out.println("\nYou are in a tavern and have been drinking some beer. Quite a troublesome day you've been having. "
                + "\nFound yourself standing over the wife's dead body. Didn't know what you did. "
                + "\nThe amnesia overwhelmed you, left you panicked. "
                + "\nWanted to forget the events prior to the murder, ehhh...? "
                + "\n \nSuch a shame indeed.");

        try {
            Thread.sleep(17000);
        } catch (InterruptedException ex) {

        }

        System.out.println("\n \n \n \n \n[~~Goal: Get home safely without making any trouble.~~]");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {

        }
        awake();
    }

    public static void awake() {
        //#method3()
        System.out.println("\n \n \n \n \nYou wake up from resting your head on the table, hand grappling the mug handle. "
                + "\nYou think you are...?");
        System.out.println("-Drunk");
        System.out.println("-Sober");
        Scanner start = new Scanner(System.in);
        drunkorsober = start.nextLine();
        if (drunkorsober.contains("runk")) {
            drunkYes();
        } else if (drunkorsober.contains("ober")) {
            drunkNo();
        } else {
            awake();
        }
        //If user picks to go on a drunk path, their actions would be inversed (i.e. user wants to go left, he goes right instead.)
    }

    public static void drunkYes() {
        //#method4()
        Scanner tavern = new Scanner(System.in);
        System.out.println("\nDo you fight someone or do you go home?");
        fightorflight = tavern.nextLine();
        if (fightorflight.contains("ight")) {
            System.out.println("You go home because your mind thought 'Go Home' instead. ~Dull End~ "
                    + "\n \nAlas, this pityful being completed their goal, but in one of the most boring way possible. "
                    + "\nWould this creature like to try again and wake from his slumber?");
            //#win
            tryagain = tavern.nextLine();
            if (tryagain.contains("o")) {
                System.out.println("And so ends this poor soul's tale.....");
                exitWhile = true;
            } else if (tryagain.contains("es")) {
                awake();
            } else {
                drunkYes();
            }

        } else if (fightorflight.contains("ome")) {
            System.out.println("Your mind thought 'Fight Someone'. You push a big tough guy and he punches you in the face. ~Drunk End~ "
                    + "\n \nAlas, this pityful being could not complete his goal. "
                    + "\nWould this creature like to try again and wake from his slumber?");
            //#lose
            //Idea: For right now, the tough guys wins.
            //Idea: If I have enought time to edit code, revision the fight where the user can actually use environment to help themself
            //Idea: Environment includes a nearby chair, a beer mug, and the door (exit move)
            tryagain = tavern.nextLine();
            if (tryagain.contains("o")) {
                System.out.println("And so ends this poor soul's tale.....");
                exitWhile = true;
            } else if (tryagain.contains("es")) {
                awake();
            }
        }
    }

    public static void drunkNo() {
        //#method5()
        Scanner realLife = new Scanner(System.in);
        System.out.println("\nGet drunk?");
        gettipsy = realLife.nextLine();
        if (gettipsy.contains("es")) {
            //Idea: Ask the user if they want one-five drinks.
            //Idea: If user picks five drinks, they black out, wake up to fighting the bartender with a shotgun
            //Idea: Environment includes a nearby chair and a beer mug
            //Idea: Or if user doesn't pick environmental items, there are actions of sidestepping a shot or to try and grab the gun.
            System.out.println("\nDo you fight someone or do you go home?");
            fightorflight = realLife.nextLine();
            if (fightorflight.contains("ight")) {
                System.out.println("You go home because your mind thought 'Go Home' instead. ~Dull End~ "
                        + "\n \nAlas, this pityful being completed their goal, but in one of the most boring way possible. "
                        + "\nWould this creature like to try again and wake from his slumber?");
                //#win
                tryagain = realLife.nextLine();
                if (tryagain.contains("o")) {
                    System.out.println("And so ends this poor soul's tale.....");
                    exitWhile = true;
                } else if (tryagain.contains("es")) {
                    awake();
                }

            } else if (fightorflight.contains("ome")) {
                System.out.println("Your mind thought 'Fight Someone'. \nYou push a big tough guy and he punches you in the face. ~Drunk End~ "
                        + "\n \nAlas, this pityful being could not complete his goal. \nWould this creature like to try again and wake from his slumber?");
                //#lose
                tryagain = realLife.nextLine();
                if (tryagain.contains("o")) {
                    System.out.println("And so ends this poor soul's tale.....");
                    exitWhile = true;
                } else if (tryagain.contains("es")) {
                    awake();
                }
            }
        } else if (gettipsy.contains("o")) {
            System.out.println("\nYou start to leave the tavern. ");
            //        + "\n \nAre you sure you want to leave?");
            //if (leaveTavern.contains("o")) {
            //    leaveTavernNo();
            //} else if (leaveTavern.contains("es")) {
            leaveTavernYes();
            //}
        }

    }

    public static void leaveTavernNo() {
        System.out.println("The bartender seems to look in your direction and announces that the bar would be closing in 5 minutes. "
                + "\nYou hear under his breath, 'My night has been ruined.' \nYou decide to leave instead of waiting the 5 minutes.");
        //door = false;
        //Idea: Easter Egg if user chooses no???
        //I need for this story line to only appear if the user picks no
        //If user picks no, they are given this story line and are directed to the push or pull option
        //HOOOOOOWWW???!?!?!??!!!!?????
        //System.out.println("Push or Pull the door?");
        leaveTavernYes();
    }

    public static void leaveTavernYes() {
        while (narrator) {
            //#while
            System.out.println("\n \n \nYou hear in the distance 'Time is ticking...'");
            Scanner outside = new Scanner(System.in);
            //door = true;
            System.out.println("\nPush or Pull the door?");
        //#enemyobject
            //Explaination: Instead of saying "You open the door and walk out", I decided to make the door a lose path.
            //Explaination: Because everyone's experienced a time when they pushed a pull door and paniced/was embarrassed.
            pushpull = outside.nextLine();
            if (pushpull.contains("ush")) {
                System.out.println("\nYou pushed the door, but to your avail, the door does not open. "
                        + "\nYou die of embarrassment as you struggle to get out. ~Shame End~ "
                        + "\n \nAlas, this pityful being could not complete his goal. "
                        + "\nWould this creature like to try again and wake from his slumber?");
                //#lose
                tryagain = outside.nextLine();
                if (tryagain.contains("o")) {
                    System.out.println("And so ends this poor soul's tale.....");
                    exitWhile = true;
                } else if (tryagain.contains("es")) {
                    awake();
                    narrator = true;
                }
            } else if (pushpull.contains("ull")) {
                narrator = true;
                System.out.println("\nYou pull the door and walk outside to the chilly air and a dim lit moon.");
                System.out.println("Do you take a walk in the park nearby, or go home?");
                //Scanner outside = new Scanner(System.in)
                homeorwalk = outside.nextLine();
                if (homeorwalk.contains("alk")) {
                    narrator = true;
                    //Make the below narative less boring you walnut
                    System.out.println("\nYou start to take a walk, but then remember that there is a killer on the lose. "
                            + "\nYou decide to take a shortcut back home while speed walking.");
                    try {
                        Thread.sleep(9000);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println("\n \nYou arrive at the front door of your house. "
                            + "\nYou insert the keys that opened the door, and throw your keys into the mini-basket next to the door frame.");
                    try {
                        Thread.sleep(9000);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println("\nYou turn on the hallway lights and see about half a dozen guns raise, aimed at your face."
                            + "\nA poor soul indeed. \nSuch a shame indeed.");
                    System.out.println("\n \n \nAnd so ends the life of the framed " + username + "........");
                    try {
                        Thread.sleep(9000);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println("\n \n \n \n~True End~");
                    //#win
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println("\n.");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println("\n..");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println("\n...");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException ex) {

                    }

                    System.out.println("\n \nAlas, this pityful being was sentenced to a choice of life in prison or death. "
                            + "\nWould this creature pick death or a boxed non-life?");

                    tryagain = outside.nextLine();
                    if (tryagain.contains("eath")) {
                        System.out.println("And so ends this poor soul's tale..... \nGoing down with their innocence.....");
                        exitWhile = true;
                    } else if (tryagain.contains("rison")) {
                        narrator = true;
                        System.out.println("And so ends this poor soul's tale..... \nGoing down with their innocence.....");
                        System.out.println("\nYou close your eyes as you mutter the word prison."
                                + "\nAs you open your eyes, the world is on your side."
                                + "\nYou stare at a beer full mug.");
                        try {
                            Thread.sleep(13000);
                        } catch (InterruptedException ex) {

                        }
                        awake();
                    } else {
                        System.out.println("\nWould this creature pick death or a boxed non-life?");
                    }
                } else if (homeorwalk.contains("ome")) {
                    System.out.println("\nYou start to head home, but since you were drinking away your problems earlier, you can't see well at night. "
                            + "\nYou then fall down a pot hole because you didn't see the hole in time for you to avoid it. ~Lose~");
                    //#lose
                    tryagain = outside.nextLine();
                    if (tryagain.contains("o")) {
                        System.out.println("And so ends this poor soul's tale.....");
                        exitWhile = true;
                    } else if (tryagain.contains("es")) {
                        narrator = true;
                        awake();
                    }
                }
            }
        }
    }
}
}


//http://d22.ninja/pre-APCS_1516/resources/InteractiveFictionRubric.pdf

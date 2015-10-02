/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_7_challenge0;

/**
 *
 * @author asimon9159
 */
public class Simon_7_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Use 3 methods to check for divisibility by 2, 3, or 5
            //Title the methods: isDivisiblebytwo(), isDivisiblebythree(), and isDivisiblebyfive()
                //Should return "true" or "false" if the number is divisible
                    //A grade for a loop counting to 500+ and should use the methods to check for divisibility

        
        //if divisible by 2 and 3, print "chisme"
            //Should not print "Davis and Vidal"
        
        //if divisible by 3 and 5, print "Old School"
            //Should not print "Claughton and Vidal"
        
        //if divisible by 2, 3, and 5, print "Team Building"
            //Should not print "Davis, Vidal, and Claughton"
        
        int counter = 0;
        for(int i = 0; i < 500; i ++) {
           if(isDivisiblebyeleven(i) & isDivisiblebyfive(i)) {
               System.out.println( "Animate This!");
           } else if(isDivisiblebyeleven(i) & isDivisiblebythree(i)) {
               System.out.println( "Herr Direktor");
           } else if(isDivisiblebyfive(i) & isDivisiblebythree(i) & isDivisiblebytwo(i)) {
               System.out.println( "Team Building");
           } else if(isDivisiblebyeleven(i) & isDivisiblebytwo(i)) {
               System.out.println( "ninja");
           } else if(isDivisiblebyfive(i) & isDivisiblebythree(i)) {
               System.out.println( "Old School");
           } else if(isDivisiblebythree(i) & isDivisiblebytwo(i)) {
               System.out.println( "chisme");
           } else if(isDivisiblebyfive(i)) {
               System.out.println( "Vidal");
           } else if(isDivisiblebythree(i)) {
               System.out.println( "Claughton");
           } else if(isDivisiblebytwo(i)) {
               System.out.println( "Davis");
           } else {
               System.out.println(i);
           }
           
              
        }
        
        }
        
        //if divisible by 2, print "Davis"
            //if divisible by 22, print "ninja"
        
        static boolean isDivisiblebytwo (int somenumber) {
            return (somenumber % 2 == 0);
        }
        
        //if divisible by 3, print "Claughton"
            //if divisible by 33, print "Herr Direktor"
        
        static boolean isDivisiblebythree (int somenumber) {
            return (somenumber % 3 == 0);
        }
        
        //if divisible by 5, print "Vidal"
            //if divisible by 55, print "Animate this!"
        
        static boolean isDivisiblebyfive (int somenumber) {
            return (somenumber % 5 == 0);
        }
     static boolean isDivisiblebyeleven (int somenumber) {
            return (somenumber % 11 == 0);
        }
    }
    

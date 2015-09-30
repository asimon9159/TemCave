/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_7_counter;

/**
 *
 * @author asimon9159
 */
public class Simon_7_Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       int counter = 0;
        for(int i = 0; i < 100; i ++) {
            //What happens in the loop
            //Will happen again and again
            //Until the loop exits
            if(isEven(i)) {
                counter += 1;
                System.out.println( "We have "
                + counter + " evens!");
        }

    }
         System.out.println( "We have "
                + counter + " total evens!");
    }
    /*
    A method is like a little program
    A method is like a function, something you want to repeat frequently
    */
    
    static boolean isEven (int somenumber) {
        return (somenumber % 2 != 0);
    }

    static boolean isOdd (int somenumber) {
        return (somenumber % 2 != 0);
    }
    
        static boolean isPrime (int somenumber) {
        int divisor = 0;
        for (int i = 2; i < somenumber; i++) {
            
            if((somenumber % i == 0)) {
                divisor +=1;
            }
        }
        return (divisor == 0);
    }
    /* This was my experiment for isOdd
    int counter = 0;
    for(int i = 0; i < 100; i ++) {
    if (isOdd(i)) {
        counter += 1;
        System.out.println( "We have "
        +counter + " odds!");
    }
}
    static boolean isOdd (int somenumber) {
        return (somenumber % 2 != 0);
    }
    */
    
}

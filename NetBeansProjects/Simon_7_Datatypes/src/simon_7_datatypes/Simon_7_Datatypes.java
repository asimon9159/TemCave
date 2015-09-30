/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon_7_datatypes;

/**
 *
 * @author asimon9159
 */
public class Simon_7_Datatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        //Used to explain code
        //Code explanation is an expectation
        //in d22
        int i = 1;
        float a = 2.5f;
        double b = 3.87;
        short c = 16;
        char d1 = ';';
        char d2 = 'a';
        char d3 = 42;
        char d4 = 145;
        String e = d4+"";
        String e1 = "Amanda is the best";
        boolean f = true;
        boolean g = i % 2 == 0;
        /*
        Here we will look at some mathematical operators
        */
        // + this adds two numbers and more
        // - this subtracts two numbers and more
        // * this multiplies two numbers and more
        // / this divides two numbers and more
        // % this is modulo. Shoes you the remainder
        System.out.println(i + " an integer");
        System.out.println(a + " a float");
        System.out.println(b + " a double");
        System.out.println(c + " a short");
        System.out.println(d1 + " a char");
        System.out.println(d2 + " a char");
        System.out.println(d3 + " a char");
        System.out.println(e + " a string");
        System.out.println(e1 + " a string");
        System.out.println(f + " a boolean");
            i = 22;
            a = 0;
            e = "ninja";
        System.out.println(e + i + " a string plus an integer"
        );
        
        
        /*
        The first "for" statement is an experiment, the second "for" statement is good/legit.
        */
        
        for(i = 0;i < 10; i++)   {
            if ((i % 3 == 0)) {
                System.out.println(i + " is prime");
            }
        }
        
        
        /*
        End of "for" experiment
        */
        
        
        for(i = 1;i < 100; i++)  {
//            System.out.println((char) i);
            /*if a conditional (flow) statement, If a condition is true the following command will be executed */
            if ((i % 2 != 0 ) & (i % 3 != 0) & (i % 5 != 0)) {
                System.out.println(i + " is prime"); 
            } else {
                System.out.println(i + " is composite"); }
            
            
            
       
        /*adding an int and a string concatenates (combines) the int and string as a string*/
        
        }
        
        // upcasting = 
        
        /* % checks for the remainder
            i % 2 checks if a number is even or odd
        */
        
//        }
        //System.out.println(g + " a boolean");
        
        
    }
    
}

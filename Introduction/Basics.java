package Introduction;

public class Basics {
    /*
     * Design Principle
     * 
     * Indentify the aspects your application that vary and sepearate them form the what stays the same.
     * 
     * Program to an Interface not an implementation
     */

     public static void main(String[] args) {
        Duck md = new MallardDuck();

         md.perfomFly();
         md.perfomQuack();
        
     }

     
}

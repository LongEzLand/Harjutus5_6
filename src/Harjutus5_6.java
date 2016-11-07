/**
 * Created by Lazarus on 7.11.2016.
 *
 * Exercise 5.6 This exercise reviews the flow of execution through a program
 with multiple methods. Read the following code and answer the questions.

 1. Write the number 1 next to the first line of code in this program that
 will execute.

 //Writing the numbers behind the lines as comments.

 2. Write the number 2 next to the second line of code, and so on until the
 end of the program. If a line is executed more than once, it might end
 up with more than one number next to it.

 //Writing the numbers behind the lines as comments.

 3. What is the value of the parameter "blimp" when "baffle" gets invoked?

 The value is "rattle"

 4. What is the output of this program?

 ik
 rattle
 ping zoop
 boo-wa-ha-ha


 *
 */
public class Harjutus5_6 {
    public static void baffle(String blimp) {
        System.out.println(blimp);//4
        zippo("ping", -5);//5
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");//6
        } else {
            System.out.println("ik"); //2
            baffle(quince);//3
            System.out.println("boo-wa-ha-ha");//7
        }
    }
    public static void main(String[] args) {
        zippo("rattle", 13);//1
    }

}

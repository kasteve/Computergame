import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Stevegames {
    public static void main(String[] arg){

        System.out.println("\n-----------------------------\n\nWELCOME TO THIS PROGRAM\nWE ARE HERE TO CONVERT\n\n-------------------------\nFollow instructions carefully\n\n");

        /*int heightFt;
        double heightInches;
        float finalHeight;*/

        Scanner myComputations = new Scanner(System.in); // this line accepts input from user

        System.out.println("Please enter your name");

        String name = myComputations.nextLine();
        name = name.toUpperCase();

        System.out.println("Enter height in feet:");

        int heightFt = myComputations.nextInt();

        System.out.println("Enter height in inches:");

        float heightInches = myComputations.nextFloat();

        double heightInCm;
        heightInCm = 30.48*heightFt + 2.54*heightInches;

        System.out.println("Hi "+name+",\n In which units do you want the height computed?\n\n Just type 1 if you want in centimeters or 2 if you want in feet and inches");

        int userdecision = myComputations.nextInt();

        if (userdecision==1){
            System.out.println("Hello "+name+", \nYour height is: "+ heightInCm +" centimeters");
        }
        else if (userdecision==2)
        {
            System.out.println("Hello "+name+", \n Your height is "+heightFt+" ft and "+heightInches+" inches.");
        }
        else{
            System.out.println("Unknown Input!!!!!");
        }


    }
}
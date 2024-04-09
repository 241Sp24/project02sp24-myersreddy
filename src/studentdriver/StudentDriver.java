
package studentdriver;

import java.io.*;
import java.util.*;

public class StudentDriver {

    public static void main(String[] args) throws Exception{
        System.out.println("Project02");

        StudentFees[] students = new StudentFees[12];
        
        File inputFile = new File("input.csv");
        Scanner scanner = new Scanner(inputFile);
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the no of UG students: ");
        int noOfUG = userInput.nextInt();
        System.out.println("Enter the no of Graduate students: ");
        int noOfGrad = userInput.nextInt();
        System.out.println("Enter the no of online students: ");
        int noOfOnline = userInput.nextInt();

        //Undergraduate print
        if(scanner.hasNext()) {
            for(int i = 0; i < (noOfUG * 6); i++) {
                students[i] = new UGStudent("", 0, null, null, 0.0, 0); 
            }
        }
    }

}

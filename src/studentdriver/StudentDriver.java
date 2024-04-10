package studentdriver;
import java.util.*;
import java.io.*;

public class StudentDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Project02");

        Scanner input = new Scanner(System.in);
        

        System.out.println();
        
        //User input
        System.out.print("Enter the No of UG Students: ");
        int UG = input.nextInt();
        
        System.out.print("Enter the No of Graduate Students: ");
        int Graduate = input.nextInt();
        
        System.out.print("Enter the No of Online Students: ");
        int Online = input.nextInt();
        
        System.out.println();
        
        //Initialization of objects
        StudentFee[] students = new StudentFee[12];
        File file = new File("input.csv");
        Scanner fileInput = new Scanner(file);

        String[] string = new String[6];
        int index = 0;
        int y = 0;

        //Collects data from file
        while(fileInput.hasNext()) {
            string = fileInput.next().split(",");
            
            if(y < UG){
                students[index] = new UGStudent(string[1], Integer.parseInt(string[0]), 
                            Boolean.parseBoolean(string[2]), Boolean.parseBoolean(string[4]),
                            Double.parseDouble(string[5]), Integer.parseInt(string[3]));
            }
            else if(y >= UG && y < UG + Graduate){
                if(string[4].equals("false")){
                    students[index] = new GraduateStudent(string[1], Integer.parseInt(string[0]), 
                            Boolean.parseBoolean(string[2]), Boolean.parseBoolean(string[4]),
                            Integer.parseInt(string[3]));
                }
                else{
                    students[index] = new GraduateStudent(string[1], Integer.parseInt(string[0]), 
                            Boolean.parseBoolean(string[2]), Boolean.parseBoolean(string[4]),
                            string[5], Integer.parseInt(string[3]));
                }
            }
            else if(y >= UG + Graduate){
                students[index] = new OnlineStudent(string[1],Integer.parseInt(string[0]),
                        Boolean.parseBoolean(string[2]),Integer.parseInt(string[3]));
            }
            y += 1;
            index += 1;
        }
        
        fileInput.close();
        
        //Initilization for variables within for-loop
        int scholarship = 0;
        int UGCourseNum = 0;
        int gradAssist = 0;
        int gradCourseNum = 0;
        double underFees = 0.0;
        double gradFees = 0.0;
        double onlineFees = 0.0;
        y = 0;
        for (StudentFee s: students) {

            //Decides and outputs lists
            if(y == 0){
                System.out.println("*******Undergraduate students list*******");
            }
            if(y == UG){
                System.out.println("*******Graduate students list*******");
            }
            if(y == UG + Graduate){
                System.out.println("*******Online students list*******");
            }

            //Calculate and display average of UG students fee, number of students
            //who got scholarship, and total no of courses enrolled by all UG students.
            if(s instanceof UGStudent){
                System.out.println(s);
                underFees += ((UGStudent) s).getPayableAmount();
                UGCourseNum += ((UGStudent) s).getCoursesEnrolled();
                if(((UGStudent) s).isHasScholarship()){
                    scholarship += 1;
                }
            }
            //Calculate and display average of graduate student’s fee, number of 
            //students who got graduate assistantship, and total number of courses enrolled by graduate students.
            else if(s instanceof GraduateStudent){
                System.out.println(s);
                gradFees += ((GraduateStudent) s).getPayableAmount();
                gradCourseNum += ((GraduateStudent) s).getCoursesEnrolled();
                if(((GraduateStudent) s).isIsGraduateAssistant()){
                    gradAssist += 1;
                }
            }
            //Calculate and display average of online student’s fee.
            else if(s instanceof OnlineStudent){
                System.out.println(s);
                onlineFees += ((OnlineStudent) s).getPayableAmount();
            }
            System.out.println();
            y += 1;
        }
        //Output of student details
        System.out.println("**********Undergraduate Students details**********");
        System.out.printf("Average Student fee: %.2f\n", underFees / UG);
        System.out.println("Scholarship count: " + scholarship);
        System.out.println("Total number of courses: " + UGCourseNum);
        System.out.println();
        
        System.out.println("**********Graduate Students details**********");
        System.out.printf("Average Student fee: %.2f\n", gradFees / Graduate);
        System.out.println("Graduate Assistantship count: " + gradAssist);
        System.out.println("Total number of courses: " + gradCourseNum);
        System.out.println();
        
        System.out.println("**********Online Students details**********");
        System.out.printf("Average Student fee: %.2f\n", onlineFees / Online);
    }
}

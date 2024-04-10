package studentdriver;

public class OnlineStudent extends StudentFee{
    private final int noOfMonths;
    private final double MONTHLY_FEE = 1245.25;
    
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, 
            int noOfMonths){
        //
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }
    @Override
    public double getPayableAmount(){
        return MONTHLY_FEE * noOfMonths;
    }
    @Override
    public String toString(){
        return "Student Name: " + super.getStudentName() 
                + "\nStudent id: " + super.getStudentID() 
                + "\nEnrolled: " + super.isIsEnrolled() 
                + "\nNumber of months: " + noOfMonths 
                + "\nPayable amount: " + getPayableAmount();
    }
}

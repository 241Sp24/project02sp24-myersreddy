package studentdriver;


public class UGStudent extends StudentFee{
    //Instance variables
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    //Constructor
    public UGStudent(String studentName, int studentID, boolean isEnrolled, 
           boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        //Super implementation
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
        
    }
    
    public boolean isHasScholarship(){
        return hasScholarship;
    }

    public double getScholarshipAmount(){
        return scholarshipAmount;
    }

    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }

    //Methods attained from StudentFees class
    @Override
    public double getPayableAmount(){
        double tuition = ((coursesEnrolled * super.getCREDITS_PER_COURSE()) 
                * super.getPER_CREDIT_FEE() + ADDITIONAL_FEE) - scholarshipAmount;
        if(!super.isIsEnrolled()){
            tuition = 0;
        }
        return tuition;
    }

    @Override
    public String toString(){
        return "Student Name: " + super.getStudentName() 
                + "\nStudent id: " + super.getStudentID() 
                + "\nEnrolled: " + super.isIsEnrolled() 
                + "\nScholarship: "  + isHasScholarship() 
                + "\nScholarship amount: " + getScholarshipAmount() 
                + "\nCouses enrolled: " + getCoursesEnrolled() 
                + "\nPayable amount: " + getPayableAmount();
    }
}

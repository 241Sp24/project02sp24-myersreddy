package studentdriver;


public class UGStudent extends StudentFees{
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    public UGStudent(String studentName, int studentID, boolean isEnrolled, 
    boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
    }

    public boolean isHasScholarship(){
        return hasScholarship;
    }

    public double getScholarshipAmount(){
        return scholarshipAmount;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    //Not finished
    public double getPayableAmount() {
        return ((((getCoursesEnrolled() * CREDITS_PER_COURSE) * PER_CREDIT_FEE) + ADDITIONAL_FEE) 
        - scholarshipAmount);
    }

    @Override
    public String toString() {
        return super.toString() + "\nScholarship: " + isHasScholarship() 
        + "\nScholarship amount: " + getScholarshipAmount() + "\nCourses enrolled :" 
        + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }
}

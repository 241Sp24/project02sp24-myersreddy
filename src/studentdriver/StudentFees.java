package studentdriver;

public abstract class StudentFees {
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private int CREDITS_PER_COURSE = 3;
    private double PER_CREDIT_FEE = 543.50;

    public StudentFees(String studentName, int studentID, boolean isEnrolled) {}
    
    public String getStudentName(){
        return studentName;
    }

    public int getStudentID(){
        return studentID;
    }

    public boolean isIsEnrolled(){
        return isEnrolled;
    }

    public double getCREDITS_PER_COURSE(){
        return CREDITS_PER_COURSE;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void IsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    public double getPayableAmount(){
        return CREDITS_PER_COURSE * PER_CREDIT_FEE;
    }

    //May need to remake
    @Override
    public String toString() {
        return "Student Name: " + getStudentName() + "\nStudent id: "
         + getStudentID() + "\nEnrolled: " + isIsEnrolled();
    }
}

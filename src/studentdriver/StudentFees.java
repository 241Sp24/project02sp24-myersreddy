package studentdriver;

public abstract class StudentFees {
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    int CREDITS_PER_COURSE = 3;
    double PER_CREDIT_FEE = 543.50;

    public StudentFees(String studentName, int studentID, boolean isEnrolled) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
    }
    
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

    @Override
    public String toString() {
        return "Student Name: " + getStudentName() + "\nStudent id: "
         + getStudentID() + "\nEnrolled: " + isIsEnrolled() + "\n";
    }
}

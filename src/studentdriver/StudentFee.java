package studentdriver;

public abstract class StudentFee {
    //Instance variables
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private final int CREDITS_PER_COURSE = 3;
    private final double PER_CREDIT_FEE = 543.50;
    
    //Constructor
    public StudentFee(String studentName, int studentID, boolean isEnrolled){
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
    }

    //Getter methods
    public String getStudentName(){
        return studentName;
    }

    public int getStudentID(){
        return studentID;
    }

    public boolean isIsEnrolled(){
        return isEnrolled;
    }

    public int getCREDITS_PER_COURSE(){
        return CREDITS_PER_COURSE;
    }

    public double getPER_CREDIT_FEE(){
        return PER_CREDIT_FEE;
    }

    //Setter methods
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public void setIsEnrolled(boolean isEnrolled){
        this.isEnrolled = isEnrolled;
    }

    //Abstract method and toString
    public abstract double getPayableAmount();
    @Override
    public String toString(){
        return "";
    }
}

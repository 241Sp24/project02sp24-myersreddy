package studentdriver;

public class GraduateStudent extends StudentFees{
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;

    public GraduateStudent(String studentName, int studetnID, boolean isEnrolled, 
    boolean isGraduateAssistant, String graduateAssitantType, boolean coursesEnrolled) {
        super(studentName, studetnID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssitantType;
        this.coursesEnrolled = coursesEnrolled;
    }

    public GraduateStudent(String studentName, int studetnID, boolean isEnrolled, 
    boolean coursesEnrolled) {
        super(studentName, studetnID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
    }

    public boolean isIsGraduateAssistant(){
        return isGraduateAssistant;
    }

    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }

    public double getPayableAmount(){
        if(isIsGraduateAssistant() == true) {
            if(graduateAssistantType == "half") {
                double tuitionFee = ((((getCoursesEnrolled() * CREDITS_PER_COURSE) * PER_CREDIT_FEE)
                 + ADDITIONAL_FEE) / 2.0);
            }
            if(graduateAssistantType == "full") {
                double tuitionFee = ADDITIONAL_FEES;
            }
            return tuitionFee;
        }
        else {
            return double tuitionFee = (((getCoursesEnrolled() * CREDITS_PER_COURSE) * PER_CREDIT_FEE)
            + ADDITIONAL_FEE);
        }
        
    }
    @Override
    public String toString(){
        return super.toString() + "\nGraduate assistant: " + isIsGraduateAssistant() 
        + "\nGraduate assistant type: " + graduateAssistantType + "\nCourses enrolled: " 
        + getCoursesEnrolled() + "Payable amount: " + getPayableAmount() + "\n";
    }
}

package studentdriver;


public class GraduateStudent extends StudentFee{
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEE = 654.45;
    
    //Constructor (for GA)
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }

    //Constructor (non-GA)
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public boolean isIsGraduateAssistant(){
        return isGraduateAssistant;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }

    //Methods attained from StudentFees class
    @Override
    public double getPayableAmount(){
        double tuition = ((coursesEnrolled * super.getCREDITS_PER_COURSE()) 
                * super.getPER_CREDIT_FEE() + ADDITIONAL_FEE);
        //If GA, then calculates tuition from assistantship type        
        if(isGraduateAssistant){
            if(graduateAssistantType.equals("full")){
            tuition = 0;
            }
            else if(graduateAssistantType.equals("half")){
                tuition /= 2;
            }
        }
        
        return tuition;
    }

    //ToString
    @Override
    public String toString(){
        return "Student Name: " + super.getStudentName() 
                + "\nStudent id: " + super.getStudentID() 
                + "\nEnrolled: " + super.isIsEnrolled() 
                + "\nGraduate assistant: "  +  isIsGraduateAssistant()
                + "\nGraduate assistant type: " + graduateAssistantType
                + "\nCouses enrolled: " + getCoursesEnrolled() 
                + "\nPayable amount: " + getPayableAmount();
    }
}    

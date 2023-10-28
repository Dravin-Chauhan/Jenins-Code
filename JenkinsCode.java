import java.util.Date;

public class JenkinsCode {
    public static void main(String[] args) {
        System.out.println("This code is written for the Jenkins Tutorial.");
        System.out.println("This will be used to test the feature of jenkins.");
        System.out.println("Current Date with time : "+new Date());

        Student student = new Student();
        student.setName("Unknown");
        student.setRollNumber("123464565");
        student.printStudentsDetails();
    }
} 




public class Student {
    private String name;
    private String rollNumber;
    public Student() {
        System.out.println("Student Object Created.");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void printStudentsDetails() {
        System.out.println("Student Name : "+name+", Roll Number : "+rollNumber);
    }
}

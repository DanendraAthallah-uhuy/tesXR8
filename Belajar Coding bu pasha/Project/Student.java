package Project;

public class Student extends Person {
    private int StudentNumber;
    private int score;
    private String major;

    public int getStudentNumber() {
        return this.StudentNumber;
    }

    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student() {
        super(); // mengakses constructor superclass
        StudentNumber = 0;
        score = 0;
        major = "";
    }

    public Student(String name, int age, int StudentNumber, int score, String major) {
        super(name, age);
        this.StudentNumber = StudentNumber;
        this.score = score;
        this.major = major;
    }

    public void print() {
        super.print();
        System.out.println("StudentNumber: " + StudentNumber);
        System.out.println("Score: " + score);
        System.out.println("Major: " + major);
    }

}

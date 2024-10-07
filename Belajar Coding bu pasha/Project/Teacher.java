package Project;

public class Teacher extends Person {
    protected String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
        super(); // mengakses constructor superclass
        subject = "";
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("Subject: " + subject);
    }

}
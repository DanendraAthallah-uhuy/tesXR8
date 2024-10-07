package Project;

public class PartTime extends Teacher {
    private int hoursworked;
    private int setSalary;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int getSetSalary() {
        return this.setSalary;
    }

    public int setSetSalary() {
        int salary = hoursworked * 4 * 20000;
        return salary;
    }

    public PartTime() {
        super(); // mengakses constructor superclass
        hoursworked = 0;
        setSalary = 0;
    }

    public PartTime(String name, int age, String subject, int hoursworked, int setSalary) {
        super(name, age, subject);
        this.hoursworked = hoursworked;
        this.setSalary = setSalary;
    }

    public void print() {
        super.print();
        System.out.println("Hoursworked: " + hoursworked);
        System.out.println("Set Salary: " + setSalary);
    }

}

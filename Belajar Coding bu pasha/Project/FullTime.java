package Project;

public class FullTime extends Teacher {
    private int anualSalary;
    private String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public FullTime() {
        super(); // mengakses constructor superclass
        anualSalary = 0;
        unit = "";
    }

    public FullTime(String name, int age, String subject, int anualSalary, String unit) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }

    public void print() {
        super.print();
        System.out.println("anualSalary: " + anualSalary);
        System.out.println("Unit: " + unit);
    }

}

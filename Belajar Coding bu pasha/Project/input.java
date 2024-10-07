package Project;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan: \n1.Student \n2.Teacher \nPilih Salah Satu:");
        int pilihan = input.nextInt();
        System.out.println("___________________________________________");

        if (pilihan == 1) {
            System.out.println("Nama:");
            String name = input.next();
            System.out.println("Major:");
            String major = input.next();
            System.out.println("Umur:");
            int age = input.nextInt();
            System.out.println("Nomor:");
            int StudentNumber = input.nextInt();
            System.out.println("Skor:");
            int score = input.nextInt();
            Student murid = new Student(name, age, StudentNumber, score, major);
            System.out.println("=============================================================");
            murid.print();
        } else if (pilihan == 2) {
            System.out.println("Pilihan: \n1.FullTime \n2.PartTime \nPilih Salah Satu:");
            int pilih = input.nextInt();
            System.out.println("___________________________________________________________");
            if (pilih == 1) {
                System.out.println("Nama:");
                String name = input.next();
                System.out.println("Subject:");
                String subject = input.next();
                System.out.println("Unit:");
                String unit = input.next();
                System.out.println("Umur:");
                int age = input.nextInt();
                System.out.println("Anual Salary:");
                int anualSalary = input.nextInt();
                FullTime Full = new FullTime(name, age, subject, anualSalary, unit);
                System.out.println("==================================================");
                Full.print();
            } else if (pilih == 2) {
                System.out.println("Nama:");
                String name = input.next();
                System.out.println("Subject:");
                String subject = input.next();
                System.out.println("Umur:");
                int age = input.nextInt();
                System.out.println("Jam Kerja:");
                int hoursworked = input.nextInt();
                System.out.println("Set Salary:");
                int setSalary = input.nextInt();
                PartTime Part = new PartTime(name, age, subject, hoursworked, setSalary);
                System.out.println("==================================================");
                Part.print();
                System.out.println("=======================");
                int total = hoursworked * setSalary;
                System.out.println("Totalnya adalah: Rp." + total);
            }
        }
    }
}
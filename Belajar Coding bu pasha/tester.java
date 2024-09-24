package INVENTORY;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan \n1. DVD \n2. CD \nPilih Salah Satu: ");
        int pilihan = input.nextInt();
        input.nextLine();
        System.out.println("____________________________________________________________");

        if (pilihan == 1) {
            System.out.print("Nama:");
            String name = input.nextLine();
            System.out.print("Studio:");
            String studio = input.nextLine();
            System.out.print("Nomor:");
            int number = input.nextInt();
            System.out.print("Kuantitas:");
            int quantity = input.nextInt();
            System.out.print("Panjang:");
            int lenght = input.nextInt();
            System.out.print("Harga:");
            double price = input.nextDouble();
            System.out.print("Rating:");
            int rating = input.nextInt();
            dvd d1 = new dvd(number, name, quantity, price, lenght, rating, studio);
            System.out.println("=======================================================================");
            d1.print();
        } else if (pilihan == 2) {
            System.out.print("Nama:");
            String name = input.nextLine();
            System.out.print("Artis:");
            String artis = input.nextLine();
            System.out.print("Label:");
            String label = input.nextLine();
            System.out.print("Nomor:");
            int number = input.nextInt();
            System.out.print("Quantity:");
            int quantity = input.nextInt();
            System.out.print("Jumlah Lagu:");
            int numSong = input.nextInt();
            System.out.print("Harga:");
            double price = input.nextDouble();
            cd c1 = new cd(number, name, quantity, price, artis, numSong, label);
            System.out.println("=======================================================================");
            c1.print();
        } else {
            System.out.println("Input Salah");
        }
    }
}

package MATERI_PERULANGAN;

import java.util.Scanner;

public class PR_kelipatan6 {
    public static void main(String[] args) {

        int awal = 6;
        int akhir = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Angka awal:");
        awal = input.nextInt();
        System.out.println("Angka akhir:");
        akhir = input.nextInt();
        System.out.println("_____________________________________________________________");
        while (awal <= akhir) {
            System.out.print(awal + ",");
            awal += 6;
        }
    }
}
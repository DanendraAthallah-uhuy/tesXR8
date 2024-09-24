package TUGAS;

import java.util.Scanner;

public class PR_ratarata {
    public static void main(String[] args) {

        int jumlahSISWA, nilaisiswa;
        double totalsemuaNILAI = 0, ratarata;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Jumlah siswa: ");
        jumlahSISWA = scanner.nextInt();
        System.out.println("====================================================");

        int Absen = 1;
        while (Absen <= jumlahSISWA) {
            System.out.print("Masukkan nilai siswa ke-" + Absen + ": ");
            nilaisiswa = scanner.nextInt();
            Absen++;
            totalsemuaNILAI += nilaisiswa;

        }
        System.out.println("_____________________________________________________________________________");
        ratarata = totalsemuaNILAI / jumlahSISWA;
        System.out.println("Rata-rata nilai dari " + jumlahSISWA + " siswa adalah: " + ratarata);
    }
}

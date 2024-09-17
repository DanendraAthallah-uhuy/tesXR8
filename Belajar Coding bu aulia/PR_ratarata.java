package MATERI_PERULANGAN;

import java.util.Scanner;

public class PR_ratarata {
    public static void main(String[] args) {

        int jumlahSISWA, nilaisiswa, Absen;
        double totalsemuaNILAI = 0, ratarata;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Jumlah siswa: ");
        jumlahSISWA = scanner.nextInt();
        System.out.println("====================================================");

        for (Absen = 1; Absen <= jumlahSISWA; Absen++) {
            System.out.print("Masukkan nilai siswa ke-" + Absen + ": ");
            nilaisiswa = scanner.nextInt();
            totalsemuaNILAI += nilaisiswa;
        }
        System.out.println("_____________________________________________________________________________");
        ratarata = totalsemuaNILAI / jumlahSISWA;
        System.out.println("Rata-rata nilai dari " + jumlahSISWA + " siswa adalah: " + ratarata);
    }
}
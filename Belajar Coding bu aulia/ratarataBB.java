package TUGAS;

import java.util.Scanner;

public class ratarataBB {
    public static void main(String[] args) {

        int jumlahSISWA, BBsiswa;
        double totalsemuaBB = 0, ratarata;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Jumlah siswa: ");
        jumlahSISWA = scanner.nextInt();
        System.out.println("====================================================");

        int Absen = 1;
        while (Absen <= jumlahSISWA) {
            System.out.print("Masukkan Berat Badan Siswa ke-" + Absen + ": ");
            BBsiswa = scanner.nextInt();
            Absen++;
            totalsemuaBB += BBsiswa;

        }
        System.out.println("====================================================================================");
        System.out.println("Total Berat Badan Siswa adalah: " + totalsemuaBB);
        System.out.println("_____________________________________________________________________________");
        ratarata = totalsemuaBB / jumlahSISWA;
        System.out.println("Rata-rata Berat Badan dari " + jumlahSISWA + " siswa adalah: " + ratarata);
    }
}

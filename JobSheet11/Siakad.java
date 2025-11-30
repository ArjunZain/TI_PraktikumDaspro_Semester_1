import java.util.Scanner;
public class Siakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jmlSiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlSiswa][jmlMatkul];

        for (int i = 0; i < jmlSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata Nilai Setiap Siswa:");

        for (int i = 0; i < jmlSiswa; i++) {
            double total = 0;
            for (int j = 0; j < jmlMatkul; j++) {
                total += nilai[i][j];
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + (total / jmlMatkul));
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah:");

        for (int j = 0; j < jmlMatkul; j++) {
            double total = 0;
            for (int i = 0; i < jmlSiswa; i++) {
                total += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + (total / jmlSiswa));
        }
    }
}

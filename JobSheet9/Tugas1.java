import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        double total = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int nilai : nilaiMhs) {
            total += nilai;
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        double rataRata = total / nilaiMhs.length;

        System.out.println("\nHASIL PENGELOLAAN NILAI");
        System.out.println("Nilai Rata-rata Mahasiswa: " + rataRata);
        System.out.println("Nilai Tertinggi Mahasiswa: " + nilaiTertinggi);
        System.out.println("Nilai Terendah Mahasiswa: " + nilaiTerendah +"\n");
        System.out.println("DAFTAR SEMUA NILAI");
        
        for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }
}

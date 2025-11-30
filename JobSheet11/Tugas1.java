import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int responden = 10;
        int pertanyaan = 6;
        int[][] survei = new int[responden][pertanyaan];

        System.out.println("INPUT NILAI SURVEI (1-5)");
        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden " + (i + 1) + ":");
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("  Nilai pertanyaan " + (j + 1) + " : ");
                survei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRATA-RATA PER RESPONDEN");
        for (int i = 0; i < responden; i++) {
            int total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survei[i][j];
            }
            double rata = (double) total / pertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        System.out.println("\nRATA-RATA PER PERTANYAAN");
        for (int j = 0; j < pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < responden; i++) {
                total += survei[i][j];
            }
            double rata = (double) total / responden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        System.out.println("\nRATA-RATA KESELURUHAN");
        int totalSemua = 0;
        int jumlahData = responden * pertanyaan;

        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalSemua += survei[i][j];
            }
        }
        double rataKeseluruhan = (double) totalSemua / jumlahData;
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
    }
}

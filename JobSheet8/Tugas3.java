import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===\n");

        for (int c = 1; c <= jumlahCabang; c++) {

            System.out.println("--- Cabang " + c + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int p = 1; p <= jumlahPelanggan; p++) {
                System.out.print("- Pelanggan " + p + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + c + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + " item\n");

            totalPelangganSemua += jumlahPelanggan;
            totalItemSemua += totalItemCabang;
        }

        System.out.println("Total seluruh Cabang:");
        System.out.println("- Pelanggan: " + totalPelangganSemua + " orang");
        System.out.println("- Item terjual: " + totalItemSemua + " item");
    }
}

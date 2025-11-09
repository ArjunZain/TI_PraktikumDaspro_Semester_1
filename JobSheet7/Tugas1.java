import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int jmlPelanggan, i =0;
        int hargaTiket =50000;
        double  tiket, totalHarga, totalPendapatan =0, totalPenjualanTiket =0;

        System.out.print("Masukkan jumlah pelanggan: ");
        jmlPelanggan =sc.nextInt();

    while (i < jmlPelanggan) {
        System.out.print("Masukkan pembelian tiket pelanggan ke-" + (i + 1) + ": ");
        tiket = sc.nextDouble();

    if (tiket < 0) {
        System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
         continue;
        }

        if (tiket > 4 && tiket <= 10) {
                totalHarga = (tiket * hargaTiket) * 0.9;
            } else if (tiket > 10) {
                totalHarga = (tiket * hargaTiket) * 0.85;
            } else {
                totalHarga = tiket * hargaTiket;
            }
        
        System.out.println("Total harga pelanggan ke-" + (i + 1) + ": Rp " + totalHarga);
            totalPendapatan += totalHarga;
            totalPenjualanTiket += tiket;

            i++;
        }
        System.out.println("\nTotal tiket terjual: " + totalPenjualanTiket + " tiket");
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
        System.out.println("Transaksi selesai.");
    }
}

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBiaya = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();
 
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            
            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Harga Pesanan: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
            totalBiaya += hargaPesanan[i];
        }

        System.out.print("\nDAFTAR PESANAN");
        System.out.println("\nNama Pesanan\tHarga");
 
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] +"\t\t" + hargaPesanan[i]);
        }
        
        System.out.println("\nTotal Biaya: " + totalBiaya);
    }
}

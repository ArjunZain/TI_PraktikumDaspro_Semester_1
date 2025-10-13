import java.util.Scanner;

public class Sebuahmobil {
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);

       int harga_bensin = 10000;
       double jarak_perjalanan, total_bensin, total_biaya; 
       double menghabiskan_rata_rata_1_liter_bensin = 2;

       System.out.print("Masukkan Jarak Perjalanan");
       jarak_perjalanan = sc.nextDouble();

       total_bensin = harga_bensin / menghabiskan_rata_rata_1_liter_bensin;
       total_biaya = total_bensin * harga_bensin;

       System.out.println("Total bensin: "+ total_bensin);
       System.out.println("Total biaya: "+ total_biaya);
   }
}

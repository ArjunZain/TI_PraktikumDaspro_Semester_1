import java.util.Scanner;

public class Pakjaka {
   public static void main (String[] args){
       Scanner input = new Scanner(System.in);

       int panjang, lebar, diameter, sisi, luas_tanah, luas_kolam_persegi;
       double luas_kolam_lingkaran, luas_rumput;

       System.out.print("Masukkan lebar");
       lebar = input.nextInt();
       System.out.print("Masukkan panjang");
       panjang = input.nextInt();
       System.out.print("Masukkan diameter");
       diameter = input.nextInt();
       System.out.print("Masukkan sisi");
       sisi = input.nextInt();
       luas_tanah = lebar * panjang;
       luas_kolam_lingkaran = 3.14 * diameter/2 * diameter/2 * 2;
       luas_kolam_persegi = sisi * sisi;
       luas_rumput = luas_tanah - luas_kolam_lingkaran - luas_kolam_persegi;

       System.out.println("Luas tanah: "+ luas_tanah);
       System.out.println("Luas kolam lingkaran: "+ luas_kolam_lingkaran);
       System.out.println("Luas kolam persegi: "+ luas_kolam_persegi);
       System.out.println("Luas rumput: "+ luas_rumput);

   }
}

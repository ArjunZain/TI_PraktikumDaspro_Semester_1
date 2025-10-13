import java.util.Scanner;

public class Pakali {
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);

       int lama_cicilan;
       double harga_motor;
       double uang_muka;
       double sisa_harga, bunga_per_bulan, cicilan_per_bulan;
       double bunga= 0.01;

       System.out.print("Masukkan harga motor");
       harga_motor = sc.nextDouble();
       System.out.print("Masukkan uang muka");
       uang_muka = sc.nextDouble();
       System.out.print("Masukkan lama cicilan");
       lama_cicilan = sc.nextInt();
       
       sisa_harga = harga_motor-uang_muka;
       bunga_per_bulan = bunga * sisa_harga;
       cicilan_per_bulan = (sisa_harga / lama_cicilan) + bunga_per_bulan;

       System.out.println("Sisa harga yang harus dibayar: "+ sisa_harga);
       System.out.println("Bunga per bulan: "+ bunga_per_bulan);
       System.out.println("Cicilan per bulan: "+ cicilan_per_bulan);

   }
}

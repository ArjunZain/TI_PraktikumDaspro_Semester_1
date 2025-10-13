import java.util.Scanner;

public class Bujessi {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int gaji_pokok, tunjangan_anak, jumlah_anak, total_tunjangan;
        double presentase_potongan = 0.05, gaji_bersih, potongan;

        System.out.print("Masukkan jumlah gaji pokok");
        gaji_pokok = input.nextInt();
        System.out.print("Masukkan jumlah tunjangan anak");
        tunjangan_anak = input.nextInt();
        System.out.print("Masukkan jumla anak");
        jumlah_anak = input.nextInt();

        potongan = presentase_potongan * gaji_pokok;
        total_tunjangan = jumlah_anak * tunjangan_anak;
        gaji_bersih = gaji_pokok + total_tunjangan - potongan;

        System.out.println("Potongan: "+ potongan);
        System.out.println("Total tunjangan: "+ total_tunjangan);
        System.out.println("Gaji bersih: "+ gaji_bersih);

    }
    
}

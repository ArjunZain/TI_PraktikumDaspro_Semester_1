import java.util.Scanner;

public class Tugas3 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String jenispengguna;
    int sks;

    System.out.print("Masukkan jenis pengguna: ");
    jenispengguna = sc.nextLine().trim();

    if (jenispengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses wifi diberikan(dosen)");
        } else if (jenispengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            sks = sc.nextInt();
    if (sks >= 12) {
            System.out.println("Akses wifi diberikan(mahasiswa aktif)");
        } else {
            System.out.println("Akses wifi ditolak");
        }
        } else {
            System.out.println("Akses wifi ditolak, pengguna bukan dosen maupun mahasiswa");
    }
}
}

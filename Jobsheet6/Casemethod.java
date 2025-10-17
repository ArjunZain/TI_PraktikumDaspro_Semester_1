import java.util.Scanner;

public class Casemethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        double uts1, uas1, tugas1, uts2, uas2, tugas2;
        double nilai_akhir1, nilai_akhir2, rata_rata;
        String huruf1, huruf2, status1, status2, statusSemester;

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        nama = sc.nextLine().trim();
        System.out.print("NIM  : ");
        nim = sc.nextLine().trim();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugas1 = sc.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugas2 = sc.nextDouble();
        
        nilai_akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        nilai_akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        rata_rata = (nilai_akhir1 + nilai_akhir2) / 2;

        if (nilai_akhir1 >= 80) {huruf1 = "A";}
        else if (nilai_akhir1 >= 70) {huruf1 = "B";}
        else if (nilai_akhir1 >= 60) {huruf1 = "C";}
        else {huruf1 = "D";}

        if (nilai_akhir2 >= 80) {huruf2 = "A";}
        else if (nilai_akhir2 >= 70) {huruf2 = "B";}
        else if (nilai_akhir2 >= 60) {huruf2 = "C";}
        else {huruf2 = "D";}

        if (nilai_akhir1 >= 60) {status1 = "Lulus";
} else {status1 = "Tidak Lulus";
}
if (nilai_akhir2 >= 60) {status2 = "Lulus";
} else {status2 = "Tidak Lulus";
}

if (rata_rata >= 70) {
    statusSemester = "LULUS";
} else {
    statusSemester = "TIDAK LULUS (Rata-rata < 70)";
}

        System.out.println("\n=== HASIL PENILAIAN AKADEMIK===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman" + "\t" + uts1 + "\t" + uas1 + "\t" + tugas1 + "\t" + nilai_akhir1 + "\t\t" + huruf1 + "\t\t" + status1);
        System.out.println("Struktur Data" + "\t\t" + uts2 + "\t" + uas2 + "\t" + tugas2 + "\t" + nilai_akhir2 + "\t\t" + huruf2 + "\t\t" + status2);
        System.out.println("\nRata-rata Nilai Akhir: " + rata_rata);
        System.out.println("Status Semester      : " + statusSemester);

    }
}

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int angka = 1; angka <= n; angka++) {

            int jumlah = 0;
            String deret = "";

            for (int i = 1; i <= angka; i++) {
                int kuadrat = i * i;
                jumlah += kuadrat;
                deret += kuadrat;

                if (i < angka) {
                    deret += " + ";
                }
            }

            System.out.println("n = " + angka + " -> jumlah kuadrat = " + deret + " = " + jumlah);
        }
    }
}

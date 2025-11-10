import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar",
            "Kopi Hitam",
            "Es Teh", 
            "Es Jeruk"};
        
        System.out.println("Menu yang tersedia:");
        for (String item : menu) {
            System.out.println(item);
        }

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String key = sc.nextLine();
        boolean ditemukan = false;
        
        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan/minuman tersedia di menu");
        } else {
            System.out.println("Makanan/minuman tidak tersedia di menu");
        }
    }
}

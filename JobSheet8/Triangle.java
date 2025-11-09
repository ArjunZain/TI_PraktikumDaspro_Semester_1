import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n, i =1, j;

    System.out.print("Masukkan nilai n = ");
    n = sc.nextInt();

   while (i <= n) {
    j =1;
    while (j <= i) {
    System.out.print("*");
    j++;
    }
System.out.println();
i++;
        }
    }
}

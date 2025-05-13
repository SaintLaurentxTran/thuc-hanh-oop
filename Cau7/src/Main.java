import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        double soCP = Math.sqrt(n);

        if (soCP == (int) soCP) {
            System.out.println( n + " la so nguyen!");
        }
        else {
            System.out.println( n + " khong phai la so nguyen.");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số km: ");
        double soKm = scanner.nextDouble();

        double fare;

        if (soKm <= 1) {
            fare = 5000;
        } else if (soKm <= 30) {
            fare = 5000 + (soKm - 1) * 4000;
        } else {
            fare = 5000 + 29 * 4000 + (soKm - 30) * 3000;
        }

        System.out.printf("Số tiền phải trả cho " + soKm + " km la: " + fare + "d");

        scanner.close();
    }
}
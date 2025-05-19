import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số a, b, c từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Xử lý trường hợp a = 0 (phương trình trở thành bậc nhất)
        if (a == 0) {
            if (b == 0) {
                // Phương trình trở thành bx + c = 0 => x = -c/b
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("Nghiệm 1: x1 = " + x1);
                System.out.println("Nghiệm 2: x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có một nghiệm kép:");
                System.out.println("Nghiệm: x = " + x);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phức:");
                System.out.println("Nghiệm 1: x1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Nghiệm 2: x2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }

        scanner.close();
    }
}
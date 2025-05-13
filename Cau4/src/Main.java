import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một ký tự
        System.out.print("Nhập vào một ký tự: ");
        String input = scanner.nextLine();

        // Kiểm tra nếu đầu vào là một ký tự hợp lệ
        if (input.length() == 1) {
            char kiTu = input.charAt(0);  // Lấy ký tự đầu tiên trong chuỗi nhập vào

            // Kiểm tra điều kiện
            if (Character.isUpperCase(kiTu)) {
                System.out.println("CHUHOA");
            } else if (Character.isLowerCase(kiTu)) {
                System.out.println("CHUTHUONG");
            } else if (Character.isDigit(kiTu)) {
                int so = Character.getNumericValue(kiTu); // Chuyển ký tự sang số
                if (so % 2 == 0) {
                    System.out.println("SOCHAN");
                } else {
                    System.out.println("SOLE");
                }
            } else {
                System.out.println("Ký tự không hợp lệ");
            }
        } else {
            System.out.println("Vui lòng nhập vào chỉ một ký tự.");
        }
    }
}
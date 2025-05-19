import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot thang trong nam: ");
        int thang = sc.nextInt();
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("Thang " + thang + " co 31 ngay.");
        }
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Thang " + thang + " co 30 ngay.");
        }
        else if (thang == 2) {
            System.out.println("Nhap vao mot nam: ");
            int nam = sc.nextInt();
            if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
                System.out.println("Nam " + nam + " la nam nhuan co 29 ngay.");
            }
            else {
                System.out.println("Nam " + nam + " khong phai la nam nhuan co 28 ngay.");
            }
        }
        else {
            System.out.println("This month is invalid");
        }

    }
}


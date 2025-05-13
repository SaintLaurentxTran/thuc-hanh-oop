import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b: ");
        float b = sc.nextFloat();

        if (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            float x = - b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }

    }
}
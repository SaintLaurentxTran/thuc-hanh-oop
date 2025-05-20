import java.util.Scanner;

public class DEMO {
    public static void main(String[] args) {
        PHANSO p1 = new PHANSO();
        System.out.print("p1 = ");
        p1.xuatPs();
        System.out.println();


        PHANSO p2 = new PHANSO(4 , 16);
        System.out.print("p2 = ");
        p2.xuatPs();
        System.out.println();

        System.out.println("Nhap tu mau");
        int t, m;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        m = sc.nextInt();


        PHANSO p3 = new PHANSO(t , m);
        System.out.print("p3 =");
        p3.xuatPs();
        System.out.println("");

        System.out.print("p1 + p3 = ");
        (p1.congPs(p3)).xuatPs();
        System.out.println("");


        PHANSO p4 = new PHANSO(p1.congPs(p3));
        System.out.print("p2 * p4 = ");
        (p2.nhanPs(p4)).xuatPs();
    }
}
import java.util.Scanner;

public class PHANSO {
    private int tu;
    private int mau;

    public PHANSO(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PHANSO() {
        this.tu = 0;
        this.mau = 1;
    }

    public PHANSO(PHANSO B) {
        this.tu = B.tu;
        this.mau = B.mau;
    }


    public void nhapPs(){
        System.out.println("Nhap tu va mau: ");
        Scanner sc = new Scanner(System.in);
        this.tu = sc.nextInt();
        this.mau = sc.nextInt();
    }
    public void xuatPs(){
        rutGon();
        if (this.tu == 0 ) System.out.println(0);
        else if (this.mau == 1) System.out.println(this.tu);
        else if (this.tu == this.mau) System.out.println(1);
        else System.out.println(this.tu + "/" + this.mau);
    }
    public int ucln(){
        int a = this.tu;
        int b = this.mau;
        while (b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public void rutGon(){
        int tmp = ucln();
        this.tu /= tmp;
        this.mau /= tmp;
    }
    public PHANSO congPs(PHANSO b){
        PHANSO tmp = new PHANSO();

        tmp.tu = this.tu * b.mau + b.tu * this.mau;
        tmp.mau = this.mau * b.mau;

        tmp.rutGon();
        return tmp;
    }
    public PHANSO truPs(PHANSO b){
        PHANSO tmp = new PHANSO();

        tmp.tu = this.tu * b.mau - b.tu * this.mau;
        tmp.mau = this.mau * b.mau;

        tmp.rutGon();
        return tmp;
    }
    public PHANSO nhanPs(PHANSO b){
        PHANSO tmp = new PHANSO();

        tmp.tu = this.tu *  b.tu;
        tmp.mau = this.mau * b.mau;

        tmp.rutGon();
        return tmp;
    }
    public PHANSO chiaPs(PHANSO b){
        PHANSO tmp = new PHANSO();

        tmp.tu = this.tu *  b.mau;
        tmp.mau = this.mau * b.tu;

        tmp.rutGon();
        return tmp;
    }
}

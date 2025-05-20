import java.util.Scanner;

public class HOCSINH {
    private String maSo;
    private String hoTen;
    private float gpa;

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    public void input(){
        System.out.print("Nhap ms: ");
        Scanner sc = new Scanner(System.in);
        this.maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap gpa: ");
        this.gpa = sc.nextFloat();

    }
    public void output(){
        System.out.println("ms: " + this.maSo + " HoTen: " + this.hoTen + " Gpa: " + this.gpa);
    }
    public void rank(){
        if (gpa < 5) System.out.println("Yeu");
        else if (gpa < 7) System.out.println("TB");
        else System.out.println("Gioi");

    }
}

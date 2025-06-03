import java.util.Scanner;

public abstract class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected double gia;
    public Sach() {
        this.maSach = null;
        this.tenSach = null;
        this.tacGia = null;
        this.gia = 0.0;
    }
    public Sach(String maSach, String tenSach, String tacGia, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public abstract double tinhGiaSauGiam();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.println("Nhap gia: ");
        gia = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Ma sach: "+maSach);
        System.out.println("Ten sach: "+tenSach);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Gia: "+gia);
    }
}

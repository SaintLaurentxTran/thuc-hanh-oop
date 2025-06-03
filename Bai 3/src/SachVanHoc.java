import java.util.Scanner;

public class SachVanHoc extends Sach{
    private int lanXuatBan;

    public SachVanHoc() {
        super();
        this.lanXuatBan = 10;
    }
    public SachVanHoc(String maSach, String tenSach, String tacGia, double gia, int lanXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lanXuatBan = lanXuatBan;
    }

    public int getLanXuatBan() {
        return lanXuatBan;
    }

    public void setLanXuatBan(int lanXuatBan) {
        this.lanXuatBan = lanXuatBan;
    }
    @Override
    public double tinhGiaSauGiam() {
        if (gia > 300000) {
            return gia * 0.8;
        }
        return gia;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lan xuat ban: ");
        lanXuatBan = sc.nextInt();
    }
    public void xuat(){
        System.out.println("\n-----Sach van hoc-----\n");
        super.xuat();
        System.out.println("Lan xuat ban: "+lanXuatBan);
    }
}
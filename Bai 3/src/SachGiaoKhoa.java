import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
    private String lop;
    private String nhaXuatBan;

    public SachGiaoKhoa() {
        super();
        this.lop = "12";
        this.nhaXuatBan = "Kim Dong";
    }
    public SachGiaoKhoa(String maSach, String tenSach, String tacGia, double gia, String lop, String nhaXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    @Override
    public double tinhGiaSauGiam() {
        if (nhaXuatBan.equalsIgnoreCase("Giao Duc")) {
            return gia * 0.9;
        }
        return gia;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lop: ");
        lop = sc.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }
    public void xuat(){
        System.out.println("\n-----Sach giao khoa-----\n");
        super.xuat();
        System.out.println("Lop: "+lop);
        System.out.println("Nha xuat ban: "+nhaXuatBan);
    }
}
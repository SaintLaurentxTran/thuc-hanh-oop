import java.util.Scanner;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private  int congSuat;

    public HangDienMay() {
        super();
        thoiGianBaoHanh = 0;
        dienAp = 0;
        congSuat = 0;
    }
    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getDienAp() {
        return dienAp;
    }

    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap thoi gian bao hanh: ");
        Scanner sc = new Scanner(System.in);
        this.thoiGianBaoHanh = sc.nextInt();
        System.out.println("Nhap dien ap: ");
        this.dienAp = sc.nextInt();
        System.out.println("Nhap cong suat: ");
        this.congSuat = sc.nextInt();
    }
    @Override
    public void xuat() {
        System.out.println("-----Hang hoa vua nhap-----");
        super.xuat();
        System.out.print(" || Thoi gian bao hanh(nam): " + this.thoiGianBaoHanh + " || " +
                "Dien ap(A): " + this.dienAp + " || " +
                "Cong suat(W): " + this.congSuat
        );
    }


}



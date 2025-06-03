import java.util.Scanner;

public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected long donGia;

    public HangHoa() {
        maHang = "";
        tenHang = "";
        donGia = 0;
    }

    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public void nhap() {
        System.out.println("Nhap ma hang: ");
        Scanner sc = new Scanner(System.in);
        this.maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = sc.nextLong();
    }

    public void xuat() {
        System.out.print("Ma hang: " + this.maHang + " || " +
                "Ten hang: " + this.tenHang + " || " +
                "Don gia: " + this.donGia
        );
    }

}

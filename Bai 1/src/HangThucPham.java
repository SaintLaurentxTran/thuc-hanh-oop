import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HangThucPham extends HangHoa {
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public HangThucPham() {
        ngaySanXuat = LocalDate.now();
        ngayHetHan = LocalDate.now();
    }

    public HangThucPham(String maHang, String tenHang, long donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dinhDang = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nhap ngay san xuat (dd/MM/yyyy): ");
        String nsx = sc.nextLine();
        this.ngaySanXuat = LocalDate.parse(nsx, dinhDang);
        System.out.println("Nhap ngay het han (dd/MM/yyyy): ");
        String nhh = sc.nextLine();
        this.ngayHetHan = LocalDate.parse(nhh, dinhDang);


    }

    @Override
    public void xuat() {
        System.out.println("-----Hang hoa vua nhap-----");
        super.xuat();
        System.out.print(" || Ngay san xuat: " + this.ngaySanXuat + " || " +
                "Ngay het han: " + this.ngayHetHan
        );
    }
}

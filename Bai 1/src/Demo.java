import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        HangHoa mayLanh = new HangDienMay("111", "Maylanh", 5000000, 365, 12, 1200);
//        mayLanh.xuat();
//        HangHoa migoi = new HangThucPham();
//        migoi.nhap();
//        migoi.xuat();
        byte chon, loai;
        Scanner doc = new Scanner(System.in);
        DSHangHoa dshh = new DSHangHoa();
        HangHoa h;
        do {
            System.out.println("\n1: Them mot mat hang vao danh sach");
            System.out.println("2: Xuat mat hang theo loai");
            System.out.println("0: Thoat");
            System.out.println("Chon chuc nang:");
            chon = doc.nextByte();
            switch (chon) {
                case 1:
                    System.out.println("1: Hang dien may" +
                                        "\n2: Hang thuc pham. " +
                                        "\nHay chon loai mat hang:");
                    loai = doc.nextByte();
                    if (loai == 1)
                        h = new HangDienMay();
                    else
                        h = new HangThucPham();
                    h.nhap();
                    dshh.themMatHang(h);
                    break;
                case 2:
                    System.out.println("Xuat danh sach mat hang:" +
                                        "\n1.Dien may" +
                                        "\n2.Thuc pham:");
                    loai = doc.nextByte();
                    dshh.xuatDanhSachTheoLoai(loai);
                    break;
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);
    }
}

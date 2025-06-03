import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        byte chon, loai;
        Scanner sc = new Scanner(System.in);
        DanhSachSach dss = new DanhSachSach();
        Sach h;

        do{
            System.out.println("\n1:Them mot sach vao danh sach");
            System.out.println("2:Xuat danh sach theo loai");
            System.out.println("3:Xuat thong tin va gia sau khi giam");
            System.out.println("4:Tim sach co gia sau giam lon nhat");
            System.out.println("0:Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextByte();
            sc.nextLine();
            switch(chon){
                case 1:
                    System.out.print("1:Sach van hoc." +
                                    "\n2:Sach giao khoa." +
                                    "\nChon loai sach: ");
                    loai = sc.nextByte();
                    sc.nextLine();
                    if (loai == 1)
                        h = new SachVanHoc();
                    else
                        h = new SachGiaoKhoa();
                    h.nhap();
                    dss.themSach(h);
                    break;
                case 2:
                    System.out.print("Xuat sach." +
                                    "\n1. Van hoc." +
                                    "\n2. Giao khoa.");
                    loai = sc.nextByte();
                    dss.xuatDanhSachTheoLoai(loai);
                    break;
                case 3:
                    System.out.println("Danh sach va gia sau khi giam");
                    dss.xuatTatCa();
                    break;
                case 4:
                    System.out.println("Sach co gia sau giam cao nhat");
                    Sach max = dss.timSachGiaCaoNhatSauGiam();
                    if (max != null) {
                        max.xuat();
                    } else {
                        System.out.println("Rong.");
                    }
                    break;
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySanPham qlsp = new QuanLySanPham();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== QUẢN LÝ SẢN PHẨM ===");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Hiển thị tất cả sản phẩm");
            System.out.println("4. Tìm sản phẩm theo loại");
            System.out.println("5. Hiển thị sản phẩm theo khoảng giá");
            System.out.println("6. Tìm sản phẩm theo nhà sản xuất");
            System.out.println("7. Lưu danh sách vào tệp");
            System.out.println("8. Đọc dữ liệu từ tệp");
            System.out.println("9. Thoat");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Thêm sản phẩm mới:");
                    System.out.print("Loại (\n1. Điện thoại, \n2. Laptop, \n3. Máy tính bảng): ");
                    int loai = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Mã sản phẩm: ");
                    String ma = scanner.nextLine();
                    System.out.print("Tên nhà sản xuất: ");
                    String nsx = scanner.nextLine();
                    System.out.print("Giá bán (triệu vnđ): ");
                    double gia = scanner.nextDouble();
                    scanner.nextLine();

                    if (loai == 1) {
                        System.out.print("Hệ điều hành: ");
                        String hdh = scanner.nextLine();
                        System.out.print("Kích thước màn hình (inch): ");
                        double ktmh = scanner.nextDouble();
                        qlsp.addProduct(new Phone(ma, nsx, gia, hdh, ktmh));
                    } else if (loai == 2) {
                        System.out.print("RAM (GB): ");
                        int ram = scanner.nextInt();
                        System.out.print("Dung lượng ổ cứng (GB): ");
                        int ocung = scanner.nextInt();
                        qlsp.addProduct(new Laptop(ma, nsx, gia, ram, ocung));
                    } else if (loai == 3) {
                        System.out.print("Dung lượng pin (mAh): ");
                        int pin = scanner.nextInt();
                        System.out.print("Trọng lượng (kg): ");
                        double tl = scanner.nextDouble();
                        qlsp.addProduct(new Tablet(ma, nsx, gia, pin, tl));
                    }
                    System.out.println("\nĐã thêm sản phẩm thành công!");
                    break;

                case 2:
                    System.out.print("\nNhập mã sản phẩm cần xóa: ");
                    String maXoa = scanner.nextLine();
                    qlsp.removeProduct(maXoa);
                    System.out.println("\nSản phẩm đã được xóa!");
                    break;

                case 3:
                    System.out.println("\nDanh sách sản phẩm:");
                    qlsp.allProduct();
                    break;

                case 4:
                    System.out.print("\nLoại sản phẩm cần tìm (\n1. Điện thoại, \n2. Laptop, \n3. Máy tính bảng): ");
                    int loaiTim = scanner.nextInt();
                    if (loaiTim == 1) qlsp.searchByType(Phone.class);
                    else if (loaiTim == 2) qlsp.searchByType(Laptop.class);
                    else if (loaiTim == 3) qlsp.searchByType(Tablet.class);
                    break;

                case 5:
                    System.out.print("\nNhập giá thấp nhất: ");
                    double min = scanner.nextDouble();
                    System.out.print("\nNhập giá cao nhất: ");
                    double max = scanner.nextDouble();
                    qlsp.byPrice(min, max);
                    break;

                case 6:
                    System.out.print("\nNhập tên nhà sản xuất: ");
                    String nsxTim = scanner.nextLine();
                    qlsp.searchByManu(nsxTim);
                    break;
                case 7:
                    qlsp.luuDuLieuVaoFile();
                case 8:
                    qlsp.docDuLieuTuFile();
                case 9:
                    System.out.println("\nThoát chương trình!");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nLựa chọn không hợp lệ!");
            }
        }
    }
}

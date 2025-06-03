public class DSHangHoa {
    private int soLuong = 0;
    private HangHoa[] danhSach = new HangHoa[100];

    public void themMatHang(HangHoa h) {
        danhSach[soLuong++] = h;
    }
    public void xuatDanhSachTheoLoai (byte loai) {
        for (int i=0; i<soLuong; i++) {
            if (loai == 1 && danhSach[i] instanceof HangDienMay)
                danhSach[i].xuat();
            if (loai != 1 && danhSach[i] instanceof HangThucPham)
                danhSach[i].xuat();
        }
    }
}

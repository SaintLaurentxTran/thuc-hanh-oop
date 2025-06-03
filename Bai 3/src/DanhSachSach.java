public class DanhSachSach {
    private Sach[] danhSach;
    private int soLuong;
    public DanhSachSach(){
        danhSach = new Sach[100];
        soLuong = 0;
    }
    public void themSach(Sach h){
        danhSach[soLuong++] = h;
    }
    public void xuatDanhSachTheoLoai(byte loai){
        for (int i = 0; i < soLuong; i++){
            if (loai == 1 && danhSach[i] instanceof SachVanHoc){
                danhSach[i].xuat();
//                System.out.println("Gia sau giam: " + danhSach[i].tinhGiaSauGiam());
            } else if (loai == 2 && danhSach[i] instanceof SachGiaoKhoa) {
                danhSach[i].xuat();
//                System.out.println("Gia sau giam: " + danhSach[i].tinhGiaSauGiam());
            }
        }
    }
    public void xuatTatCa() {
        for (int i = 0; i < soLuong; i++) {
            danhSach[i].xuat();
            System.out.println("Gia sau giam: " + danhSach[i].tinhGiaSauGiam());
        }
    }
    public Sach timSachGiaCaoNhatSauGiam() {
        if (soLuong == 0) return null;
        Sach max = danhSach[0];
        for (int i = 1; i < soLuong; i++) {
            if (danhSach[i].tinhGiaSauGiam() > max.tinhGiaSauGiam()) {
                max = danhSach[i];
            }
        }
        return max;
    }
}
import java.util.Scanner;

public class NHANVIEN {
    private String ms , hoTen;
    static float lcb;
    static int slnv = 0;
    private float hsl;

    public NHANVIEN(String ms, String hoTen, float hsl) {
        this.ms = ms;
        this.hoTen = hoTen;
        this.hsl = hsl;
    }
    public NHANVIEN() {
        this.ms = "";
        this.hoTen = "";
        this.hsl = 0;
    }

    public NHANVIEN(NHANVIEN b) {
        this.ms = b.ms;
        this.hoTen = b.hoTen;
        this.hsl = b.hsl;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public static float getLcb() {
        return lcb;
    }

    public static void setLcb(float lcb) {
        NHANVIEN.lcb = lcb;
    }

    public static int getSlnv() {
        return slnv;
    }

    public static void setSlnv(int slnv) {
        NHANVIEN.slnv = slnv;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public void input(){
        System.out.print("Nhap ms: ");
        Scanner sc = new Scanner(System.in);
        this.ms = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap hsl: ");
        this.hsl = sc.nextFloat();

    }


    static void slnv(){
        System.out.println("So luong nhan vien: " + slnv);
    }

    public double luong(){
        return hsl * lcb;
    }
}


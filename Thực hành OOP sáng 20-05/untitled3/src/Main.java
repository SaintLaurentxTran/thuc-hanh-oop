public class Main {
    public static void main(String[] args) {

    NHANVIEN nv1 = new NHANVIEN("111" , "nva" , 2.4f);
    NHANVIEN nv2 = new NHANVIEN("112" , "nvb" , 2.5f);
    NHANVIEN nv3 = new NHANVIEN("113" , "nvc" , 2.6f);

    float max = nv1.getHsl();
    if (nv2.getHsl() > max) max = nv2.getHsl();
    if (nv3.getHsl() > max) max = nv3.getHsl();
    System.out.println("HSL cao nhat trong 3 nhan vien la " + max);




    }
}
public class Main {
    public static void main(String[] args) {
        TamGiac a = new TamGiac(3 , 4 ,  5);
        a.loaiTamGiac();
        System.out.println("Chu vi: " + a.chuVi());
        System.out.println("Dien tich: "+ a.dienTich() );
    }
}
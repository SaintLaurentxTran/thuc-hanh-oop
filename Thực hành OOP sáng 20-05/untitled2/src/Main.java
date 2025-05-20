public class Main {
    public static void main(String[] args) {
        COODINATE a = new COODINATE();
        COODINATE b = new COODINATE(1 , 2);


        System.out.println("Toa do thu 1: " +a.toString());
        System.out.println("Toa do thu 2: " +b.toString());

        System.out.println("Tong cac thanh phan: ");
        a.tong2Diem(b);

        System.out.println("Doi xung qua truc hoanh cua b: " + (b.dxQuaHoanh().toString()) );


    }
}
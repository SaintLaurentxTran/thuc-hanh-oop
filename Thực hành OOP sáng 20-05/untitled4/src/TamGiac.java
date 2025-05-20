public class TamGiac {
    private int a , b , c;

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void loaiTamGiac(){
        if (a + b < c || b + c < a || a + c < b) System.out.println("Khong hop le");
        else{
            if (a == b || a == c ) System.out.println("Deu");
            else if (a == b || a == c || b == c) System.out.println("Can");
            else if (a * a == b*b + c * c ||b * b == a*a + c * c || c * c == b*b + a * a) System.out.println("Vuong");
            else if (a * a > b*b + c * c ||b * b > a*a + c * c || c * c > b*b + a * a) System.out.println("Tu");
            else System.out.println("Nhon");
        }
    }

    public int chuVi(){
        return a + b + c;
    }
    public double dienTich(){
        return (a + c + b) / 2.0;
    }

}

public class PhuongTrinhBacNhat {
    private int a , b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public PhuongTrinhBacNhat() {

    }

    public PhuongTrinhBacNhat(PhuongTrinhBacNhat p) {
        this.a = p.a;
        this.b = p.b;
    }
    public void giaiPt(){
        if (a != 0 ){
            System.out.printf("%.2f" , 1.0 * -b / a);
        }else {
            if (b != 0 ) System.out.println("None");
            else System.out.println("Countless");
        }
    }

    @Override
    public String toString() {
        return "PhuongTrinhBacNhat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

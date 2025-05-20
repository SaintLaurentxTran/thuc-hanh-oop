import java.sql.SQLOutput;

public class COODINATE {
    private float x , y;

    public COODINATE(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public COODINATE() {
        this.x = 0;
        this.y = 0;
    }
    public void tong2Diem(COODINATE b){
        System.out.println("Tong x: " + this.x + b.x);
        System.out.println("Tong y: " + this.y + b.y) ;
    }

    public COODINATE dxQuaHoanh(){
        COODINATE a = new COODINATE(this.x, -this.y);
        return a;
     }

    @Override
    public String toString() {
        return "COODINATE{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Tablet extends Product {
    protected int batteryCapacity;
    protected double weight;

    public Tablet(String code, String manufacturer, double price, int batteryCapacity, double weight) {
        super(code, manufacturer, price);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    @Override
    public void output() {
        System.out.println("May tinh bang: " + code);
        System.out.println("Nha san xuat: " + manufacturer);
        System.out.println("Gia ban (trieu): " + price);
        System.out.println("Dung luong pin (mAh): " + batteryCapacity);
        System.out.println("Trong luong (gram): " + weight);
    }
}

public class Laptop extends Product {
    protected int ram;
    protected int diskCapacity;

    public Laptop(String code, String manufacturer, double price, int ram, int diskCapacity) {
        super(code, manufacturer, price);
        this.ram = ram;
        this.diskCapacity = diskCapacity;
    }

    @Override
    public void output() {
        System.out.println("Laptop: " + code);
        System.out.println("Nha san xuat: " + manufacturer);
        System.out.println("Gia ban (trieu): " + price);
        System.out.println("Dung luong ram (GB): " + ram);
        System.out.println("Dung luong o cung (GB): " + diskCapacity);
    }
}

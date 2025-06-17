public class Phone extends Product {
    protected String os;
    protected double screenSize;

    public Phone(String code, String manufacturer, double price, String os, double screenSize) {
        super(code, manufacturer, price);
        this.os = os;
        this.screenSize = screenSize;
    }

    @Override
    public void output() {
        System.out.println("Điện thoại: " + code);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Giá bán (triệu): " + price);
        System.out.println("He dieu hanh: " + os);
        System.out.println("Kich thuoc man hinh (inch): " + screenSize);
    }
}

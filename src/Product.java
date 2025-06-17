public abstract class Product {
    protected String code;
    protected String manufacturer;
    protected double price;


    public Product(String code, String manufacturer, double price) {
        this.code = code;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void output();
}

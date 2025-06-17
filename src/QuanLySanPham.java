import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class QuanLySanPham {
    private List<Product> dsSP = new ArrayList<>();

    public void addProduct(Product product) {
        dsSP.add(product);
    }

    public void removeProduct(String code) {
        for (int i=0; i<dsSP.size(); i++) {
            if (dsSP.get(i).getCode().equals(code)) {
                dsSP.remove(i);
                break;
            }
        }
    }

    public void allProduct() {
        for (Product product : dsSP) {
            product.output();
        }
    }

    public void searchByType(Class <?> loai) {
        for (Product product : dsSP) {
            if (product.getClass().equals(loai))
                product.output();
        }
    }

    public void byPrice(double min, double max) {
        for (Product product : dsSP) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
                product.output();
            }
        }
    }

    public void searchByManu(String manu) {
        for (Product product : dsSP) {
            if (product.getManufacturer().equalsIgnoreCase(manu)) {
                product.output();
            }
        }
    }

    public void luuDuLieuVaoFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sanpham.txt"))) {
            oos.writeObject(dsSP);
            System.out.println("Dữ liệu đã được lưu vào tệp.");
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu dữ liệu: " + e.getMessage());
        }
    }

    public void docDuLieuTuFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sanpham.txt"))) {
            dsSP = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc dữ liệu: " + e.getMessage());
        }
    }
}

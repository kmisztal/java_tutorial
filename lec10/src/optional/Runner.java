package optional;

import java.util.Optional;

class Product {

    private long productID;
    private String productName;

    public Product() {
    }

    public Product(long productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public Optional getProductName() {
        return Optional.ofNullable(productName);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                '}';
    }
}

public class Runner {
    public static void main(String[] args) {
//        Product cup = new Product(10, "Cup");
        Product cup = new Product();
//        if (cup.getProductName() != null) {
//            if (cup.getProductName().get().equals("Cup")) {
//                System.out.println("Cup!");
//            }
//        }

        cup.getProductName().filter(x -> x.equals("Cup")).ifPresent(System.out::println);
        System.out.println(cup.getProductName().filter(x -> x.equals("Cup")).orElse("No such object"));
    }
}

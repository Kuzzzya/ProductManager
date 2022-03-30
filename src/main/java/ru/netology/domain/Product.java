package ru.netology.domain;

public class Product {
    private int id;
    private String name;
    private int productPrice;

    public Product(int id, String name, int productPrice) {
        this.id = id;
        this.name = name;
        this.productPrice = productPrice;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return id == product.id && productPrice == product.productPrice && Objects.equals(name, product.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, productPrice);
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", productPrice=" + productPrice +
//                '}';
//    }
//}

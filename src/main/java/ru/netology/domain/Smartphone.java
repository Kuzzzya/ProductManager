package ru.netology.domain;


public class Smartphone extends Product {
    private String name;
    private String manufactured;

    public Smartphone(int id, String name, int productPrice, String name1, String manufactured) {
        super(id, name, productPrice);
        this.name = name1;
        this.manufactured = manufactured;
    }

    public Smartphone(String name, String manufactured) {
        this.name = name;
        this.manufactured = manufactured;
    }
}
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getManufactured() {
//        return manufactured;
//    }
//
//    public void setManufactured(String manufactured) {
//        this.manufactured = manufactured;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Smartphone that = (Smartphone) o;
//        return Objects.equals(name, that.name) && Objects.equals(manufactured, that.manufactured);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), name, manufactured);
//    }
//
//    @Override
//    public String toString() {
//        return "Smartphone{" +
//                "name='" + name + '\'' +
//                ", manufactured='" + manufactured + '\'' +
//                '}';
//    }
//}

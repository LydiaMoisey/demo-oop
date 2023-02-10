package by.itacademy.moiseenkolydia.javabasics.oop;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int productionYear;
    private String color;
    private  double price;
    private String licensePlate;

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

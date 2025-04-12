package walmart;

public class Product {
    private String name;
    private double costPrice;
    private double sellingPrice;
    private int unitsSold;

    public Product(String name, double costPrice, double sellingPrice, int unitsSold) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.unitsSold = unitsSold;
    }

    public String getName() { return name; }
    public double getCostPrice() { return costPrice; }
    public double getSellingPrice() { return sellingPrice; }
    public int getUnitsSold() { return unitsSold; }
}
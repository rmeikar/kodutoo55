package kodutoo5;


public class Product {
    private int number;
    private String name;
    private int units;
    private double price;
    private Vendor vendor;
    static int count = 0;
    public Product(String name, int units, double price) {
        count++;
        this.number = count;
        this.name = name;
        this.units = units;
        this.price = price;

    }
    @Override
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", units=" + units +
                ", price=" + price +
                ", value=" + value() +
                ", " + ((vendor != null) ? vendor.toString() : "not assigned")
                + "}";
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getPrice() {
        return roundAvoid(price, 2);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double value(){
        return roundAvoid(units *price, 2);
    }
}

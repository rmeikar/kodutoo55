package kodutoo5;

public class Golden extends Product {
    private int number;
    private Vendor vendor;
    private Boolean golden=Boolean.TRUE;
    public Golden(int number, String name, int units, double price, Vendor vendor) {
        super(name, units, price);
        this.number = number;
        this.vendor = vendor;
    }

    @Override
    public double value(){
        return getUnits()*getPrice()*1.05;
    }
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", name='" + getName() + '\'' +
                ", units=" + getUnits() +
                ", price=" + getPrice() +
                ", value=" + roundAvoid(value()*1.05, 2) +
                ", golden=" + golden +
                ", " + ((vendor != null) ? vendor.toString() : "not assigned") +
                "}";
    }
}

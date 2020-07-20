package sistemadefacturacion;

public class Item {
    private int count;
    private String description;
    private double price;

    public Item(int number, String description, double price) {
        this.count = number;
        this.description = description;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-9d %-31s %-11.2f   %.2f\n", getCount(), getDescription(), getPrice(), getPrice() * getCount());
    }
}

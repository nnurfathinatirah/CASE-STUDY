public class Product {
    private int itemNo;
    private String description;
    private double price;
    private int quantity;
    private double total;

    public Product(int itemNo, String description, double price) {
        this.itemNo = itemNo;
        this.description = description;
        this.price = price;
        this.quantity = 0;
        this.total = 0;
    }

    public int getItemNo() {
        return itemNo;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.total = this.price * this.quantity;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return itemNo + " " + description + " - RM" + price + " x " + quantity + " = RM" + total;
    }
}
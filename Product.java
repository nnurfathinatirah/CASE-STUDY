public class Product {
    private int itemNo;
    private String description;
    private double price;
    private int quantity;
    private double total;

    public Product(int itemNo, String description, double price, int quantity) {
        this.itemNo = itemNo;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }
//getter
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
//setter

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
  
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.total = price * quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
    //update total cost based on quantity
    public void updateTotal() {
        this.total = price * quantity;
    }

    @Override
    public String toString() {
         return itemNo + " " + description + " - $" + price + " x " + quantity + " = $" + total;
    }
    
}


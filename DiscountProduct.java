public class DiscountProduct extends Product {

    public DiscountProduct(int itemNo, String description, double price) {
        super(itemNo, description, price);
    }

   

    @Override
    public double applyDiscount() {
        double discount = 0;
        if (super.getTotal() > 20) {
            discount = super.getTotal() * 0.25; // 25% discount if total is more than $20
            super.setTotal(super.getTotal() - discount);
        }
        return discount;
    }

    
    
}

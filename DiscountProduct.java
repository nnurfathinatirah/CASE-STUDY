public class DiscountProduct{

    public DiscountProduct() {
    }

    public double applyDiscount(double totalAmount) {
        double discount = 0;
        if (totalAmount> 20) {
            discount = totalAmount * 0.25; // 25% discount if total is more than $20
            totalAmount -= discount;
        }
        return discount;
    }

    
    
}

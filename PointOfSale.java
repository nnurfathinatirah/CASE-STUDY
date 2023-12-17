public class PointOfSale {
    private static final double GST = 0.06;

    public void processPayment(double amountPaid, double totalAmount) {
        if (amountPaid >= totalAmount) {
            double change = amountPaid - totalAmount;
            System.out.println("Payment successful. Change: $" + change);
            printReceipt(totalAmount);
        } else {
            System.out.println("Insufficient payment. Please pay the full amount.");
        }
    }
    public void printReceipt(double totalAmount) {
        System.out.println("Thank you for shopping with us!");
        System.out.println("Total amount: $" + totalAmount);
        System.out.println("GST: $" + totalAmount * GST);
        System.out.println("Total amount (incl. GST): $" + totalAmount * (1 + GST));
    }

}

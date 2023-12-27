import java.util.Scanner;
import java.text.DecimalFormat;

public class PointOfSale {
    private static final double GST = 0.06;
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public void CalculateTotal(double totalAmount, double totalDiscount) {
        Scanner scanner = new Scanner(System.in);
        double totalAfterDis = totalAmount - totalDiscount;
        double grandTotal = totalAfterDis + (totalAfterDis * GST);

        System.out.println("Total amount: RM" + decimalFormat.format(totalAmount));
        System.out.println("Total amount after discount: RM" + decimalFormat.format(totalAfterDis));
        System.out.println("Total amount (incl. GST): RM" + decimalFormat.format(grandTotal));

        System.out.print("Enter amount paid: RM");
        double amountPaid = scanner.nextDouble();
        processPayment(amountPaid, grandTotal);
    }

    public void processPayment(double amountPaid, double grandTotal) {
        if (amountPaid >= grandTotal) {
            double change = amountPaid - grandTotal;
            System.out.println("Payment successful. Change: RM" + decimalFormat.format(change));
            printReceipt(grandTotal);
        } else {
            System.out.println("Insufficient payment. Please pay the full amount.");
        }
    }

    public void printReceipt(double grandTotal) {
        System.out.println("Thank you for shopping with us!");
        System.out.println("=============================================");
        System.out.println("Total amount (incl. GST): RM" + decimalFormat.format(grandTotal));

    }
}

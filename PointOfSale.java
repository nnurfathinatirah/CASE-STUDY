import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PointOfSale {
    private static final double GST = 0.06;
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private static final Scanner scanner = new Scanner(System.in);

    public void calculateTotal(double totalAmount, double totalDiscount) {
        double totalAfterDis = totalAmount - totalDiscount;
        double grandTotal = totalAfterDis + (totalAfterDis * GST);

        System.out.println();
        System.out.println("Subtotal      : RM" + decimalFormat.format(totalAmount));
        System.out.println("Total after discount: RM" + decimalFormat.format(totalAfterDis));
        System.out.println("Total (GST Incl.)  : RM" + decimalFormat.format(grandTotal));

        System.out.print("Enter amount paid : RM");
        double amountPaid = getValidAmountPaid();
        processPayment(amountPaid, grandTotal);
    }

    
    private double getValidAmountPaid() {

        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        }
    }

    private void processPayment(double amountPaid, double grandTotal) {
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

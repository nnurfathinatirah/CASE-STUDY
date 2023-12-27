import java.util.Scanner;

public class POSTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product p1 = new Product(1, "Bread", 3.89);
        Product p2 = new Product(2, "Milk", 2.99);
        Product p3 = new Product(3, "Cereal", 4.57);
        Product p4 = new Product(4, "Juice", 6.99);
        Product p5 = new Product(5, "Yogurt", 3.79);
        Product p6 = new Product(6, "Chips", 5.99);

        Product[] products = { p1, p2, p3, p4, p5, p6 };

        System.out.println("\tWelcome to Talata Store");
        System.out.println("=============================================");
        System.out.println("Available Products:");
        for (int i = 0; i < products.length; i++) {
            Product p = products[i];
            System.out.println(p.getItemNo() + ". " + p.getDescription() + " - RM" + p.getPrice());
            System.out.print("Enter quantity for " + p.getDescription() + "\t: ");
            int quantity = scanner.nextInt();
            p.setQuantity(quantity);
        }


        double totalAmount = 0;
        double totalDiscount = 0;
        System.out.println("=============================================");
        System.out.println("Your Cart:");
        for (int i = 0; i< products.length; i++) {
            Product p = products[i];
            System.out.println(p);
            totalAmount += p.getTotal();
            totalDiscount += p.applyDiscount(); // Apply discount for each product
        }

        PointOfSale pos = new PointOfSale();
        pos.CalculateTotal(totalAmount, totalDiscount);
        DateTimeHandler.printDateTime();
        scanner.close();
    }
}

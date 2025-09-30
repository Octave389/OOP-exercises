package all;

public class Exercise49 {
    public static void main(String[] args) {

        double pricePerItem = 9.99;
        int quantity = 5;
        double total = pricePerItem * quantity;
        double discountedTotal = total * 0.8; // 20% discount

        System.out.println("Original Total: $" + total);
        System.out.println("Discounted Total (20% off): $" + discountedTotal);
    }
}

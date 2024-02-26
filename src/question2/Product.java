package question2;

public class Product implements Taxable {
    double pid;
    double price;
    int quantity;

    Product(double pid, double price, int quantity){
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;
    }
    public void calcTax() {
        double taxableAmount = (price * (salesTax / 100))*quantity;
        System.out.println("Taxable amount on " + quantity +" Product of price "+ price+ " : "+ taxableAmount);
    }
}

public class ShoppingCartSystem {

    static class Product {

        static double discount = 10.0; 

        String productName;
        double price;
        int quantity;
        final int productID;

        Product(String productName, double price, int quantity, int productID) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
            this.productID = productID;
        }

        static void updateDiscount(double newDiscount) {
            discount = newDiscount;
        }

        void process(Object obj) {
            if (obj instanceof Product) {
                Product p = (Product) obj;
                System.out.println( p.productName);
                System.out.println( p.productID);
                System.out.println(p.price);
                System.out.println(p.quantity);
                System.out.println(discount + "%");
            } else {
                System.out.println("Not a Product object");
            }
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 60000, 1, 501);
        Product p2 = new Product("Mouse", 500, 2, 502);

        Product.updateDiscount(15.0);

        p1.process(p1);
        p2.process(p2);
    }
}

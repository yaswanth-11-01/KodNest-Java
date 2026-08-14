import java.util.Scanner;

class Order {
    String item;
    int quantity;

    Order(String item) {
       
        this.item = item;
        this.quantity = 1;
    }

    Order(String item, int quantity) {
       
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();
        
        Order f1 = new Order(item);
      
        Order f2 = new Order(item, quantity);
        
        f1.display();
        f2.display();
    }
}

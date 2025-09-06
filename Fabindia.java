import java.util.*;

public class Fabindia {
    int total;

    public void dis() {
        int price = 0, total = 0;
        char ch = 'y';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Kurta");
            System.out.println("2. Saree");
            System.out.println(" Please enter you choice of clothing");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    price = 300;
                    break;
                case 2:
                    price = 200;
                    break;
                default:
                    System.out.println("Invalid Choice! Sorry!Please try again");
                    break;
            }
            System.out.println("Enter the amount of Clothes you want to buy:");
            a = sc.nextInt();
            price = price * a;
            System.out.println("Do you want to buy any more of Clothes(y/n): ");
            ch = sc.next().charAt(0);
            total = total + price;
        } while (ch == 'y' || ch == 'Y');
        System.out.println("\t\t\t\tYour Fabindia bill i: " + total + "\t\t\t\t\t");
        System.out.println("\t\t\t\tThank you for visiting Fabindiat!\t\t\t\t\t");
    }
}

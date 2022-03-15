import java.util.Scanner;

public class PassengerDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int distance ,age, route;




        System.out.println("distance: ");
        distance = input.nextInt();

        System.out.println("age: ");
        age = input.nextInt();

        System.out.println("route should be 1 or 2: ");
        route = input.nextInt();

        double price = (distance* 0.1);

        double discount1 = price-(price * 0.10);
        double discount2 = price-(price * 0.20);
        double discount3 = price-(price * 0.50);
        double discount4 = price-(price * 0.30);

        if (age <0 || distance <0 || (route != 1) && (route !=2)) {
            System.out.println("İnvalid numbers");
        }else {
            if (route == 1) {
                System.out.println("Last price with discount: " + price + "TL");
            } else if (age < 12 && age > 0) {
                System.out.println("Last price with discount: " + discount3 + "TL");
            } else if (age >= 12 && age < 24) {
                System.out.println("Last price with discount: " + discount1 + "TL");
            } else if (age >= 65) {
                System.out.println("Last price with discount: " + discount4 + "TL");
            } else if (route == 2) {
                System.out.println("your price: " + (price - (price * 0.20)));
            }
        }












    }
}

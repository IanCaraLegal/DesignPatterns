import java.util.Scanner;

public class App {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Deliver by sea or road?");

            String deliveryMethod = s.nextLine();

            Logistics l = null;

            switch (deliveryMethod) {
                case "sea":
                    l = new SeaLogistics();
                    break;
                case "road":
                    l = new RoadLogistics();
                    break;
                default:
                    System.out.println("Invalid delivery method");
            }

            System.out.println(l.planDelivery());
        }

    }
}

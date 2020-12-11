import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String [] args){

        List<House> houses = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Create a house");
            System.out.println("2 - List of houses");

            Integer option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.println("House number?");
                    Integer houseNumber = s.nextInt();
                    House.HouseBuilder b = new House.HouseBuilder(houseNumber);
                    System.out.println("House with walls? (true/false)");
                    Boolean hasWalls = s.nextBoolean();
                    if(hasWalls){
                        b.buildWalls();
                    }
                    System.out.println("House with roof? (true/false)");
                    Boolean hasRoof = s.nextBoolean();
                    if(hasRoof){
                        b.buildRoof();
                    }
                    System.out.println("House with ceiling? (true/false)");
                    Boolean hasCeiling = s.nextBoolean();
                    if(hasCeiling){
                        b.buildCeling();
                    }
                    System.out.println("House with garage? (true/false)");
                    Boolean hasGarage = s.nextBoolean();
                    if(hasGarage){
                        b.buildGarage();
                    }
                    System.out.println("House with doors? (true/false)");
                    Boolean hasDoors = s.nextBoolean();
                    if(hasDoors){
                        b.buildDoors();
                    }
                    System.out.println("House with windows? (true/false)");
                    Boolean hasWindows = s.nextBoolean();
                    if(hasWindows){
                        b.buildWindows();
                    }

                    houses.add(b.build());
                    break;
                case 2:
                    System.out.println("Choose house number to see details");
                    System.out.println("List of houses = " + houses.toString());

                    Integer choosen = s.nextInt();
                    House houseChoosen = null;

                    for(House h : houses){
                        if(h.getNumber() == choosen){
                            houseChoosen = h;
                        }
                    }

                    System.out.println(houseChoosen != null ? houseChoosen.houseDetails() : "This house number doesn't exist");

                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }

}

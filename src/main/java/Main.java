import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Adventure adventure = new Adventure(); //kalder på adventure

        //todo find ud af hvordan du flytter dette til user interface
        Scanner scanner = new Scanner(System.in); // tilføjer scanner
        //attribut
        String north = "go north";
        String east = "go east";
        String south = "go south";
        String west = "go west";
        String direction;
        /*int exit = 9;*/
        direction = scanner.nextLine();

        //todo mangler en metode til at rykke mellem rum i adventure klassen
        north.equals(adventure.goingNorth());
        east.equals((adventure.goingEast()));
        south.equals(adventure.goingSouth());
        west.equals(adventure.goingWest());

        System.out.println("Hello hero and welcome to my maze");
        System.out.println("type 9 if you are 2 scared");
        System.out.println("press enter if you accept the dangers that awaits");
        System.out.println(scanner.nextLine());




        while (true){

            System.out.println("Write go north to go north");
            System.out.println("Write go east to go east");
            System.out.println("Write go south to go south");
            System.out.println("Write go west go west");


            if (direction.equals(north)) {
                System.out.println("Going north");
            }
            if (direction.equals(east)) {
                System.out.println("Going east");
            }
            if (direction.equals(south)) {
                System.out.println("Going south");
            }
            if (direction.equals(west)) {
                System.out.println("Going west");

            }





        /*System.out.println("Write go north to go north");
        System.out.println("Write go east to go east");
        System.out.println("Write go south to go south");
        System.out.println("Write go west go west");
        Scanner scanner = new Scanner(System.in);
        String north = "go north";
        String east = "go east";
        String south = "go south";
        String west = "go west";
        String direction;

        direction = scanner.nextLine();

        if (direction.equals(north)) {
            direction
        System.out.println("Going north");
        }
        if (direction.equals(east)) {
        System.out.println("Going east");
        }
        if (direction.equals(south)) {
         System.out.println("Going south");
        }
        if (direction.equals(west)) {
            System.out.println("Going west");*/
            }
        }
    }



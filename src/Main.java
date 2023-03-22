import java.util.Scanner;

import Java.Battleship;
// import Java.Grid;
// import Java.Location;
// import Java.Player;
// import Java.Ship;


    public class Main {
        public static void main ( String[] args ) {
            Boolean start = true;
            System.out.println("Welcome to Battleship War!!!");
            System.out.println("What is your name: ");
            Scanner scanner = new Scanner(System.in);
            String userName;
            while (!scanner.hasNextLine()) {
                System.out.println("Please provide your name: ");
                scanner = new Scanner(System.in);
            }
            
            userName = scanner.nextLine();

            // Start the battleship
            Battleship battleship = new Battleship(userName, 0, 0);
            battleship.play(start);

            scanner.close();
        }
    }



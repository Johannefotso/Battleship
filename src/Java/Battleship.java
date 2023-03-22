package Java;

import java.util.Scanner;

public class Battleship {
    
    private Player userPlayer;
    private  Player computerPlayer;

    public Battleship(String name,int cols, int rows) {
        userPlayer = new Player(name, cols, rows);
        computerPlayer = new Player("Computer", cols, rows);
        
    }

    public void play(Boolean start) {
        userPlayer.placeShips();
        computerPlayer.placeShips();
        while (start){
            System.out.println(userPlayer.getName() + "'s turn");
            int row = askForGuess("row");
            int col = askForGuess("column");
            userPlayer.makeGuess(row, col, computerPlayer);
            System.out.println(computerPlayer);
        }
        

    }

    private int askForGuess (String type){
        String msg;
        
        if (type.equals("row")) {
            msg = "How many rows do you want? ";
        } else {
            msg = "How many colums do you want? ";
        }
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        // while (!scanner.hasNextInt()) {
        //     System.out.println(msg);
        // }
        int number = scanner.nextInt();
        scanner.close();
        return number;
        
    }
}
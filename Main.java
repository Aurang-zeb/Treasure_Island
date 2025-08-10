import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player = new Player(0,0); // starts at 0,0

        Island island = new Island();
        island.generateMap();

        System.out.println("🏝 Welcome to Treasure Island!");
        System.out.println("Type: north, south, east, west to move");

        while (true) {
            island.displayMap(player); // Show map
            System.out.print("Enter move: ");
            String move = input.nextLine();
            player.playerMove(move); // Move player

            if (island.isTreasure(player)) {
                System.out.println("🎉 You found the treasure! Game Over!");
                break;
            }

            if (island.isTrap(player)) {
                player.setHealth(player.getHealth()-20);
                System.out.println("💥 You hit a trap! Health = " + player.getHealth());
                if (player.getHealth()<= 0) {
                    System.out.println("💀 You died! Game Over!");
                    break;
                }
            }
        }

        input.close();
    }
}

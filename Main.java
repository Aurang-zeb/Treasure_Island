import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player player = new Player(0, 0);
        Island island = new Island();
        island.generateMap();

        System.out.println("🏝 Welcome to Treasure Island!");
        System.out.println("Commands: north, south, east, west");

        while (true) {
            island.displayMap(player);

            System.out.print("Your move: ");
            String move = input.nextLine();
            player.PlayerMove(move);

            if (island.isTreasure(player)) {
                System.out.println("🎉 You found the treasure! Game Over!");
                break;
            }

            if (island.isTrap(player)) {
                player.health -= 20;
                System.out.println("💥 Trap! Health: " + player.health);
                if (player.health <= 0) {
                    System.out.println("💀 You died! Game Over!");
                    break;
                }
            }
        }
        input.close();
    }
}

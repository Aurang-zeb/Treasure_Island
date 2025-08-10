import java.util.Random;

public class Island {
    String[][] map = new String[5][5];

    public void generateMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = ".";
            }
        }
        Random rand = new Random();
        
        // Place traps
        int trapCount = 0;
        while (trapCount < 5) {
            int x = rand.nextInt(5);
            int y = rand.nextInt(5);
            if (map[x][y].equals(".")) {
                map[x][y] = "x";
                trapCount++;
            }
        }
        // Place treasure
        while (true) {
            int x = rand.nextInt(5);
            int y = rand.nextInt(5);
            if (map[x][y].equals(".")) {
                map[x][y] = "T";
                break;
            }
        }
    }

    public void displayMap(Player player) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == player.getPositionX() && j == player.getPositionY()) {
                    System.out.print("P ");
                } else {
                    System.out.print(map[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean isTreasure(Player player) {
        return map[player.getPositionX()][player.getPositionY()].equals("T");
    }

    public boolean isTrap(Player player) {
        return map[player.getPositionX()][player.getPositionY()].equals("x");
    }
}

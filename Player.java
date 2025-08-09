public class Player {
    int PositionX;
    int PositionY;
    int health;

    public Player() {
        this.PositionX = 0;
        this.PositionY = 0;
        this.health = 100;
    }

    public void PlayerMove(String direction) {
        if (direction.equalsIgnoreCase("north") && PositionX > 0) {
            PositionX--;
        } else if (direction.equalsIgnoreCase("south") && PositionX < 4) {
            PositionX++;
        } else if (direction.equalsIgnoreCase("west") && PositionY > 0) {
            PositionY--;
        } else if (direction.equalsIgnoreCase("east") && PositionY < 4) {
            PositionY++;
        } else {
            System.out.println("❌ You can't move outside the island!");
        }
    }
}

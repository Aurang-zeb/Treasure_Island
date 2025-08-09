public class Player {
     int PositionX;
    int PositionY;
    int health;

    public Player(int PositionX, int PositionY) {
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        this.health = 100;
    }

    public void PlayerMove(String direction) {
        if (direction == null || direction.isEmpty()) {
            System.out.println("You must enter a direction to move.");
            return;
        }
        direction = direction.toLowerCase();
        if (direction.equals("north") && PositionX > 0) {
            PositionX--;
        } else if (direction.equals("south") && PositionX < 4) {
            PositionX++;
        } else if (direction.equals("west") && PositionY > 0) {
            PositionY--;
        } else if (direction.equals("east") && PositionY < 4) {
            PositionY++;
        } 
        else if(direction.equals("north") || direction.equals("south") || direction.equals("west") || direction.equals("east")) {
            System.out.println("Invalid move! You can't move in that direction.");
        }
        else {
            System.out.println("Type 'north', 'south', 'east', or 'west' to move.");
        }
    }
}

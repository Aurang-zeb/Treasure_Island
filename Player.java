// Define the Player class
public class Player {
    // Player's position on the map
    int PositionX;
    int PositionY;
    
    // Player's health points
    int health;
    
    // Constructor: initializes the player’s starting position and health
    public Player(int startX, int startY) {
        this.PositionX = startX;  // Starting X coordinate
        this.PositionY = startY;  // Starting Y coordinate
        this.health = 100; // Start with full health
    }
    
    // Method to move the player in a direction
    public void PlayerMove(String direction) {
        // Use switch to decide how to move based on direction string
        switch (direction.toLowerCase()) {

            case "north":
                PositionX--;  // move up on the grid (decreasing x)
                break;
            case "south":
                PositionX++;  // move down on the grid (increasing x)
                break;
            case "east":
                PositionY++;  // move right on the grid (increasing y)
                break;
            case "west":
                PositionY--;  // move left on the grid (decreasing y)
                break;
            default:
                System.out.println("❌ Invalid direction! Please use north, south, east, or west.");
        }
    }
}

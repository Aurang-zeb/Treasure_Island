public class Player {
     private int positionX;
    private int positionY;
    private int health;

    public Player(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = 100;
    }
    public int getPositionX() {
        return positionX;
    } 
    public int getPositionY() {
        return positionY;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health) {
        if(health>=0){
            this.health = health;
        } else {
            System.out.println("Health cannot be negative.");
        }
    }

    public void playerMove(String direction) {
        if (direction == null || direction.isEmpty()) {
            System.out.println("You must enter a direction to move.");
            return;
        }
        direction = direction.toLowerCase();
        if (direction.equals("north") && positionX > 0) {
            positionX--;
        } else if (direction.equals("south") && positionX < 4) {
            positionX++;
        } else if (direction.equals("west") && positionY > 0) {
            positionY--;
        } else if (direction.equals("east") && positionY < 4) {
            positionY++;
        } else if(direction.equals("north") || direction.equals("south") || direction.equals("west") || direction.equals("east")) {
            System.out.println("Invalid move! You can't move in that direction.");
        }
        else {
            System.out.println("Type 'north', 'south', 'east', or 'west' to move.");
        }
    }
}

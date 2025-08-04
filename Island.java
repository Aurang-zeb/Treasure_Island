import java.util.Random;

public class Island {
    String [][] map= new String[5][5]; // 2D array to represent the island map
// Create a 5x5 grid for the island map
    public void generateMap(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = "."; 
            }
        }
    Random rand = new Random();
    int TrapPlace = 0;
    while(TrapPlace<5)
    {
    int x= rand.nextInt(5);
    int y= rand.nextInt(5);

    if(map[x][y].equals(".")){
        map[x][y] = "x";
        TrapPlace++;
    }
    }
    }
   
}

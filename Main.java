public class Main {
    public static void main(String[] args) {
       Island island = new Island();
       island.generateMap(); // Generate the island map
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print(island.map[i][j] + " ");
           }
           System.out.println();
       }    
   

}}

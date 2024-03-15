
public class Find5 {
    public static void main(String args[]) {
        int [][] grid = new int [3][4];
        
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = (int)(Math.random() * 10);
            }//end for 1
        }//end for 2
       
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
            	System.out.print(grid[row][col] + " ");
            }//end for 1
            System.out.print("\n");
        }//end for 2
        
       for (int row = 0; row < grid.length; row++) {
           for(int col = 0; col < grid[0].length; col++) {
               if (grid[row][col] == 5) {
                   System.out.println("("+ row + ", " + col + ")");
               }//end if
           }//end for 1
        }//end for 2
    }//end main
}//end class


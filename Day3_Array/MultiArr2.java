public class MultiArr2 {
    public static void main(String[] args) {
        //creating array objects
        int[][] objects = {{1,2,3}, {4,5,6}};

        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects[i].length; j++) {
                  System.out.print(objects[i][j] + "\t");
            }
            System.out.println();
        }    
    }
}
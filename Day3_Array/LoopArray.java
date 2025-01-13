public class LoopArray {
    public static void main(String[] args) {
        //creating array objects
        String[] objects = {"Spoon", "Fork", "Bowl", "Salt", "Pepper"};

        for (int i = 0; i < objects.length-2; i++) {
              System.out.println(objects[i]);
        }    
    }
}